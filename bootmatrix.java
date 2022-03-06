import java.util.*;

public class bootmatrix{
	public static void main(String[] args){
		Scanner xed=new Scanner(System.in);
		int[][] a=new int[5][5];
		int b=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=xed.nextInt();
			}
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(a[i][j]==1)
				{
					b=Math.abs(i-2)+Math.abs(j-2);
				}
			}
		}
		System.out.println(b);
	}
}