package interfacedemo;

public class HDFC implements RBI{
	
	public void interestratehome() {
		
	}

	@Override
	public void aadharMandatory() {
		
		System.out.println("Getting aadhar details from customer");
		
	}

	@Override
	public boolean panMandatory() {
		
		return true;
		

		
	}
	
	
	

}
