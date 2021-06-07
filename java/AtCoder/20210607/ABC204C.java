import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class ABC204C {
    static boolean[] town;
    static List<List<Integer>> list = new ArrayList<>();
    static long cnt = 0;

    static void seach(int now) {
        town[now] = true;
        for (int i = 0; i < list.get(now).size(); i++) {
            int next = list.get(now).get(i);
            if (!town[next]) {
                cnt++;
                seach(next);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        town = new boolean[n];

        for (int i = 0; i < n; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            list.get(a).add(b);
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                town[j] = false;
            }
            seach(i);
        }

        System.out.println(cnt + n);
        sc.close();

    }
}