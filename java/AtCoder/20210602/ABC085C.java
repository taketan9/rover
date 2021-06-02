import java.util.Scanner;

public class ABC085C {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // 1 <= N <= 2000
        // 1000 <= Y <= 20000000

        int N = sc.nextInt();
        int Y = sc.nextInt();

        // 紙幣の枚数
        int Yen10000 = -1;
        int Yen5000 = -1;
        int Yen1000 = -1;


        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= N-i; j++) {
                int k=0;
                k = N - i - j;        
                if (Y == 10000 * i + 5000 * j + 1000 * k) {
                    Yen10000 = i;
                    Yen5000 = j;
                    Yen1000 = k;
                    break;
                }
            }
        }
        System.out.println(Yen10000 + " " + Yen5000 + " " + Yen1000);
        sc.close();
    }
}