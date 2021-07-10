import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ABC205B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> inputlist = new ArrayList<>();

        for (int i=0; i<n; i++) {
            int hoge = 0;
            hoge = sc.nextInt();
            inputlist.add(hoge);
        }

        Collections.sort(inputlist);

        boolean flag = true;

        for (int i=0; i<inputlist.size(); i++){

            if (inputlist.get(i)==(i+1)){
                //none;
            } else {
                flag = false;
                break;
            }
        }
        
        if (flag) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();

    }
}