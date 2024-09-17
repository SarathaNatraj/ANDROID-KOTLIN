package day2.inheritance;

public class Banking {
	public static void main (String [ ] args) {
    			SavingsAccount sa = new SavingsAccount ( );
    			sa.deposit(5000);
    			System.out.println ("Balance : " + sa.getCurBal ());
    			System.out.println ("Annual interest : " +sa.isSalaryAcc());
    			sa.print();
    			
    			BankAccount ba = new BankAccount();
    			ba.print();
    			
    			CurrentAccount ca = new CurrentAccount("Anjan", 5000,15000);
    			ca.print();
	}
}

