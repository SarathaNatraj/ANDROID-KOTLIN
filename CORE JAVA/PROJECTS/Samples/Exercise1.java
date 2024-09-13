
public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Let initial value of j be 15,
		int j = 15, i;
		i = j; // i =  15, j =15
		i += 5; // i =  i + 5, i = 20
		i = i + 5; // 25
		i -= 5; //20
		i *= 5; //100
		i /= 5; //20 -> quotient of the operation
		i %= 5; //0 -> % - reminder of the operation
		
		System.out.println(i);
		System.out.println(j);
		
		float b = 3.4f, c = 1.2f;
		int bb = (int)b; //higher to smaller is not allowed
		int a = (int)(b/c);
		//if converting higher datatype to lower datatype,  - downcasting (demotion)
		//if converting lower datatype to higher datatype -  upcasting (promotion)
	
		byte s = 25; //byte - smaller datatype, int is higher 
		int ss = s; // smaller to higher is allowed
		
	}

}
