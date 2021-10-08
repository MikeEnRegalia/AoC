package y2018.day12

typealias Pots = Iterable<Int>
typealias Rules = List<Pair<Set<Int>, Boolean>>

fun Pots.simulateGrowth(rules: Rules, turns: Long): Long {
    var pots = this
    for (turnsLeft in turns downTo 1)
        pots = pots.grow { rules.match(pots, it) }.also {
            if (it.shape() == pots.shape()) return pots.score() + turnsLeft * (it.score() - pots.score())
        }
    return pots.score()
}

private fun Pots.grow(f: (Int) -> Int?) = (minOf { it } - 2..maxOf { it } + 2).mapNotNull(f)

private fun Rules.match(pots: Pots, p: Int) =
    firstOrNull { (rule) -> (-2..2).all { i -> (i in rule) == ((p + i) in pots) } }
        ?.takeIf { it.second }?.let { p }

private fun Pots.score() = sumOf { it }.toLong()
private fun Pots.shape() = (minOf { it }..maxOf { it }).map { contains(it) }