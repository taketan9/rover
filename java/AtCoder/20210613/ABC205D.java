import java.io.*;
import java.util.*;

/** Generate Contest Template */
public class ABC205D {

    private static long solve(long[] nums, long k) {
        int lo = 0;
        int hi = nums.length;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            long b = nums[mid] - mid - 1;
            if (k > b) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        return lo + k;
    }

    public static void main(String[] args) throws Exception {
        try (InputReader ir = new InputReader(System.in);
                PrintWriter pw = new PrintWriter(System.out)) {
            int N = ir.ni();
            int Q = ir.ni();
            long[] nums = new long[N];
            for (int i = 0; i < N; ++i) {
                nums[i] = ir.nl();
            }
            for (int i = 0; i < Q; ++i) {
                pw.println(solve(nums, ir.nl()));
            }
        }
    }

    private static class InputReader implements AutoCloseable {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int ni() {
            return nextInt();
        }

        public long nl() {
            return nextLong();
        }

        public double nd() {
            return nextDouble();
        }

        public double nf() {
            return nextFlow();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public float nextFlow() {
            return Float.parseFloat(next());
        }

        @Override
        public void close() throws Exception {
            reader.close();
        }
    }
}