import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();

        int area = r * r;
        System.out.println(area);
        sc.close();
    }
}
