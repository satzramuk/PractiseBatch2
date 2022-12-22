package constructor;

public class DefaultConstructor {
	
	int id;
	String name;
	
	
	
	void display() {
		System.out.println(id+" "+name);
	}

	public static void main(String[] args) {
		
		DefaultConstructor s1 = new DefaultConstructor();
		s1.display();
		

	}

}
