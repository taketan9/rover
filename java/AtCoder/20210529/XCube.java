import java.util.Scanner;

public class XCube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        double y = 0;
        
        x = sc.nextInt();
        y = x;
        y = Math.pow(y, 3);
        x = (int)y;
        System.out.println(x);

        sc.close();
    }
}