import java.util.Scanner;

public class ABC81B {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int n = sc.nextInt();
        int[] a = new int[n];
        boolean F = false;

        for (int i=0; i<n; i++) {
            a[i] = sc.nextInt();
            if (a[i]%2==1) F = true;
        }
        
        if (F == true) {
            System.out.println(0);
        }else {
            int min = Integer.MAX_VALUE;
            for (int i=0; i<n; i++) {

                int cnt = 0;
                while (a[i]%2==0) {                
                    a[i] = a[i] / 2;
                    cnt++;
                }
                min = Math.min(min,cnt);
            }
            System.out.println(min);
        }
    }
}