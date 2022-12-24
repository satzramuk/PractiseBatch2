package abstractionandinterface;

public class BMW extends Car implements UpcomingProjects{

	@Override
	public void engineSecret() {
		
		System.out.println("Custom engine secret for BMW");
		
	}

	@Override
	public void companyvault() {
		
		System.out.println("Custom company vault for BMW");

		
	}

	@Override
	public void demoproject() {

		System.out.println("-------------");
	}
	
	
	

}
