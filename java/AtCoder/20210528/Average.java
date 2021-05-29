import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // 2 <= n <= 8

        int[][] areaList = new int[n][2];

        for (int i=0; i < n; i++){
            areaList[i][0] = sc.nextInt();
            areaList[i][1] = sc.nextInt();
        }

        double sum = 0;

        for(int i=0; i < n; i++) {
            for(int j=i+1; j < n; j++) {
                sum = sum + Math.sqrt(Math.pow(areaList[i][0] - areaList[j][0],2) + Math.pow(areaList[i][1] - areaList[j][1],2));
            }
        }

         // 全網羅するためには逆向きの経路文も考慮する必要あり
        sum = sum * 2;

        // 平均計算
        sum = (sum) / n;
        System.out.println(sum);

        sc.close();
    }
}