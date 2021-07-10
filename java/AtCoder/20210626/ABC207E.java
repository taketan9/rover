import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class ABC207E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long mod = 1000000007;

        List<Long> inputlist = new ArrayList<>();

        for (int i=0; i<n; i++) {
            inputlist.add(sc.nextLong());
        }

        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        long ans = -1;

        if (b > c) {
            System.out.println(ans);
        } else {
            ans = 0;
            while (true) {
                long left = a + (b*ans);
                long right = c*ans*d;

                if (left <= right) {
                    break;
                }
                ans += 1;
            }
            System.out.println(ans);
        }
        sc.close();

    }
}