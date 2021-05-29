import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        int y = 0;

        x = sc.nextInt();
        y = sc.nextInt();

        int area = 0;
        int areaLength = 0;

        area = x * y;
        areaLength = (x * 2) + (y * 2);
        System.out.println(area + " " + areaLength);

        sc.close();
    }
}