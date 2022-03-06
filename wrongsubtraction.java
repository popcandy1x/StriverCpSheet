import java.util.Scanner;

public class wrongsubtraction{
	public static void main(String[] args){
		Scanner xed=new Scanner(System.in);
		int t=xed.nextInt();
		int k=xed.nextInt();
		for(int i=0;i<k;i++)
		{
			if(t%10==0)
			{
				t=t/10;
			}
			else
			{
				t--;
			}
		}
		System.out.println(t);
	}
}