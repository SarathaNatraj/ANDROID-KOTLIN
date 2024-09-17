package day2;

public class InitBlock {
	public long idNum;
	public String name="<unnamed>";
	public InitBlock orbits=null;
	private static long nextId=5;

	//init block
	{	
	 	idNum=++nextId;
	}

	public InitBlock() {
		super();
		name="emptyname";
		orbits=new InitBlock("emptyname");
	}
	
	public InitBlock(String name) {
		this.name=name;
	}
	
	@Override
	public String toString() {
		return "InitBlock [idNum=" + idNum + ", name=" + name + ", orbits=" + orbits + "]";
	}

	public InitBlock(String bodyName,InitBlock orbitsAround){
	name=bodyName;
	orbits=orbitsAround;
	}
	public static void main(String args[]) {
		
		InitBlock ib = new InitBlock();
		System.out.println(ib.idNum + " \t "+ib.name+ " \t "+ib.orbits);
		System.out.println(ib.nextId);
		
		
		InitBlock ib1 = new InitBlock("demo", ib);
		System.out.println(ib1.idNum + " \t "+ib1.name+ " \t "+ib1.orbits);
		System.out.println(ib1.nextId);
	
	}

	
	

}

