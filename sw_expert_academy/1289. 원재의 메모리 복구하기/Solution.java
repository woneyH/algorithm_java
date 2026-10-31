import java.util.Scanner;
import java.io.FileInputStream;
class Solution{
	public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();
        sc.nextLine();
        for (int test_case = 1; test_case <= T; test_case++) {
            String memoryValue = sc.nextLine();

            char prevChar = '0';
            int count = 0;
            
            for(int i=0; i<memoryValue.length(); i++) {
                char c = memoryValue.charAt(i);
                if(c!=prevChar) {
                    count++;
                    prevChar = c;
                }
            }

            System.out.println("#"+test_case+" "+count);
	
        }
	}
}
    
