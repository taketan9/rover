import java.util.Scanner;

public class SimpleCalculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a,b = 0;
        char op = ' ';

        while (true) {
            a = sc.nextInt();
            op = sc.next().charAt(0);
            b = sc.nextInt();

            switch (op) {
                case '?':
                    sc.close();
                    return;
                case '+':
                    System.out.println(a + b);
                    break;
                case '-':
                    System.out.println(a - b);
                    break;
                case '*':
                    System.out.println(a * b);
                    break;
                case '/':
                    System.out.println(a / b);
                    break;
            }
        }
    }
}