package day2.inheritance;

class NewCalculation extends InterestCalculation{
	public float interestRate = 7.0f;
	double balance = 10000;

	public void calcInterest( ) {
			System.out.println("Annual Interest2 : "+(balance*interestRate)/100);
	}
}
	