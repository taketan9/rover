import java.util.Scanner;

public class LargeSmall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a,b = 0;

        a = sc.nextInt();
        b = sc.nextInt();

        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a == b");
        }
        sc.close();
    }
}