import java.util.Scanner;
import java.io.FileInputStream;
import java.util.Arrays;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
            int people = sc.nextInt();
            sc.nextLine();
            String salads = sc.nextLine();
            int[] saladArray = Arrays.stream(salads.split(" ")).mapToInt(Integer::parseInt).toArray();
            int sum = Arrays.stream(saladArray).sum();
            int average = sum/people;

            int count = 0;
            for(int person: saladArray) {
                if(person<=average) count++;
            }

            System.out.println("#"+test_case+" "+count);

        }
	}
}
