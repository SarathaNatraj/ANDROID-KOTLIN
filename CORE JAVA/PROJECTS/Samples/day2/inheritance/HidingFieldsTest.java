package day2.inheritance;

public class HidingFieldsTest {
	public static void main (String [ ] args) {
			NewCalculation nc = new NewCalculation ( );
			System.out.println ("Calculating with interest Rate : "+nc.interestRate);
			nc.calcInterest( );
		
			InterestCalculation ic = new NewCalculation( );
			System.out.println ("Calculating with interest Rate : "+ic.interestRate);
			ic.calcInterest( );
		
	}
}

