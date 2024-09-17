package day2;

public class TestParameterValues {
	public static void main(String[ ] args) {
			//declaration
			int x = 15;      int[ ] y = {10, 20, 30, 40};
			
			BankAccount ba = new BankAccount(101, 5000, "abc");
			System.out.println("Values before passing the parameters : ");
			System.out.print("X : "+x+"\tName : "+ba.getName( )+"\tArray object : ");
			
			
			for(int z:y)
				System.out.print(z+",");
			changeThem(25, y, ba);
			System.out.println("\nValues after passing the parameters : ");
			System.out.print("X : "+x+"\tName : "+ba.getName( )+"\tArray object : ");
			
			for(int z:y) 
				System.out.print(z+",");
	}
	public static void changeThem(int x, int[ ] yc, BankAccount ba) {
			x = 60;  
			for(int i=0; i<yc.length; i++) {
	           	 yc[i]++;
	            	 ba.setName("xyz");
			}
	}
}