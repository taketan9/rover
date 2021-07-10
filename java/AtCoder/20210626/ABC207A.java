import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ABC207A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int sum = 0;

        List<Integer> inputlist = new ArrayList<>();

        inputlist.add(a);
        inputlist.add(b);
        inputlist.add(c);

        Collections.sort(inputlist);
        Collections.reverse(inputlist);

        sum += inputlist.get(0);
        sum += inputlist.get(1);

        System.out.println(sum);

        sc.close();

    }
}