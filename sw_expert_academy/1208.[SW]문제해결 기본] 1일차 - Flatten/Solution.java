import java.util.Scanner;
import java.io.FileInputStream;
import java.util.StringTokenizer;

class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int test_case = 1; test_case <= 10; test_case++) {
			int dumpCount = sc.nextInt();
			int[] group = new int[100];
			sc.nextLine();
			StringTokenizer st = new StringTokenizer(sc.nextLine());
			for (int i = 0; i < group.length; i++) {
				group[i] = Integer.parseInt(st.nextToken());
			}

			for (int i = 0; i < dumpCount; i++) {
				int[] result = findMinMax(group);
				if (group[result[1]] - group[result[0]] <= 1)break; // 평탄화
				group[result[0]]++;
				group[result[1]]--;
			}
			int[] result = findMinMax(group);
			System.out.println("#" + test_case + " " + (group[result[1]] - group[result[0]]));
		}
	}

	static int[] findMinMax(int[] group) {
		int minIndex = 0;
		int maxIndex = 0;
		int[] result = new int[2];
		for (int i = 0; i < group.length; i++) {
			if (group[i] >= group[maxIndex]) {
				maxIndex = i;
			} else if (group[i] <= group[minIndex]) {
				minIndex = i;
			}
		}
		result[0] = minIndex;
		result[1] = maxIndex;
		return result;
	}
}
