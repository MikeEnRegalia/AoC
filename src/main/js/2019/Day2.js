function createProgram() {
    const program = `1,0,0,3,1,1,2,3,1,3,4,3,1,5,0,3,2,1,10,19,1,19,5,23,1,6,23,27,1,27,5,31,2,31,10,35,2,35,6,39,1,39,5,43,2,43,9,47,1,47,6,51,1,13,51,55,2,9,55,59,1,59,13,63,1,6,63,67,2,67,10,71,1,9,71,75,2,75,6,79,1,79,5,83,1,83,5,87,2,9,87,91,2,9,91,95,1,95,10,99,1,9,99,103,2,103,6,107,2,9,107,111,1,111,5,115,2,6,115,119,1,5,119,123,1,123,2,127,1,127,9,0,99,2,0,14,0`
        .split(",")
        .map(x => parseInt(x))

    program[1] = 12
    program[2] = 2
    return Object.freeze(program)
}

const program = createProgram();

const run = (program) => [...program].reduce((result, opcode, i, program) => {
    if (result || i % 4 !== 0)
        return result

    if (opcode === 99)
        return program[0]

    const input1 = program[program[i + 1]]
    const input2 = program[program[i + 2]]
    const output = opcode === 1 ? input1 + input2 : input1 * input2
    program[program[i + 3]] = output

    return result
}, undefined)

console.info(run(program))

const range = new Array(100).fill(0)

range.forEach((_, i) => range.forEach((_, j) => {
    const tweakedProgram = [...program]
    tweakedProgram[1] = i
    tweakedProgram[2] = j
    const result = run(tweakedProgram)
    if (result === 19690720)
        console.info(i, j)
}))