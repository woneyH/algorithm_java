import java.util.Scanner;
import java.io.FileInputStream;
class Solution{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int test_case = 1; test_case <= 10; test_case++) {
			int n = sc.nextInt();
			sc.nextLine();
			String key = sc.nextLine();
			String text = sc.nextLine();
			int count = 0;
			for (int i = 0; i <= text.length()-key.length(); i++) {
				int j=0;
				for(j=0; j<key.length(); j++) {
					char c = text.charAt(i+j);
					if(c!=key.charAt(j)) {
						break;
					}
				}
				if(j==key.length()) count++;  //j와 key 길이가 같다는건 찾을 문자열 길이만큼 탐색했다는 의미이다.
			}

			System.out.println("#" + n + " " + count);
		}
	}
}
