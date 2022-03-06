import java.util.*;

public class helpfulmaths{
	public static void main(String[] args){
		Scanner edd=new Scanner(System.in);
		String s=edd.nextLine();
		ArrayList<Integer> a=new ArrayList<Integer>();
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!='+')
			{
				a.add((int)(s.charAt(i)-'0'));
			}
		}
		Collections.sort(a);
		for(int i=0;i<a.size();i++)
		{
			if(i!=a.size()-1)
			{
				System.out.print(a.get(i)+"+");
			}
			else
			{
				System.out.print(a.get(i));
			}
		}
		System.out.println();
	}
}