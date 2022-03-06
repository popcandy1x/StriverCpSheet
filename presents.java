import java.util.Scanner;

public class presents{
	public static void main(String[] args){
		Scanner edd=new Scanner(System.in);
		int n=edd.nextInt();
		int[] a=new int[n+1];
		for(int i=1;i<a.length;i++)
		{
			a[i]=edd.nextInt();
		}
		a=presentsCollector(a);
		for(int i=1;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		edd.close();
	}
	public static int[] presentsCollector(int[] a){
		int[] b=new int[a.length];
		for(int i=1;i<a.length;i++)
		{
			b[a[a[i]]]=a[i];
		}
		return b;
	}
}