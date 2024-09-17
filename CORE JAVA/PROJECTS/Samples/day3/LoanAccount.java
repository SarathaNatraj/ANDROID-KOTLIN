package day3;

class LoanAccount extends BankAccount{
	private float loanAmt;
	public LoanAccount (int id, float balance, float loanAmt) {
			super (id, balance);
			this.loanAmt = loanAmt;
	}
  	public float calculateInterest( ) {
  		System.out.println(" LoanAccount --------------> ");
    			return balance * 0.13f;
  	}
}
