import java.util.Scanner;

public class foxsnake{
	public static void main(String[] args){
		Scanner edd=new Scanner(System.in);
		int n=edd.nextInt();
		int m=edd.nextInt();
		char[][] a=new char[n][m];
		a=foxSnakeMaker(a);
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		edd.close();
	}
	public static char[][] foxSnakeMaker(char[][] a){
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(i%2!=0)
				{
					if((i+3)%4==0)
					{
						if(j==a[i].length-1)
						{
							a[i][j]='#';
						}
						else
						{
							a[i][j]='.';
						}
					}
					else 
					{
						if(j==0)
						{
							a[i][j]='#';
						}
						else
						{
							a[i][j]='.';
						}
					}
				}
				else
				{
					a[i][j]='#';
				}
			}
		}
		return a;
	}
}