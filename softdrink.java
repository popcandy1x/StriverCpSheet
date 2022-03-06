import java.util.Scanner;

public class softdrink{
	public static void main(String[] args){
		Scanner edd=new Scanner(System.in);
		int n=edd.nextInt();
		int k=edd.nextInt();
		int l=edd.nextInt();
		int c=edd.nextInt();
		int d=edd.nextInt();
		int p=edd.nextInt();
		int nl=edd.nextInt();
		int np=edd.nextInt();
		int maxDrinksToast=(k*l)/nl;
		int maxLimeToast=(c*d);
		int maxSaltToast=p/np;
		System.out.println(maxToastMaker(maxDrinksToast,maxSaltToast,maxLimeToast,n));
		edd.close();
	}
	public static int minFinder(int a,int b){
		if(a<=b)
		{
			return a;
		}
		else
		{
			return b;
		}
	}
	public static int maxToastMaker(int a,int b,int c,int n){
		if(c<minFinder(a,b))
		{
			return c/n;
		}
		else
		{
			return minFinder(a,b)/n;
		}
	}
}