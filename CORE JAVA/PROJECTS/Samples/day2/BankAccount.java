package day2;

class BankAccount {
	
	//varaibles
	private int id;
  	private float curBal;
  	//access_specifier data_type variable_name;
  	//access_specifier data_type variable_name=value;
  	private String name;

  	//constructor  	
  	
  	
  	
  	public BankAccount(int id, float curBal, String name) {
		super();
		this.id = id;
		this.curBal = curBal;
		this.name = name;
	}
  	
  	

	public BankAccount() {
		super();
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public void setCurBal(float curBal) {
		this.curBal = curBal;
	}



	//method definition 
  	//access_specifier void/return method_name(arguments){
  	// method_body
  	//}
  	public  void deposit (float amt) {
    			curBal += amt; 
  	}

  	public void withdraw (float amt) { 
    			curBal -= amt;	
  	}
  	
  	public float getCurBal ( ) {
		return curBal; 
}

  	 static int idNum = 1000;


	@Override
	public String toString() {
		return "BankAccount [id=" + id + ", curBal=" + curBal + ", name=" + name + "]";
	}
	
	public static int getIdNum () {
		return idNum; 
}

  	
  	

  }

