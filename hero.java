import java.util.*;

public class hero{
	public static void main(String[] args){
		Scanner xed=new Scanner(System.in);
		String s=xed.nextLine();
		char[] c=s.toCharArray();
		HashSet<Character> clst=new HashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			clst.add(c[i]);
		}
		if(clst.size()%2!=0)
		{
		    System.out.println("IGNORE HIM!");
		}
		else
		{
		    System.out.println("CHAT WITH HER!");
		}
		xed.close();
	}
}
