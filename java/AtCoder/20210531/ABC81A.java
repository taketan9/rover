import java.util.Scanner;

public class ABC81A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1 <= a,b <= 10000
        String str = "";
        int cnt = 0;

        str = sc.next();

        if(Integer.parseInt(str.substring(0, 1)) == 1) cnt += 1;
        if(Integer.parseInt(str.substring(1, 2)) == 1) cnt += 1;
        if(Integer.parseInt(str.substring(2, 3)) == 1) cnt += 1;

        System.out.println(cnt);

        sc.close();
    }
}
        