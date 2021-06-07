import java.util.Scanner;

public class CrossSum {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Height
        int H = sc.nextInt();

        // Width
        int W = sc.nextInt();

        // input,output Array
        int inputArray[][] = new int[H][W];
        int maxHeight[] = new int[H];
        int maxWidth[] = new int[W];

        // input & maxHeigth
        for (int i=0; i<inputArray.length; i++) {
            for (int j=0; j<inputArray[i].length; j++) {
                inputArray[i][j] = sc.nextInt();
                maxHeight[i] += inputArray[i][j];
                maxWidth[j] += inputArray[i][j];
            }
        }

        // output sum
        for (int i=0; i<inputArray.length; i++) {
            for (int j=0; j<inputArray[i].length; j++) {
                int output = 0;
                output = maxHeight[i] + maxWidth[j] - inputArray[i][j];

                if (inputArray[i].length == j+1) {
                    System.out.println(output);
                } else {
                    System.out.print(output + " ");
                }
            }
        }       

    }
}