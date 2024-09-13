
public class ArraysExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//array initialization
		int [ ] daysInMonths = { 31, 28, 31, 30};
		
		for (int i = 0; i < daysInMonths.length; i++)
	        System.out.println (daysInMonths [i]);

		//array initialization
		String [ ] zones = { "East", "West", "North", "South" } ;
		for (int i = 0; i < zones.length; i++)
	        System.out.println (zones [i]);
		
		int [ ][ ] pascalsTriangle = {
				  {1},
				  {1, 1},
				  {1, 2, 1},
				  {1, 3, 3, 1},
				  {1, 4, 6, 4, 1}
				};

		for(int i = 0; i< pascalsTriangle.length;i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print(pascalsTriangle[i][j] + "\t ");
			}
			System.out.println();
		}
		
	}

}
