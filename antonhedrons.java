import java.util.Scanner;

public class antonhedrons{
	public static void main(String[] args){
		Scanner n=new Scanner(System.in);
		int x=n.nextInt();
		n.nextLine();
		String[] s=new String[x];
		for(int i=0;i<s.length;i++)
		{
			s[i]=n.nextLine();
		}
		System.out.println(faceFinder(s));
		n.close();
	}
	public static int faceFinder(String[] s){
		int face=0;
		for(int i=0;i<s.length;i++)
		{
			face+=faceCalculator(s[i]);
		}
		return face;
	}
	public static int faceCalculator(String s){
		int face=0;
		switch(s){
			case "Tetrahedron":
				face+=4;
				break;
			case "Cube":
				face+=6;
				break;
			case "Octahedron":
				face+=8;
				break;
			case "Dodecahedron":
				face+=12;
				break;
			case "Icosahedron":
				face+=20;
				break;
			default:
				face+=0;
				break;
			}	
		return face;
	}
}