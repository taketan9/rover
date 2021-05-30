import java.util.Scanner;

public class PrintAFrame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H, W = 0;

        while (true) {
            H = sc.nextInt();
            W = sc.nextInt();
            if (W == 0 && H == 0) {
                break;
            }

            for (int i = 0; i < H; i++) {
                for (int j = 0; j < W; j++) {
                    if (j == 0 || j == W-1 || i == 0 || i == H-1) {
                        System.out.print("#");
                    } else {
                        System.out.print(".");
                    }
                
                }
                System.out.println();
            }
            System.out.println();
        }
        sc.close();
    }
}