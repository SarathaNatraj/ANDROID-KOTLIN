package day3;

class CurrentAccount extends BankAccount{
	private float overDraft;
	public CurrentAccount(int id, float balance, float overDraft) {
    			super (id, balance);
			this.overDraft = overDraft;
	 }
  	public float calculateInterest( ) {
  		System.out.println(" CurrentAccount ------------->");
			return balance * 0.11f;
  	}
}

