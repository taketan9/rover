import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double a = 0;

        a = sc.nextDouble();
    
        double circlearea = 0;
        double circleangle = 0;

        circlearea = a * a * Math.PI;
        circleangle = a * 2 * Math.PI;

        System.out.println(String.format("%.6f",circlearea) + " " + String.format("%.6f",circleangle));

        sc.close();
    }
}