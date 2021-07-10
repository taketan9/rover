import java.util.Scanner;

public class ABC205A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 100ml -> A kcal
        int a = sc.nextInt();
        int b = sc.nextInt();

        double ans = 0;

        if (a != 0){       
            ans = (double)(a * b) / 100;
        } 

        System.out.println(ans);

        // Scanner Close37
        sc.close();

    }
}