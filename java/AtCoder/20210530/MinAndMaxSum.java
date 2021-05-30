import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class MinAndMaxSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long s,a,sum = 0;
        List<Long> resultList = new ArrayList<Long>();

        s = sc.nextInt();

        for(int i=0; i<s; i++) {
            a = sc.nextInt();
            resultList.add(a);
            sum += a;
        }

        Collections.sort(resultList);
        System.out.println(resultList.get(0) + " " + resultList.get(resultList.size()-1) + " " + sum);
        sc.close();
    }
}