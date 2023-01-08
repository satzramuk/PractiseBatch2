package interfacedemo;

public interface RBI {
	//Syntax: Accessmodifier interface interfacename
	int UPILimit = 100000;
	
	abstract void aadharMandatory();
	
	abstract boolean panMandatory();
	
	default void interestrate() {
		
		System.out.println("Interest rate is 10%");
	}
	
	static void mail() {
		System.out.println("Mail");
	}

}
	
