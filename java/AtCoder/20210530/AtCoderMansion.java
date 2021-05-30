import java.util.Scanner;

public class AtCoderMansion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N,K,sum = 0;

        N = sc.nextInt();
        K = sc.nextInt();

        for (int i=0; i<N; i++) {
            for (int j=0; j<K; j++) {
                sum += 100 * (i+1) + j+1;
            }
        }
        System.out.println(sum);
        sc.close();
    }
}