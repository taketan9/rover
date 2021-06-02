import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class ABC085B {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        // 1 <= N <= 100

        int N = sc.nextInt();
        ArrayList<Integer> cardList = new ArrayList<>();

        for (int i=0; i<N; i++) {
            cardList.add(sc.nextInt());
        }

        Collections.sort(cardList);

        int stack = 0;
        int kagamiMochi = 0;

        for (int i=0; i<cardList.size(); i++) {
            if (stack != cardList.get(i)) {
                kagamiMochi += 1;
                stack = cardList.get(i);
            }
        }
        System.out.println(kagamiMochi);
    }    
}
