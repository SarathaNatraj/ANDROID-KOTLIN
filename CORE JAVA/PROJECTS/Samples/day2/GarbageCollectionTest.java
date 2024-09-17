package day2;

class Employee {
	Employee (){
			System.out.println ("Employee created...");
	}
	protected void finalize () {
			System.out.println ("\t\tFinalizing...");
	}
}

class GarbageCollectionTest{ 
	public static void main (String [ ] args) {
			for (int i = 1; i < 15000; i++) {
				Employee x = new Employee ();
			}
	}
}
