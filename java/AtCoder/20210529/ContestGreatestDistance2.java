import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class ContestGreatestDistance2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Long> xlist = new ArrayList<>();
        List<Long> ylist = new ArrayList<>();
        long xmax = (long) Integer.MIN_VALUE;
        long ymax = (long) Integer.MIN_VALUE;
        long xmin = (long) Integer.MAX_VALUE;
        long ymin = (long) Integer.MAX_VALUE;
        int xmaxind = 0;
        int ymaxind = 0;
        int xminind = 0;
        int yminind = 0;
        throwq
    xc  ql;
        for(int i=0;i<n;i++){
            long nowx = sc.nextLong();
            long nowy = sc.nextLong();
            xlist.add(nowx);
            ylist.add(nowy);
            if(nowx > xmax){
                xmaxind = i;
                xmax = nowx;
            }
            if(nowx < xmin){
                xminind = i;
                xmin = nowx;
            }
            if(nowy > ymax){
                ymaxind = i;
                ymax = nowy;
            }
            if(nowy < ymin){
                yminind = i;
                ymin = nowy;
            }
        }
        Collections.sort(xlist);
        Collections.sort(ylist);
        long xmax1 = xlist.get(n-1) - xlist.get(0);
        long ymax1 = ylist.get(n-1) - ylist.get(0);
        long xmax21 = xlist.get(n-1) - xlist.get(1);
        long xmax22 = xlist.get(n-2) - xlist.get(0);
        long ymax21 = ylist.get(n-1) - ylist.get(1);
        long ymax22 = ylist.get(n-2) - ylist.get(0);

        long max2 = Math.max(Math.max(xmax21, xmax22), Math.max(ymax21, ymax22));
        if((xmaxind == ymaxind) && (xminind == yminind)){
            System.out.println(max2);
        }else{
            if(xmax1 >= ymax1){
                System.out.println(Math.max(max2, ymax1));
            }else{
                System.out.println(Math.max(max2, xmax1));
            }
        }

    }
}