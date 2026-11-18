import java.util.Scanner;
import java.io.FileInputStream;
import java.util.StringTokenizer;
 
class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();
        sc.nextLine();
        for (int test_case = 1; test_case <= T; test_case++) {
            StringTokenizer st = new StringTokenizer(sc.nextLine());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            int[][] list = new int[N][N];
            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(sc.nextLine());
                for (int j = 0; j < N; j++) {
                    list[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            int result = 0;
            for (int i = 0; i < N; i++) {
                int fCount = 0;
                for (int j = 0; j < N; j++) {
                    if (list[i][j] == 1) {
                        fCount++;
                    } else {
                        if (fCount > 0) {
                            fCount = 0;
                        }
                    }
 
                    if (fCount == K && j < N - 1) {
                        if (list[i][j + 1] == 0) {
                            result++;
                            fCount = 0;
                        }
                    }
                }
                if (fCount == K) {
                    result++;
                }
                // 열기준
                int ColCount = 0;
                for (int j = 0; j < N; j++) {
                    if (list[j][i] == 1) {
                        ColCount++;
                    } else {
                        if (ColCount > 0) {
                            ColCount = 0;
                        }
                    }
 
                    if (ColCount == K && j < N - 1) {
                        if (list[j + 1][i] == 0) {
                            result++;
                            ColCount = 0;
                        }
                    }
                }
                if (ColCount == K) {
                    result++;
                }
            }
 
            System.out.println("#" + test_case + " " + result);
        }
    }
}
