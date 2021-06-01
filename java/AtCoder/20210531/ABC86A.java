import java.util.Scanner;

public class ABC86A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1 <= a,b <= 10000
        int a,b,result = 0;

        a = sc.nextInt();
        b = sc.nextInt();
        
        result  = a * b;
        // a,bの積が奇数ならOdd、偶数ならEvenと出力する

        if (result % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        sc.close();
    }
}
        