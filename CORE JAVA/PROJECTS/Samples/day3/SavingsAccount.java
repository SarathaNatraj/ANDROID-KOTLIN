package day3;

public class SavingsAccount extends BankAccount {
	private boolean isSalaryAcc;

	public SavingsAccount(int id, float balance, boolean isSal) {
		super(id, balance);
		this.isSalaryAcc=isSal;
	}

	@Override
	public float calculateInterest() {
		System.out.println(" SavingsAccount ----------------> ");
		return balance * 0.10f;

	}

}
