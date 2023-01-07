package encapsulation;

public class Runner {

	public static void main(String[] args) {
		
		//When we need to use constructor, 
		//We need to use getters and setters concept
		
	Employee employee = new Employee(5, "Vijay", "K", "vijay34@gmail.com");
	//System.out.println(employee.getId());
	System.out.println(employee.getFirstname());
	employee.setFirstname(null);
    System.out.println(employee.getFirstname());
	
	//System.out.println(employee.getLastname());
	//System.out.println(employee.getEmail());

		

	}

}
