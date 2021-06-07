import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class YokanParty {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Lcmの羊羹 <= 1000000000
        // N個の切れ目
        // K分割
        int N = sc.nextInt();
        int L = sc.nextInt();
        int K = sc.nextInt();
        int inputList[] = new int[N];
        int subtractionList[] = new int[N+1];

        for (int i=0; i<inputList.length; i++) {
            inputList[i] = sc.nextInt();

            if (i==0) {
                subtractionList[i] = inputList[i];
            } else {
                subtractionList[i] = inputList[i] - inputList[i-1];
                if ( i == inputList.length - 1) {
                    subtractionList[i+1] = L - inputList[i];
                }
            }
        }
        
        int ave = 0;
        int length = 0;
        int diffBefore = 0;
        
        ave = L / (K+1);

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i=0; i<subtractionList.length; i++) {
            length += subtractionList[i];

            if (length >= ave) {
                if (Math.abs(length-ave) < Math.abs(ave-diffBefore)) {
                    arrayList.add(length);
                    length = 0;
                    diffBefore = 0;
                } else {
                    if (i == 0) {
                        arrayList.add(length);
                        length = diffBefore;
                    } else {
                        arrayList.add(diffBefore);
                        diffBefore = length-diffBefore;
                        length = diffBefore;
                    }     
                }
            } else {
                // ループ最終回の場合　かつ　分割数が足りない場合はコミットする
                if ((subtractionList.length == i+1) && arrayList.size() <= K) {
                    arrayList.add(length);
                } else {
                    diffBefore = length;
                }
            }
        }

        Collections.sort(arrayList);
        System.out.print(arrayList.get(0));
    }
}