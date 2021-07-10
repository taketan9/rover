import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ABC205Canother {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        long ac = 0;
        long bc = 0;

        ac = Math.pow(a, c);

        if ()

        
        // true -> odd
        boolean oddEven = true;

        if (c%2 != 1) {
            // even
            oddEven = false;
        } else {
            // odd
            oddEven = true;
        }

        // case odd
        if (oddEven) {
            if (Math.abs(a) > Math.abs(b)) {
                ans = '<';
            } else if (Math.abs(a) == Math.abs(b)) {
                if (a > b) {
                    ans = '>';
                } else if (a == b) {
                    ans = '=';
                } else {
                    ans = '<';
                }
            } else {
                ans = '>';
            }
        // case even
        } else {
            if (Math.abs(a) > Math.abs(b)) {
                ans = '>';
            } else if (Math.abs(a) == Math.abs(b)) {
                ans = '=';
            } else {
                ans = '<';
            }
        }

        System.out.println(ans);

        sc.close();

    }
}