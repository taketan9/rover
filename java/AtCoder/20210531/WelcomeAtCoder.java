import java.util.Scanner;

public class WelcomeAtCoder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a,b,c = 0;
        String s = "";

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        s = sc.next();

        System.out.println(a+b+c + " " + s);

        sc.close();
    }
}
        