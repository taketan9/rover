import java.util.Scanner;

public class ARC122ADush{

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		int n;
		long[] a,b;
		long c=1000000000+7;
		n = sc.nextInt();
		//n=100000;
		a = new long[n];
		b = new long[n+2];

		for(int i=0; i<n; i++) {
			//a[i]=1;
			a[i]=sc.nextInt();
		}
		sc.close();
		b[0]=1;
		b[1]=1;
		for(int i=0; i<n; i++) {
			b[i+2]=b[i+1]+b[i];
			if(b[i+2]>c) {
				b[i+2]=b[i+2]-c;
			}
		}

		long tmp=0;
		long ans;
		for(int i=1; i<n; i++) {
			tmp=(tmp+a[i] * ((b[n-i]*b[i])%c-(b[n-i-1]*b[i-1])%c))%c;
		}
		tmp=tmp+a[0]*b[n];

		ans=tmp%(1000000000+7);
		System.out.println(ans);



	}
}