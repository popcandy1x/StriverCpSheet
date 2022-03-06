import java.util.Scanner;

public class gettheprincess{
	public static void main(String[] args){
		Scanner xed=new Scanner(System.in);
		int t=xed.nextInt();
		xed.nextLine();
		wfor(int i=0;i<t;i++)
		{
			String s=xed.nextLine();
			char[] c=s.toCharArray();
			if(reachPrincessPossiblityChecker(c))
			{
				System.out.println("yes");
			}
			else
			{
				System.out.println("no");
			}
		}
		xed.close();
	}
	public static boolean reachPrincessPossiblityChecker(char[] c){
	    if(Character.isUpperCase(c[0]))
		{
		  return false;
		}
		else
		{
		  for(int i=1;i<c.length;i++)
		{
		  if(Character.isUpperCase(c[i]))
		       {
		            char d=c[i];
		            if(i!=c.length-1)
		            {
		                for(int j=i+1;j<c.length;j++)
		                {
		                    if(c[j]==Character.toLowerCase(d))
		                    {
		                        return false;
		                    }
		                }
		            }
		        }
		}
		}
		return true;
	}
}