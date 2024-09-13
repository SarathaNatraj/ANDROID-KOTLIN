public class LabelledBreak {
	public static void main (String [ ] args) {
			xyz:
    			for (int i = 1; i <= 10; i++) {
      				for (int j = 1; j <= 5; j++) {
        			System.out.print ("\t" + (i * j));
	        		if ( (i * j) == 12){
    			      			break xyz;
					}
      				}
      				System.out.println ();
    			}
			System.out.println ();
			
			//array declaration
			int [ ] intArray = new int [5]; 

		    for (int i = 0; i < intArray.length; i++)
		        System.out.println (intArray [i]);

  	}
}
