import java.util.Scanner;

public class Echo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int length = 0;
        String comp = "";


        if (n>=1 && n<=100 && n%2==0) {
            length = s.length() / 2;
            comp = s.substring(0, length);
            comp = comp + comp;

            if (comp.equals(s)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");    
            }
        } else {
            System.out.println("No");
        }
        sc.close();
    }
}
