import java.util.Scanner;

public class ABC207B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        long ans = -1;

        if (b > c) {
            System.out.println(ans);
        } else {
            double now = 0;
            now = (double) a / (c*d-b);
            ans = (long)Math.ceil(now);

            System.out.println(ans);
        }
        sc.close();

    }
}