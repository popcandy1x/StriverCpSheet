import java.util.Scanner;

public class chewnumber{
	public static void main(String[] args){
		Scanner edd=new Scanner(System.in);
			long n=edd.nextLong();
			System.out.println(chewbaka(n));
		edd.close();
	}
	public static long chewbaka(long n){
		long a=0,t=0,k=1,nDigit=0;
		for(long i=n;i!=0;i/=10)
		{
			nDigit++;
		}
		for(long i=n;i!=0;i/=10)
		{
			a=i%10;
			if(i==n/(long)Math.pow(10,nDigit-1))
			{
				if((9-a)<a&&(9-a)!=0)
				{
					a=9-a;
				}
			}
			else
			{
				if((9-a)<a)
				{
					a=9-a;
				}
			}
			t+=a*k;
			k*=10;
		}
		return t;
	}
}