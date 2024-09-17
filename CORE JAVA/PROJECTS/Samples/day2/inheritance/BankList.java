package day2.inheritance;

public class BankList {
	BankAccount[] accArray;
	int top;

	BankList(int size) {
		top = -1;
		accArray = new BankAccount[size];
	}

	public void printAll() {
		for (BankAccount b : accArray) {
			System.out.println(b);
		}
	}

	public void addNewAccount(BankAccount ba) {
		if (top < accArray.length)
			accArray[++top] = ba;
	}
}
