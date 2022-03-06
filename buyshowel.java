import java.util.Scanner;

public class buyshowel{
	public static void main(String[] args){
		Scanner xed=new Scanner(System.in);
		int t=xed.nextInt();
		int r=xed.nextInt();
		for(int i=1;i<=10;i++)
		{
			if((t*i)%10==0||((t*i)-r)%10==0)
			{
				System.out.println(i);
				break;
			}
		}
		xed.close();
	}
}