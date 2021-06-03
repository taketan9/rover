import java.util.Scanner;

public class ABC086C {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // 1 <= N <= 100000
        // 1000 <= Y <= 20000000

        int N = sc.nextInt();
        int t,x,y = 0;
        int localX = 0;
        int localY = 0;
        int localT = 0;
        int abs = 0;
        int nextTime = 0;

        boolean flag = true;

        for (int i=0; i<N; i++) {
            t = sc.nextInt();
            x = sc.nextInt();
            y = sc.nextInt();

            abs = Math.abs(x-localX) + Math.abs(y-localY);
            nextTime = t-localT;

            if (nextTime >= abs) {    
                if (nextTime % 2 == abs % 2) {
                    localX = x;
                    localY = y;
                    localT = t;
                } else {
                    flag = false;  
                }
            } else {
                flag = false;
            }
        }

        if(flag) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }
}