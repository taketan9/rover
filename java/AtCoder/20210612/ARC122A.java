import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class ARC122A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input N
        int n = sc.nextInt();

        // input Ai
        int m = 0;

        // output SUM
        long sum = 0;

        // input ListAi
        List<Integer> inputlist = new ArrayList<>();

        // input N * Ai --> input ListAi
        for (int i = 0; i < n; i++) {
            m = sc.nextInt();
            inputlist.add(m);
        }

        // if n!=1
        if (n != 1) {

            // bit all search

            for (int i=0; i<(Math.pow(2,n-1)); i++) {

                // [-][-] -> NG!
                boolean secondFlag = false;

                // for loop = 0;
                long insum = 0;

                // input ListAi(0) -> insum
                insum += inputlist.get(0); 

                // break label
                loop_hoge:
                for (int j=0; j<n-1; j++) {

                    // [+]
                    if ((1&i>>j) == 1) {
                        insum += inputlist.get(j+1);
                        secondFlag = false;
                    // [-]
                    } else {
                        if (secondFlag) {
                            // [-][-] -> break & insum =>0
                            insum = 0;
                            break loop_hoge;
                        } else {
                            secondFlag = true;
                            insum -= inputlist.get(j+1);
                        }
                    }
                }
                // sum + insum -> sum
                sum += insum;
            }
        
        // n = 1 -> sum = input ListAi(0)
        } else {
            sum = inputlist.get(0);
        }

        // output -> sum
        System.out.println(sum);

        // Scanner Close
        sc.close();

    }
}