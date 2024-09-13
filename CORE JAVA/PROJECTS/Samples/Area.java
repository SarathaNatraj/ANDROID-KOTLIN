import java.util.Scanner;

public class Area {
	static final float PI = 3.1416f;
	public static void main (String [ ] args) {
			float radius;
			float area;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the radius : ");
			radius = sc.nextFloat();
			area = PI*radius * radius ;
			System.out.println ("Area is " + area);
			
			int i=0;
			i++; //i => 1
			++i; //s2 => i
	}
}
