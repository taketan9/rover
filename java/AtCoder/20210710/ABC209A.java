import java.util.Scanner;

public class ABC209A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 100ml -> A kcal
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 0;


        for (int i=a; i<=b; i++) {
            count += 1;
        }

        System.out.println(count);

        sc.close();

    }
}