package y2018.day13

import y2018.day13.Action.*
import y2018.day13.Direction.*

fun crash(input: List<String>): Pair<Pair<Int, Int>?, Pair<Int, Int>?> {
    val cars = input.mapIndexed { y, row ->
        row.mapIndexedNotNull { x, c ->
            if (c.isCar()) Car(
                Pos(x, y),
                c.toDirection(),
                TURN_LEFT
            ) else null
        }
    }.flatten().sortedWith(compareBy({ it.pos.x }, { it.pos.y }))

    val map = input.map { row -> row.map { c -> c.fixCar() } }

    var tick = 0
    val movingCars = mutableListOf<Car?>().apply { addAll(cars) }
    var firstCrashAt: Pair<Int, Int>? = null
    while (true) {
        if (map.size < 20 && tick in 0..10) {
            map.render(movingCars).also { println("$tick\n$it") }
        }
        if (movingCars.filterNotNull().size == 1) {
            break
        }
        for ((index, car) in movingCars.withIndex()) {
            if (car == null) continue
            car.moved().let {
                when (val tile = map[it.pos.y][it.pos.x]) {
                    '+' -> it.turnAtIntersection()
                    '/', '\\' -> it.copy(direction = it.direction.turnAtCorner(tile))
                    else -> it
                }
            }.also { moved ->
                movingCars[index] = moved
                val crashedCars = movingCars.filter { it?.pos == moved.pos }
                if (crashedCars.count() > 1) {
                    if (firstCrashAt == null) firstCrashAt = moved.pos.x to moved.pos.y
                    for ((index2, anotherCar) in movingCars.withIndex()) {
                        if (crashedCars.contains(anotherCar)) movingCars[index2] = null
                    }
                }
            }
        }
        tick++
    }
    val lastCarPos = movingCars.filterNotNull().firstOrNull()?.pos
    return Pair(firstCrashAt, lastCarPos?.let { Pair(it.x, it.y) })
}

fun List<List<Char>>.render(cars: MutableList<Car?>) = mapIndexed { y, row ->
    row.mapIndexed { x, c ->
        cars.firstOrNull { car ->
            car?.pos == Pos(x, y)
        }?.let { it.direction.asChar() } ?: c
    }.joinToString("")
}.joinToString("\n")

private fun Char.isCar() = this == '>' || this == '<' || this == '^' || this == 'v'

private fun Char.fixCar() = when (this) {
    '>', '<' -> '-'
    '^', 'v' -> '|'
    else -> this
}

data class Pos(val x: Int, val y: Int) {
    fun move(direction: Direction) = when (direction) {
        UP -> copy(y = y - 1)
        DOWN -> copy(y = y + 1)
        LEFT -> copy(x = x - 1)
        RIGHT -> copy(x = x + 1)
    }
}

data class Car(val pos: Pos, val direction: Direction, val nextAction: Action) {
    fun moved() = copy(pos = pos.move(direction))
    fun turnAtIntersection() = when (nextAction) {
        TURN_LEFT -> copy(direction = direction.left(), nextAction = FORWARD)
        FORWARD -> copy(nextAction = TURN_RIGHT)
        TURN_RIGHT -> copy(direction = direction.right(), nextAction = TURN_LEFT)
    }
}

enum class Direction {
    UP,
    DOWN,
    LEFT,
    RIGHT;

    fun left() = when (this) {
        UP -> LEFT
        DOWN -> RIGHT
        LEFT -> DOWN
        RIGHT -> UP
    }

    fun right() = when (this) {
        DOWN -> LEFT
        UP -> RIGHT
        RIGHT -> DOWN
        LEFT -> UP
    }

    fun turnAtCorner(tile: Char) = when (this) {
        UP -> if (tile == '/') RIGHT else LEFT
        DOWN -> if (tile == '/') LEFT else RIGHT
        LEFT -> if (tile == '/') DOWN else UP
        RIGHT -> if (tile == '/') UP else DOWN
    }

    fun asChar() = when (this) {
        UP -> '^'
        DOWN -> 'v'
        LEFT -> '<'
        RIGHT -> '>'
    }
}

private fun Char.toDirection() = when (this) {
    '>' -> RIGHT
    '<' -> LEFT
    '^' -> UP
    'v' -> DOWN
    else -> throw IllegalArgumentException()
}

enum class Action {
    TURN_LEFT,
    FORWARD,
    TURN_RIGHT
}

