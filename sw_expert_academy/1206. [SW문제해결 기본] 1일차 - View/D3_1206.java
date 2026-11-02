import java.util.Scanner;
import java.io.FileInputStream;
import java.util.Arrays;

class D3_1206 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int test_case = 1; test_case <= 10; test_case++) {
            int N = sc.nextInt();
            sc.nextLine();
            int sum = 0;
            int[] heights = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            for (int i = 2; i < N - 2; i++) {
                int current = heights[i];
                int max = Math.max(Math.max(heights[i - 1], heights[i - 2]),
                        Math.max(heights[i + 1], heights[i + 2]));

                if(current>max) {
                    sum+= current-max;
                }
            }

            System.out.println("#" + test_case + " " + sum);
        }
    }
}
