import java.util.*;
 
public class HardWay{
	public static void main(String[] args){
		Scanner xed=new Scanner(System.in);
		int t=xed.nextInt();
		for(int i=0;i<t;i++)
		{
			int x1=xed.nextInt();
			int y1=xed.nextInt();
			int x2=xed.nextInt();
			int y2=xed.nextInt();
			int x3=xed.nextInt();
			int y3=xed.nextInt();
			int sumUnsafeLength=0;
			if(y1-y2==0&&y1>y3)
			{
			    if(y1!=0)
			    {
			        sumUnsafeLength+=Math.abs(x1-x2);
			    }
			}
			else if(y2-y3==0&&y2>y1)
			{
			    if(y2!=0)
			    {
			        sumUnsafeLength+=Math.abs(x2-x3);
			    }
			}
			else if(y3-y1==0&&y3>y2)
			{
			    if(y3!=0)
			    {
			        sumUnsafeLength+=Math.abs(x3-x1);
			    }
			}
			System.out.println(sumUnsafeLength);
		}
		xed.close();
	}
}