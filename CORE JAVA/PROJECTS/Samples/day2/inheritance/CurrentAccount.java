package day2.inheritance;

class CurrentAccount extends BankAccount{
	private float overDraftLimit;

	CurrentAccount( String name, float bal, float odl){
			super( name, bal);
			overDraftLimit = odl;
	}
	public void print ( ){
			super.print( );
			System.out.println ("OverDraftLimit : " + overDraftLimit);
	}
}

