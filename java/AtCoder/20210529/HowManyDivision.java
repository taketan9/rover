import java.util.Scanner;
public class HowManyDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        int y = 0;
        int z = 0;

        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();

        int divisionCount = 0;


        for (int i=x; i <= y; i++) {
            if ( z % i == 0) {
                divisionCount += 1;
            }
        }

    System.out.println(divisionCount);
        sc.close();
    }
}