import java.util.Scanner;

public class SwitchOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a days in a week");
		Scanner sc = new Scanner(System.in);
		int dayOfWeek = sc.nextInt();
		switch (dayOfWeek) {
		case 0: System.out.println ("Sunday"); break;
	 	case 1: System.out.println ("Monday"); break;
	  	case 2: System.out.println ("Tuesday"); break;
	  	case 3: System.out.println ("Wednesday"); break;
	  	case 4: System.out.println ("Thursday"); break;
	  	case 5: System.out.println ("Friday"); break;
	  	case 6: System.out.println ("Saturday"); break;
	  
		default : System.out.println ("ERROR!"); break;
	}


	}

}
