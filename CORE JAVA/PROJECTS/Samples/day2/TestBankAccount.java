package day2;

class TestBankAccount {
	public static void main(String[] args) {
			//ClassName objName = new ClassName();
			float mybal=1000;
			BankAccount ba = new BankAccount ();
			System.out.println ("Previous Balance :" + ba.getCurBal());
			ba.deposit (mybal);
			System.out.println("mybal :: "+mybal);
			System.out.println ("Balance after depositing Rs.5000/-  :" + ba.getCurBal());
			ba.withdraw(1000);
			System.out.println ("Balance after withdrawing Rs.1000/- :" + ba.getCurBal());
			System.out.println(ba);
			
			BankAccount ba1 = new BankAccount(101, 5000, "abc");
			System.out.println(ba1);
			
			System.out.println("Accessing statics static variables "+BankAccount.idNum);
			System.out.println("Accessing statics static variables using static method "+BankAccount.getIdNum());

	}
}
