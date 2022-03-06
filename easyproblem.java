import java.util.Scanner;

public class easyproblem{
	public static void main(String[] args){
		Scanner xed=new Scanner(System.in);
		int t=xed.nextInt();
		int[] a=new int[t];
		for(int i=0;i<a.length;i++)
		{
			a[i]=xed.nextInt();
		}
		System.out.println(easyHardDeterminer(a));
	}
	public static String easyHardDeterminer(int[] a){
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==1)
			{
				return "HARD";
			}
		}
		return "EASY";
	}
}