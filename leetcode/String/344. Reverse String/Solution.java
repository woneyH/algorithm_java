class Solution {
    public void reverseString(char[] s) {
        int endIndex = s.length-1;
        int startIndex = 0;

        for(int i=startIndex; i<=endIndex; i++, endIndex--) {
            char temp = s[i];
            s[i] = s[endIndex];
            s[endIndex] = temp;
        }
    }
}
