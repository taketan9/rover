import java.util.Scanner;

public class AGC054A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n       = sc.nextInt();
        String s    = sc.next();
        String str  = "";
        int cnt     = 0;

        char[] lastCharList = s.toCharArray();
        char lastChar = lastCharList[lastCharList.length - 1];
        int lastCharPlace = lastCharList.length -1;
        int bunkatuPlace = -1;

        for(int i=0; i<lastCharList.length; i++) {
            if((lastCharList[i] == lastChar) && (i != lastCharPlace)) {
                bunkatuPlace = i;
                break;
            }
        }

        if (bunkatuPlace == -1) {
            System.out.println("1");
        }

        System.out.println(lastChar);



        if(str.length() > 0){
            System.out.println("-1");
        } else {
            System.out.println(cnt);
        }

        sc.close();

    }
}