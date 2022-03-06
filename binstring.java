import java.util.*;

public class binstring{
	public static void main(String[] args){
		Scanner xed=new Scanner(System.in);
		int t=xed.nextInt();
		for(int j=0;j<t;j++)
		{
			int n=xed.nextInt();
			xed.nextLine();
			String s=xed.nextLine();
			char[] a=s.toCharArray();
			ArrayList<Character> b=new ArrayList<Character>();
			for(int i=0;i<a.length;i++)
			{
				b.add(a[i]);
			}
			System.out.println(distinctBinaryStrings(b));
		}
	}
	public static int distinctBinaryStrings(ArrayList<Character> b){
		ArrayList<Character> originalb=new ArrayList<Character>(b);
		HashSet<String> c=new HashSet<String>();
		for(int i=0;i<b.size();i++)
		{
			b.remove(i);
            String s=b.toString();
			c.add(s);
			b=new ArrayList<Character>(originalb);
		}
		return c.size();
	}
}