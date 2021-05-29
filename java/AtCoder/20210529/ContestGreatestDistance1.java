import java.util.Scanner;

public class ContestGreatestDistance1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // 2 <= n <= 8

        int[][] arrayList = new int[n][2];

        for (int i=0; i < n; i++){
            arrayList[i][0] = sc.nextInt();
            arrayList[i][1] = sc.nextInt();
        }

        int max = 0;
        int nextmax = 0;

        for(int i=0; i < n; i++) {
            for(int j=i+1; j < n; j++) {
                int a = 0;
                int b = 0;
                a = Math.abs(arrayList[i][0] - arrayList[j][0]);
                b = Math.abs(arrayList[i][1] - arrayList[j][1]);
                if (a > b) {
                    if (max < a) {
                        nextmax = max;
                        max = a;
                    } else if (nextmax < a) {
                        nextmax = a;
                    }
                } else {
                    if (max < b) {
                        nextmax = max;
                        max = b;
                    } else if (nextmax < b) {
                        nextmax = b;
                    }
                }
            }
        }

        System.out.println(nextmax);

        sc.close();
    }
}