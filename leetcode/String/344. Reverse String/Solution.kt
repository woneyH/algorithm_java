//case 1 함수 이용
class Solution {
    fun reverseString(s: CharArray): Unit {
        s.reverse()
    }
}

//case 2 투 포인터
class Solution2 {
    fun reverseString(s: CharArray): Unit {
        var startIndex = 0
        var endIndex = s.size-1

        while(startIndex<=endIndex) {
            var temp = s[startIndex]
            s[startIndex] = s[endIndex]
            s[endIndex] = temp

            startIndex++
            endIndex--
        }
    }
}
