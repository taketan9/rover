import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class ABC088B {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        // 1 <= N <= 100

        int N = sc.nextInt();
        ArrayList<Integer> cardList = new ArrayList<>();

        for (int i=0; i<N; i++) {
            cardList.add(sc.nextInt());
        }

        Collections.sort(cardList);

        int sumAllice = 0;
        int sumBob = 0;

        for (int i=0; i<cardList.size(); i++) {
            if (i%2==0) {
                sumAllice += cardList.get(i);
            } else {
                sumBob += cardList.get(i);
            }
        }
        
        System.out.println(sumBob-sumAllice);
    }    
}
