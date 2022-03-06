import java.util.Scanner;

public class genrival{
	public static void main(String[] args){
		Scanner ewd=new Scanner(System.in);
		int n=ewd.nextInt();
		int[] a=new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i]=ewd.nextInt();
		}
		System.out.println(indexSwapsCalculator(a));
	}
	public static int maxElementFirstIndexSearcher(int[] a){
		int maxindex=0,max=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
				maxindex=i;
			}
		}
		return maxindex;
	}
	public static int minElementSearcher(int[] a){
		int min=0;
		for(int i=0;i<a.length;i++)
		{
			if(i==0)
			{
				min=a[i];
			}
			else
			{
				if(a[i]<min)
				{
					min=a[i];
				}
			}
		}
		return min;
	}
	public static int indexSwapsCalculator(int[] a){
		int t=maxElementFirstIndexSearcher(a);
		int b=0,k=0;
		for(int i=t;i>0;i--)
		{
			b=a[i];
			a[i]=a[i-1];
			a[i-1]=b;
			k++; 
		}
		int min=minElementSearcher(a);
		int minIndexFromLast=0;
		for(int i=a.length-1;i>=0;i--)
		{
			if(a[i]==min)
			{
				minIndexFromLast=i;
				break;
			}	
		}
		k+=Math.abs(minIndexFromLast-a.length+1);
		return k;
	}
}