class Solution {
    public boolean isPalindrome(int x) {
        StringBuilder intToString = new StringBuilder(String.valueOf(x));
        String reverseString = new StringBuilder(intToString).reverse().toString();
        return reverseString.contentEquals(intToString);
    }
}
