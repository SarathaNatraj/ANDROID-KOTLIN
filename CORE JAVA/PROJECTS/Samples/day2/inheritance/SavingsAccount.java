package day2.inheritance;

//sub class
class SavingsAccount extends BankAccount {
	
	private boolean isSalaryAcc;

 		public SavingsAccount(String string, int i, boolean b) {
		// TODO Auto-generated constructor stub
 			super(string,i);
 			this.isSalaryAcc=b;
	}
		public void setSalaryAcc (boolean is) {
 			isSalaryAcc = is;
	 }
 	 public boolean isSalaryAcc ( ) {
 		 		System.out.println(" email "+email);
    			return isSalaryAcc;
  	}
 	public void print ( ) {
 			super.print( );
 			System.out.println ("Is it a Salary Account : " + isSalaryAcc);
 	  	}
 	public SavingsAccount() {
 		super();
 	}
}
