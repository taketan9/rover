import java.util.*;
public class ABC049C {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
      
      	str = str.replaceAll("eraser", "");
        str = str.replaceAll("erase", "");
      	str = str.replaceAll("dreamer", "");
        str = str.replaceAll("dream", "");

        // System.out.println(a.isEmpty() ? "YES" : "NO");
        if (str.isEmpty()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
		
	}
}