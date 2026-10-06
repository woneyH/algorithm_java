class Solution {
    fun findContentChildren(g: IntArray, s: IntArray): Int {
        if (s.isEmpty()) return 0
        var count = 0
        g.sort()
        s.sort()
        var gEndPointer = g.size - 1
        var sEndPointer = s.size - 1
        while (gEndPointer >= 0 && sEndPointer >= 0) {
            if(g[gEndPointer]<=s[sEndPointer]) {
                count++
                gEndPointer--
                sEndPointer--
            }else {
                gEndPointer--
            }

        }
        return count
    }
}
