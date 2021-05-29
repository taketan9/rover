import java.util.Scanner;

public class Watch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = 0;
        S = sc.nextInt();
        // 0 <= S <= 86400
        int h = 0; // hour
        int m = 0; // minuit
        int s = 0; // second

        h = S / (60 * 60);
        m = (S - (h * 60 * 60)) / 60;
        s = (S - (h * 60 * 60)) % 60;
        
        System.out.println(h + ":" + m + ":" + s);

        sc.close();
    }
}