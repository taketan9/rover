import java.util.Scanner;

public class ABC209B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 100ml -> A kcal
        int n = sc.nextInt();
        int x = sc.nextInt();

        int money[] = new int[n];
        int count = 0;


        for (int i=0; i<n; i++) {
            money[i] = sc.nextInt();
            if (i%2 != 0) {
                money[i] -= 1;
            } 
            count += money[i];
        }

        if (count > x) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }

        sc.close();

    }
}