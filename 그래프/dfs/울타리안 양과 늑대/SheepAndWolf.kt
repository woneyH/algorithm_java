package algorithm.gemini_assignment

fun main(args: Array<String>) {
    Thread(null, { solve() }, "dfs", 1L shl 26).start()
}

var list: ArrayList<String> = arrayListOf()
var visited: Array<BooleanArray>? = null
var wolves = 0
var sheep = 0

var mRow = intArrayOf(0, 1, 0, -1)
var mCol = intArrayOf(1, 0, -1, 0)

fun dfs(row: Int, col: Int, c: Char?) {
    if (c == 'o') {
        sheep++
    } else if (c == 'v') {
        wolves++
    }
    visited!![row][col] = true

    for (i in 0..<mRow.size) {
        var mr = mRow[i] + row
        var mc = mCol[i] + col

        if (mr < 0 || mc < 0 || mr >= list.size || mc >= list[row].length) continue
        if (visited!![mr][mc]) continue

        var c: Char? = list.get(mr).getOrNull(mc)
        if (c == '#') continue

        dfs(mr, mc, c)
    }

}

fun solve() {
    val input = readln().split(" ")
    val row = input[0].toInt()
    val col = input[1].toInt()
    visited = Array(row) { BooleanArray(col) }

    for (i in 0..<row) {
        val lineInput = readln()
        list.add(lineInput)
    }

    var totalWolves = 0
    var totalSheep = 0
    for (i in 0..<row) {
        for (j in 0..<col) {
            var c: Char? = list.get(i).getOrNull(j)
            if (visited!![i][j]) continue
            if (c == '#') continue
            wolves = 0
            sheep = 0
            dfs(i, j, c)

            if (wolves >= sheep) {
                totalWolves += wolves
            } else {
                totalSheep += sheep
            }
        }
    }

    println("$totalSheep $totalWolves")
}
