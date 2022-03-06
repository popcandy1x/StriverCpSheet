import java.util.Scanner;

public class tram{
	public static void main(String[] args){
		Scanner xed=new Scanner(System.in);
		int t=xed.nextInt();
		int[] a=new int[t];
		int[] b=new int[t];
		for(int i=0;i<a.length;i++)
		{
			b[i]=xed.nextInt();
			a[i]=xed.nextInt();
		}
		System.out.println(trainCapacityCalculator(a,b));
		xed.close();
	}
	public static int trainCapacityCalculator(int[] a,int[] b){
		int sum=a[0];
		int max=sum;
		for(int i=1;i<a.length;i++)
		{
			sum+=a[i]-b[i];
			if(sum>max)
			{
				max=sum;
			}
		}
		return max;
	}
}