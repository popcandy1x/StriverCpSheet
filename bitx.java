import java.util.Scanner;

public class bitx{
	public static void main(String[] args){
	Scanner xed=new Scanner(System.in);
	int t=xed.nextInt();
	xed.nextLine();
	int x=0;
	for(int i=0;i<t;i++)
	{
		String s=xed.nextLine();
		if(s.equals("X++")||s.equals("++X"))
		{
			x++;
		}
		else if(s.equals("X--")||s.equals("--X"))
		{
			x--;
		}
	}
	System.out.println(x);
	}
}