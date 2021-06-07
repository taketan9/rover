import java.util.Scanner;
import java.util.ArrayList;

public class ABC204A {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
    int x = sc.nextInt();
    int y = sc.nextInt();

    ArrayList<Integer> list = new ArrayList<>();
    list.add(0);
    list.add(1);
    list.add(2);

    if (x == y) {
      System.out.println(x);
    } else {
      list.remove(list.indexOf(x));
      list.remove(list.indexOf(y));
      System.out.println(list.get(0));
    }

    sc.close();
	}
}