import java.util.Scanner;

public class ABC204B {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
    int N = sc.nextInt();
    int input = 0;
    int sum = 0;

    for (int i=0; i<N; i++) {
      input = sc.nextInt();
      if(input > 10) {
        sum += input - 10;
      }
    }

    System.out.println(sum);

    sc.close();
	}
}