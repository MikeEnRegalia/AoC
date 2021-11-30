package aoc2018.day22

import aoc2018.day22.Tool.TORCH

fun day22(depth: Int, targetX: Int, targetY: Int): Int = with(Cave(depth, targetX, targetY)) {
    zeroToTarget().sumOf { (x, y) -> type(x, y) }
}

internal fun Cave.type(x: Int, y: Int) = erosionLevel(x, y) % 3

internal data class Cave(val depth: Int, val targetX: Int, val targetY: Int) {
    val erosionCache: MutableMap<Pair<Int, Int>, Int> = mutableMapOf()
}

internal fun Cave.calculateErosionLevel(x: Int, y: Int) = (geologicalIndex(x, y) + depth) % 20183

internal fun Cave.erosionLevel(x: Int, y: Int) = erosionCache.computeIfAbsent(x to y) { calculateErosionLevel(x, y) }

internal fun Cave.geologicalIndex(x: Int, y: Int): Int = when {
    x == 0 && y == 0 || x == targetX && y == targetY -> 0
    x == 0 -> y * 48271
    y == 0 -> x * 16807
    else -> erosionLevel(x - 1, y) * erosionLevel(x, y - 1)
}

internal fun Cave.zeroToTarget() = (0..targetX).flatMap { x -> (0..targetY).map { y -> x to y } }

fun day22Part2(depth: Int, targetX: Int, targetY: Int): Int {
    val cave = Cave(depth, targetX, targetY)

    var tool = TORCH


    return 42
}

internal enum class Tool {
    TORCH,
    CLIMBING_GEAR,
    NEITHER
}