import java.util.*;

public class cplusequals{
	public static void main(String[] args){
		Scanner edd=new Scanner(System.in);
		int t=edd.nextInt();
		for(int i=0;i<t;i++)
		{
			int a=edd.nextInt();
			int b=edd.nextInt();
			int n=edd.nextInt();
			int k=0;
			while(a<=n&&b<=n)
			{
				if(a<b)
				{
					a+=b;
				}
				else
				{
					b+=a;
				}
				k++;
			}
			System.out.println(k);
		}
		edd.close();
	}
}