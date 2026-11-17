import java.util.Scanner;
import java.io.FileInputStream;
import java.util.Arrays;
class Solution{
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();
 
        for (int test_case = 1; test_case <= T; test_case++) {
            int N = sc.nextInt();
            sc.nextLine();
            int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            long sum = 0;
            int max = arr[arr.length-1];
            for(int i=arr.length-1; i>=0; i--) {
                if(max<arr[i]) {
                    max = arr[i];
                }else {
                    sum+=max-arr[i];
                }
            }
             
            System.out.println("#"+test_case+" "+sum);
        }
    }
}
