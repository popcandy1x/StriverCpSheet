import java.util.Scanner;

public class meetfrands{
	public static void main(String[] args){
		Scanner edd=new Scanner(System.in);
		int x1=edd.nextInt();
		int x2=edd.nextInt();
		int x3=edd.nextInt();
		System.out.println(distanceMeasurer(x1,x2,x3));
	}
	public static int midElementFinder(int x1,int x2,int x3){
		if(x1<maxElementFinder(x2,x3))
		{
			if(x1>minElementFinder(x2,x3))
			{
				return x1;
			}
			else
			{
				return minElementFinder(x2,x3);
			}
		}
		else
		{
			return maxElementFinder(x2,x3);
		}
	}
	public static int maxElementFinder(int x1,int x2){
		if(x1>x2)
		{
			return x1;
		}
		else
		{
			return x2;
		}
	}
	public static int minElementFinder(int x1,int x2)
	{
		if(x1<x2)
		{
			return x1;
		}
		else
		{
			return x2;
		}
	}
	public static int distanceMeasurer(int x1,int x2,int x3){
		if(x1==midElementFinder(x1,x2,x3))
		{
			return Math.abs(x2-x1)+Math.abs(x3-x1);
		}
		else if(x2==midElementFinder(x1,x2,x3))
		{
			return Math.abs(x1-x2)+Math.abs(x3-x2);
		}
		else
		{
			return Math.abs(x1-x3)+Math.abs(x2-x3);
		}
	}
}