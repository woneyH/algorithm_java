class Solution {
    fun isPalindrome(x: Int): Boolean {
        var intToString = x.toString()
        var reverseString = intToString.reversed()
        return intToString==reverseString
    }
}
