import java.util.Arrays;
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        if(s.length==0) return 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int sEndIndex = s.length-1;
        int count = 0;
        for(int i=g.length-1; i>=0; i--) {
            if(sEndIndex<0) break;
            if(g[i]<=s[sEndIndex]) {
                count++;
                sEndIndex--;
            }
        }
        return count;
    }
}
