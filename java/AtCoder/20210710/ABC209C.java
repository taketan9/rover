import java.util.Scanner;

public class ABC209C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 100ml -> A kcal
        int n = sc.nextInt();
        long mod = 1000000007;
        long ans = (long)1;

        long ciArray[] = new long[n];


        for (int i=0; i<n; i++) {
            ciArray[i] = sc.nextLong();

            long work1 = factorial(ciArray[i]-i);
            long work2 = (long)1;

            if (ciArray[i]-i > 1) {
                work2 = factorial(ciArray[i]-i-1);
            } 

            System.out.println("work1 :-> " +work1);
            System.out.println("work2 :-> " +work2);

            ans *= work1 / work2;
            System.out.println("ans :-> " +ans);
        }

        ans = ans % mod;

        System.out.println(ans);

        sc.close();

    }

    static long factorial(long n) {   
        if(0>n) {
            return n;
        }
        if(0==n){
            return 1;
        }

        Long fac = (long)1;

        for(long i=1; i<=n; ++i) {
            fac *= i;
        }
        return fac;
    }
}