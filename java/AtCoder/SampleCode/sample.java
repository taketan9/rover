//

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // input n
		int n = Integer.parseInt(br.readLine());

        // input ai
		String[] sa = br.readLine().split(" ");
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sa[i]);
		}

		br.close();

        // mod 
		int mod = 1000000007;

		long[] dpp = new long[n];
		long[] dpm = new long[n];
		long[] dpp2 = new long[n];
		long[] dpm2 = new long[n];

		dpp[0] = a[0];
		dpp2[0] = 1;

		for (int i = 1; i < n; i++) {
			dpp[i] += (dpp[i - 1] + a[i] * dpp2[i - 1]) % mod;
			dpp[i] += (dpm[i - 1] + a[i] * dpm2[i - 1]) % mod;
			dpp[i] %= mod;
			dpm[i] = (dpp[i - 1] - a[i] * dpp2[i - 1]) % mod;

			if (dpm[i] < 0) {
				dpm[i] += mod;
			}

			dpp2[i] = (dpp2[i - 1] + dpm2[i - 1]) % mod;
			dpm2[i] = dpp2[i - 1];
		}

		long ans = dpp[n - 1] + dpm[n - 1];

        // mod
		ans %= mod;
		System.out.println(ans);
	}
}
