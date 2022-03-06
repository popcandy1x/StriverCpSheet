import java.util.Scanner;

public class antifibonacci{
	public static void main(String[] args){
		Scanner xed=new Scanner(System.in);
		int t=xed.nextInt();
		for(int j=0;j<t;j++)
		{
			int n=xed.nextInt();
			int[] a=new int[n];
			for(int i=0;i<a.length;i++)
			{
				a[i]=i+1;
			}
			for(int i=0;i<a.length/2;i++)
			{
			    int f=a[i];
			    a[i]=a[a.length-i-1];
			    a[a.length-i-1]=f;
			}
			if(a.length==3)
			{
				System.out.println(3+" "+2+" "+1);
				System.out.println(1+" "+3+" "+2);
				System.out.println(3+" "+1+" "+2);
			}
			else
			{
				for(int z=0;z<a.length;z++)
				{
					for(int i=0;i<a.length-1;i++)
					{
						int d=a[i];
						a[i]=a[i+1];
						a[i+1]=d;
					}
					for(int k=0;k<a.length;k++)
					{
						System.out.print(a[k]+" ");
					}
					System.out.println();
				}
			}
		}
		xed.close();
	}
}