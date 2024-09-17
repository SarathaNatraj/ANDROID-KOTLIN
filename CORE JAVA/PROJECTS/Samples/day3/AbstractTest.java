package day3;

public class AbstractTest {
	public static void main (String [ ] args ) {
			showInterest (new SavingsAccount (3,5000, true));
    		showInterest(new LoanAccount (4,6000, 100000));
    		showInterest(new CurrentAccount (5,7000, 200000));
 	}
  	public static void showInterest(BankAccount e) {
 			System.out.println ("Interest :" + e.calculateInterest ( ));
  	}
}

