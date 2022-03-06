import java.util.Scanner;

public class capitalization{
	public static void main(String[] args){
		Scanner xed=new Scanner(System.in);
		String s=xed.nextLine();
		char[] a=s.toCharArray();
		a=capitalizer(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
		}
		System.out.println();
	}
	public static char[] capitalizer(char[] c){
		c[0]=Character.toUpperCase(c[0]);
		return c;
	}
}