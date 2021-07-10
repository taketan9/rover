import java.util.Scanner;

public class ABC205C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if (C % 2 == 0) {
            A = Math.abs(A);
            B = Math.abs(B);
        }

        if (A < B) {
            System.out.println("<");
        } else if (A > B) {
            System.out.println(">");
        } else {
            System.out.println("=");
        }
        sc.close();
    }
}
