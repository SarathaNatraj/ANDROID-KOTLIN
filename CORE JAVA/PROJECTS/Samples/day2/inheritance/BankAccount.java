package day2.inheritance;


//base class
class BankAccount {
	private int accNo; 
 	private String name;
 	private float curBal;
 	private static int idNum = 1;
 	protected String email="aaa@gmail.com";
 	BankAccount(String n, float bal){
		name = n;
			curBal = bal;
	}

  	BankAccount ( ) {
    			accNo = idNum++;
    			curBal = 0;
  	}
  	public void deposit (float amt) {
    			curBal += amt; 
  	}
  	public void withdraw (float amt) { 
    			curBal -= amt; 
  	}
  	public float getCurBal ( ) { 
    			return curBal; 
  	}
  	public void print ( ) {
			System.out.println ("customer : " + name);
			System.out.println ("Balance  : " + curBal);
	}

}
