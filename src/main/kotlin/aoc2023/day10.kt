package aoc2023

import kotlin.math.min

fun main() = day10(generateSequence(::readlnOrNull).toList()).forEach(::println)

private const val connectsFromWest = "7-J"
private const val connectsFromEast = "F-L"
private const val connectsFromNorth = "L|J"
private const val connectsFromSouth = "F|7"

private fun day10(lines: List<String>): List<Any?> {
    data class Pos(val x: Int, val y: Int) {
        val inGrid by lazy { x in lines[0].indices && y in lines.indices }
        val atGridBorder by lazy { x == 0 || y == 0 || x == lines[0].indices.last || y == lines.indices.last }

        val c: Char by lazy {
            when {
                !inGrid -> 'X'
                lines[y][x] == 'S' -> {
                    val (e, s, w, n) = listOf(d(dx = 1), d(dy = 1), d(dx = -1), d(dy = -1)).map { it.c }
                    when {
                        e in connectsFromWest && w in connectsFromEast -> '-'
                        s in connectsFromNorth && n in connectsFromSouth -> '|'
                        e in connectsFromWest && s in connectsFromSouth -> 'F'
                        e in connectsFromWest && n in connectsFromNorth -> 'L'
                        w in connectsFromEast && s in connectsFromSouth -> '7'
                        w in connectsFromEast && n in connectsFromNorth -> 'J'
                        else -> '?'
                    }
                }

                else -> lines[y][x]
            }
        }

        fun d(dx: Int = 0, dy: Int = 0) = copy(x = x + dx, y = y + dy)

        fun neighbors() = sequenceOf(d(dx = 1), d(dx = -1), d(dy = 1), d(dy = -1)).filter { it.inGrid }

        fun pipeNeighbors() = neighbors().filter {
            val dx = it.x - x
            val dy = it.y - y
            when {
                dx == 1 -> c in connectsFromEast && it.c in connectsFromWest
                dx == -1 -> c in connectsFromWest && it.c in connectsFromEast
                dy == 1 -> c in connectsFromSouth && it.c in connectsFromNorth
                dy == -1 -> c in connectsFromNorth && it.c in connectsFromSouth
                else -> false
            }
        }
    }

    fun findPath(): Pair<List<Pos>, Int> {
        val start = lines.indexOfFirst { 'S' in it }.let { y -> Pos(lines[y].indexOf('S'), y) }
        val D = mutableMapOf(start to 0)
        val V = mutableSetOf(start)

        var curr = start
        while (true) {
            curr.pipeNeighbors().filter { it !in V }.forEach {
                val d = D.getValue(curr) + 1
                D.compute(it) { _, old -> min(old ?: Int.MAX_VALUE, d) }
            }
            V += curr
            val remaining = D.keys - V
            curr = remaining.minByOrNull { D.getValue(it) } ?: break
        }

        val path = mutableListOf(start)
        while (true) path += path.last().pipeNeighbors().filter { it !in path }.firstOrNull() ?: break

        return path to D.values.max()
    }

    val (path, part1) = findPath()

    fun Pos.isTile() = c != '?' && this !in path

    val leftTiles = mutableSetOf<Pos>()
    val rightTiles = mutableSetOf<Pos>()

    for ((prev, curr, next) in path.plus(path.take(2)).windowed(3)) {

        fun List<Pos>.addIfTile(set: MutableSet<Pos>) = filter(Pos::isTile).forEach { set.add(it) }

        val rightIfEastward = if (next.x > prev.x) rightTiles else leftTiles
        val leftIfEastward = if (next.x > prev.x) leftTiles else rightTiles

        when (curr.c) {
            'F' -> {
                listOf(curr.d(1, 1)).addIfTile(rightIfEastward)
                listOf(curr.d(0, -1), curr.d(-1, -1), curr.d(-1, 0)).addIfTile(leftIfEastward)
            }

            '7' -> {
                listOf(curr.d(-1, 1)).addIfTile(rightIfEastward)
                listOf(curr.d(0, -1), curr.d(1, -1), curr.d(1, 0)).addIfTile(leftIfEastward)
            }

            'J' -> {
                listOf(curr.d(-1, -1)).addIfTile(leftIfEastward)
                listOf(curr.d(1, 0), curr.d(1, 1), curr.d(0, 1)).addIfTile(rightIfEastward)
            }

            'L' -> {
                listOf(curr.d(1, -1)).addIfTile(leftIfEastward)
                listOf(curr.d(0, 1), curr.d(-1, 1), curr.d(-1, 0)).addIfTile(rightIfEastward)
            }
        }
    }

    fun Set<Pos>.exploreTiles(): Set<Pos> {
        val toFollow = toMutableList()
        val tiles = toMutableSet()
        while (toFollow.isNotEmpty()) {
            toFollow.removeLast().neighbors().filter { it.isTile() }.forEach {
                if (it !in tiles) {
                    toFollow += it
                    tiles += it
                }
            }
        }
        return tiles
    }

    val part2 = listOf(leftTiles, rightTiles)
        .map(MutableSet<Pos>::exploreTiles)
        .single { it.none(Pos::atGridBorder) }
        .size

    return listOf(part1, part2)
}