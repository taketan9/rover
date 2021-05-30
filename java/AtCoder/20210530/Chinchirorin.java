import java.util.Scanner;

public class Chinchirorin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a,b,c = 0;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if (a==b && b!=c) {
            System.out.println(c);
        } else if (b==c && c!=a) {
            System.out.println(a);
        } else if (c==a && a!=b) {
            System.out.println(b);
        } else if (a==b && b==c) {
            System.out.println(a);
        } else {
            System.out.println("0");
        }
        sc.close();
    }
}