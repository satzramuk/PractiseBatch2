package encapsulation;

public class Employee {
	

	private int id;
	private String firstname;
	private String lastname;
	private String email;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	public String getFirstname() {
		return firstname;
	}

	public Employee setFirstname(String firstname) {
		
		if(firstname!=null) {
			this.firstname=firstname;
		}
		else {
			this.firstname = "default name";

		}
		return this;
	}
	
	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	public Employee(int id,String firstname,String lastname,String email) {
		
		this.id = id;
		this.firstname =firstname;
		this.lastname = lastname;
		this.email=email;
		
	}

	
}
