import java.util.Scanner;

public class nearlucky{
	public static void main(String[] args){
		Scanner edd=new Scanner(System.in);
		long n=edd.nextLong();
		long k=digitCounter(n);
		if(k<10)
		{
			if(k==4||k==7)
			{
				System.out.print("YES");
			}
			else
			{
				System.out.println("NO");
			}
		}
		else
		{
			if(k/10==4||k/10==7)
			{
				if(k%10==4||k%10==7)
				{
					System.out.println("YES");
				}
				else
				{
					System.out.println("NO");
				}
			}
			else
			{
				System.out.println("NO");
			}
		}
		edd.close();
	}
	public static long digitCounter(long n){
		long k=0;
		for(long i=n;i!=0;i/=10)
		{
			if(i%10==4||i%10==7)
			{
				k++;
			}
		}
		return k;
	}
}