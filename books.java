import java.util.Scanner;

public class books{
	public static void main(String[] args){
		Scanner edd=new Scanner(System.in);
		int t=edd.nextInt();
		int k=edd.nextInt();
		int[] a=new int[t];
		for(int i=0;i<a.length;i++)
		{
			a[i]=edd.nextInt();
		}
		System.out.println(maxBookReader(a,k));
		edd.close();
	}
	public static int maxBookReader(int[] a,int k){
		int max=0,sum=0;
		int t=0;
		for(int i=0;i<a.length;i++)
		{
			sum=0;
			t=k;
			for(int j=i;j<a.length;j++)
			{
				if(a[j]<=t)
				{
					sum++;
					t-=a[j];
				}
				else
				{
					break;
				}
			}
			if(sum>max)
			{
				max=sum;
			}
		}
		return max;
	}
}