import java.util.Scanner;

public class ABC87B {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        // 0mai <= 500yen,100yen,50yen <= 50mai
        // 500yen + 100yen + 50yesn >= 1mai
        // 50 <= Sum <= 20000

        int A,B,C,X = 0;

        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        X = sc.nextInt();

        int cnt = 0;

        // X = A*x + B*y + C*z

		for (int a = 0; a <= A; a++) {
            for (int b = 0; b <= B; b++) {
              for (int c = 0; c <= C; c++) {
                   int total = 500 * a + 100 * b + 50 * c;
                       if (total == X) {
                        cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}