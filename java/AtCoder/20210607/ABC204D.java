import java.util.Scanner;
import java.lang.Math;

public class ABC204D {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int sum = 0;

		int[] T = new int[N+1];
		int[] S = new int[N+1];
		T[0] = 0;
		S[0] = 0;

        // Tを要素、SUMをｔの全加算
        // Sを
		for (int i = 1; i <= N; i++) {
			T[i] = sc.nextInt();
			sum += T[i];
			S[i] = S[i-1] + T[i];
		}
		
		boolean[][] dp = new boolean[N+1][sum * 2];

		dp[0][0] = true;
		for (int i = 1; i <= N; i++) {
			for (int j = 0; j <= S[i]; j++) {
				if (dp[i-1][j]) {
					dp[i][j] = dp[i-1][j];
					dp[i][j + T[i]] = dp[i-1][j];
				}
			}
		}
		
		for (int j = 0; j < sum ; j++) {
			if (dp[N][sum / 2 + j]) {
				System.out.println(Math.max(sum / 2 + j, sum - (sum / 2 + j)));
				return;
			}
		}

        sc.close();
	}
}