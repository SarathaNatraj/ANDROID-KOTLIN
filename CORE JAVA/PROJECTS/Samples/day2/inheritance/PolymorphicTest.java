package day2.inheritance;

class PolymorphicTest {
	public static void main(String[] args) {
		BankAccount ba[] = { new SavingsAccount("Amar", 1000, true), new CurrentAccount("Akbar", 2000, 5000) };
		System.out.println("Printing polymorphically");
		for (int i = 0; i < ba.length; i++) {
			ba[i].print();
			System.out.println("-----------------------------");
		}
	}
}
