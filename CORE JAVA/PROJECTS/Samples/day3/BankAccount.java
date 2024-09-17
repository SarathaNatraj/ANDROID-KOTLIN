package day3;


//POJO - Plain Old Java Objects, Java Beans, Model classes 
public abstract class BankAccount {
	private int id;
	protected float balance;

	public BankAccount(int id, float balance) {
		this.id = id;
		this.balance = balance;
	}

	//doesnt have method body - method declaration
	//no definition - abstract method 
	public abstract float calculateInterest();

	
	//does have method body - method initialisation
	//fully defined method - concrete method
	public void deposit(float amt) {
		balance += amt;
	}

	public void withdraw(float amt) {
		balance -= amt;
	}

	public float getCurBal() {
		return balance;
	}
}
