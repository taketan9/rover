import java.util.Scanner;

public class ABC083B {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        // 1 <= N <= 10^4
        // 1 <=  A <= B <= 36

        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int sum = 0;

        for (int i=0; i<=N; i++) {
            int compare = 0;
            for (int j=0; j<String.valueOf(i).length(); j++) {
                compare += Character.getNumericValue(String.valueOf(i).charAt(j));
            }
            if (compare >= A && compare <= B) {
                sum += i;
            }
        }
        System.out.println(sum);
    }    
}
