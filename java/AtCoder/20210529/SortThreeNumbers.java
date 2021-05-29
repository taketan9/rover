import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Scanner;

public class SortThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a,b,c = 0;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        List<Integer> arrayList = new ArrayList<Integer>();

        arrayList.add(a);
        arrayList.add(b);
        arrayList.add(c);

        Collections.sort(arrayList);

        for(int i=0; i<arrayList.size(); i++){
            System.out.print(arrayList.get(i));
            if ( i+1 != arrayList.size()) {
                System.out.print(" ");
            } else {
                System.out.println("");
            }
        }

        sc.close();
    }
}