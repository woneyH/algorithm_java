import java.util.Scanner;
import java.io.FileInputStream;
 
class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();
         
        for(int test_case=1; test_case<=T; test_case++) {
            int N = sc.nextInt();
            int[][] arr = new int[N][];
            StringBuilder sb = new StringBuilder();
             
            for(int i=0; i<N; i++) {
                arr[i] = new int[i+1];
                arr[i][0] = 1;
                arr[i][i] = 1;
                 
                for(int j=1; j<i; j++) {
                    arr[i][j] = arr[i-1][j-1]+arr[i-1][j];
                }
                 
                for(int j=0; j<=i; j++) {
                    sb.append(arr[i][j]);
                    if(j!=i) {
                        sb.append(" ");
                    }
                }
                sb.append("\n");
            }
             
            System.out.println("#"+test_case);
            System.out.print(sb);
        }
    }
}
