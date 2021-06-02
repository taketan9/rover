import java.util.Scanner;

public class ABC049CGOMI {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String S = sc.next();
        String str = S;
        String comp = "";

        boolean flag = true;

        try {
            while (flag) {
                comp = str.substring(str.length() - 3, str.length());
                switch (comp) {
                    case "eam":
                        if ("dream".equals(str.substring(str.length() - 5, str.length()))) {
                            str = str.substring(0, str.length() - 5);
                        } else {
                            flag = false;
                        }
                        break;
                    case "mer":
                        if ("dreamer".equals(str.substring(str.length() - 7, str.length()))) {
                            str = str.substring(0, str.length() - 7);
                        } else {
                            flag = false;
                        }
                        break;
                    case "ase":
                        if ("erase".equals(str.substring(str.length() - 5, str.length()))) {
                            str = str.substring(0, str.length() - 5);
                        } else {
                           flag = false;
                        }
                        break;
                    case "ser":
                        if ("eraser".equals(str.substring(str.length() - 6, str.length()))) {
                            str = str.substring(0, str.length() - 6);
                        } else {
                            flag = false;
                        }
                        break;
                    default:
                        flag = false;
                        break;
                }
            }
            
        } catch(RuntimeException e) {
            //
        }

        if (str.length()==0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}