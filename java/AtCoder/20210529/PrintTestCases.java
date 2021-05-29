import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintTestCases {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        List<Integer> arrayList = new ArrayList<Integer>();

        while (true) {
            int number = 0;
            number = sc.nextInt();

            if(number != 0) {
                arrayList.add(number);
            } else {
                break;
            }
        }

        for(int i=0; i<arrayList.size(); i++){
            System.out.println("Case " + (i+1) + ": " + arrayList.get(i));
        }

        sc.close();
    }
}