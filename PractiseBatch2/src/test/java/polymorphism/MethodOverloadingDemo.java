package polymorphism;

public class MethodOverloadingDemo {
	
//	public static String value = "Raj";
//	public String anothervalue = "sathish";
	
	void school(int a,String b) {
		
		System.out.println("My first non static method");
		
	}
	
	
	static void school(double b, int a) {
		System.out.println("My second static method");
	}
	
	static void school(char c,double b, int a) {
		System.out.println("My third static method");
	}
	
	void school(char c,double b) {
		System.out.println("My fourth non-static method");
	}
	
	void school(double b) {
		System.out.println("My fifth non-static method");
	}
	
	void school(float z) {
		System.out.println("My sixth non-static method");
	}
	

	public static void main(String[] args) {
		
		MethodOverloadingDemo obj1 = new MethodOverloadingDemo();
		obj1.school(8,"Vijay");
		MethodOverloadingDemo.school(8.15, 9);
		obj1.school('H', 0.25);
		MethodOverloadingDemo.school('B', 2.56, 9);
		obj1.school(7.00);
		

	}

}
