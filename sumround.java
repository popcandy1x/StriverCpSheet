import java.util.Scanner;

public class sumround{
	public static void main(String[] args){
		Scanner edd=new Scanner(System.in);
		int t=edd.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=edd.nextInt();
			roundNumbersDisplayer(n);
		}
	}
	public static void roundNumbersDisplayer(int n){
		int a=0,k=1,b=0;
		for(int i=n;i!=0;i/=10)
		{
			a=i%10;
			if(a*k!=0)
			{
				b++;
			}
			k*=10;
		}
		System.out.println(b);
		k=1;
		for(int i=n;i!=0;i/=10)
		{
			a=i%10;
			if(a*k!=0)
			{
				System.out.print(a*k+" ");
			}
			k*=10;
		}
		System.out.println();
	}
}