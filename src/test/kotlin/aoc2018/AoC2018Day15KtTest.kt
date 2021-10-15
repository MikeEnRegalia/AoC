package aoc2018

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

private const val INPUT = """################################
#################..#############
#################.##############
#################.####..########
############G..G...###..########
##########...G...........#######
##########.#.......#.G##########
########...#.....#...G..########
#######G.###............G#######
###########..G..#.......########
####..#####............#########
###.G.###.......G.....G.########
###..#####....#####.......######
####..#####..#######........E..#
#.##..####..#########.........E#
#....###.GG.#########........###
##....#.G...#########.......####
#....G...G..#########......#####
#..........G#########.....######
#.....G......#######......######
#........##...#####.......######
#G###...##............#....#####
#..#######................E#####
#.########...............#######
#..#######..............########
#####..#....E...##.......#######
#####.G#.......#.E..#EE.########
#####...E....#....#..###########
#######.......E....E.###########
#######.###....###.....#########
#######.####.######.....########
################################"""

internal class AoC2018Day15KtTest {
    @Test
    fun test() {
        day15BeverageBanditsPart1(
            """#######
#G..#E#
#E#E.E#
#G.##.#
#...#E#
#...E.#
#######"""
        ) shouldBe 36334
    }

    @Test
    fun part1() {
        day15BeverageBanditsPart1(INPUT) shouldBe 191575
    }

    @Test
    fun part2() {
        day15BeverageBanditsPart2(INPUT) shouldBe 75915
    }
}