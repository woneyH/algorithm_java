import java.util.Scanner;
import java.io.FileInputStream;
import java.util.StringTokenizer;
class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
        sc.nextLine();
        for(int test_case = 1; test_case <= T; test_case++) {
            StringTokenizer st = new StringTokenizer(sc.nextLine());
            int gridSize = Integer.parseInt(st.nextToken());
            int toolSize = Integer.parseInt(st.nextToken());
            int[][] grid = new int[gridSize][gridSize];
            for(int i=0; i<gridSize; i++) {
                st = new StringTokenizer(sc.nextLine());
                for(int j=0; j<gridSize; j++) {
                    grid[i][j] = Integer.parseInt(st.nextToken());
                }
            }
             
            //검증 부분
            int maxSum = 0;
            for(int i=0; i<=gridSize-toolSize; i++) {
                for(int j=0; j<=gridSize-toolSize; j++) {
                    int sum = 0;
                    int copyI = i;
                    for(int k=0; k<toolSize; k++) {
                        int copyJ = j;
                        for(int r=0; r<toolSize; r++) {
                            sum+=grid[copyI][copyJ];
                            copyJ++;
                        }
                        copyI++;
                    }
                     
                    if(maxSum<sum) maxSum = sum;
                }
            }
             
            System.out.println("#"+test_case+" "+maxSum);
        }
    }
}
