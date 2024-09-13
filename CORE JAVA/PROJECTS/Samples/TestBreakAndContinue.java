public class TestBreakAndContinue {
	public static void main (String [ ] args) {
    			for (int i = 1; i <= 70; i++) {
      				if (i % 7 == 0) // 1%7
        			continue;
      				System.out.print (" " + i);
				
      				if (i % 40 == 0) {
      					System.out.println();
      					System.out.println ("Terminating loop");
      					break;
      				}
    			}
  	}
}
