public class 2次元配列のソート {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long sum = k;
        long money[][] = new long[n][2];

        for(int i = 0; i < n; i++) {
            money[i][0] = sc.nextLong();
            money[i][1] = sc.nextLong();
        }
        
        // 二次元配列のソートはここ！
        Arrays.sort(money, (a, b) -> Long.compare(a[0], b[0]));
        for(int i = 0; i < n; i ++) {
            if(money[i][0] <= sum) {
                sum += money[i][1];
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
