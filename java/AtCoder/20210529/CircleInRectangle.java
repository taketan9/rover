import java.util.Scanner;

public class CircleInRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int W,H,x,y,r = 0;

        W = sc.nextInt();
        H = sc.nextInt();
        x = sc.nextInt();
        y = sc.nextInt();
        r = sc.nextInt();
        // 0 < W,H,r <= 100
        // -100 <= x,y <= 100
 
        // WとXの差がRより大きくないといけない
        // HとYの差がRより大きくないといけない
        // XはRより大きくないといけない
        // YはRより大きくないと行けない


        if (W-x >= r && H-y >= r && x >= r && y >= r) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }


        sc.close();
    }
}