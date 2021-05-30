import java.util.Scanner;

public class AB_Probrem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long a,b = 0;

        a = sc.nextInt();
        b = sc.nextInt();
    
        // a ÷ b ： d (整数)
        // a ÷ b の余り ： r (整数)
        // a ÷ b ： f (浮動小数点数)

        long wari = 0;
        long amari = 0;
        double warikonma = 0;

        wari = a / b;
        amari = a % b;
        warikonma = (double)a / (double)b;

        System.out.println(wari + " " + amari + " " + String.format("%.5f",warikonma));

        sc.close();
    }
}