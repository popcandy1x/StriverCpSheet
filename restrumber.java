import java.util.Scanner;

public class restrumber{
	public static void main(String[] args){
		Scanner xed=new Scanner(System.in);
		int a=xed.nextInt();
		int b=xed.nextInt();
		int c=xed.nextInt();
		int d=xed.nextInt();
		int t=maxLocater(a,b)>maxLocater(c,d)?maxLocater(a,b):maxLocater(c,d);
		if(t==a)
		{
			System.out.println((t-c)+" "+(t-b)+" "+(t-d));
		}
		else if(t==b)
		{
			System.out.println((t-c)+" "+(t-a)+" "+(t-d));
		}
		else if(t==c)
		{
			System.out.println((t-b)+" "+(t-a)+" "+(t-d));
		}
		else 
		{
			System.out.println((t-b)+" "+(t-a)+" "+(t-c));
		}
	}
	public static int maxLocater(int a,int b){
		if(a>=b)
		{
			return a;
		}
		else
		{
			return b;
		}
	}
}