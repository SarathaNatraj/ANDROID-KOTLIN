package day2.inheritance;

class InterestCalculation {
	public float interestRate = 8.5f;
	double balance = 10000;

	public void calcInterest( ) {
			System.out.println("Annual Interest1 : "+(balance*interestRate)/100);
	}
}

