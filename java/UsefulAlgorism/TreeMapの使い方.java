import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.Scanner;

public class TreeMapの使い方 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long K = sc.nextLong();

        // TreeMap作成。
        Map<Long, Long> map = new TreeMap<>();

        for (int i = 0; i < N; i++) {
            long A = sc.nextLong();
            long B = sc.nextLong();
            Long z = map.get(A);
            
            if (z == null) {
                map.put(A, B);
            } else {
                map.put(A, z+B);
            }
        }

        long money = K;
        long spot = 0;

        // TreeMapのループ要領
        // Keyは自然体にソートされている
        for (Entry<Long, Long> e : map.entrySet()) {
            if (money-(e.getKey()-spot) < 0) {
                break;
            } else {
                money = money-(e.getKey()-spot)+e.getValue();
                spot = e.getKey();
            }
        }
        System.out.println(spot+money);
        sc.close();
    }
}
