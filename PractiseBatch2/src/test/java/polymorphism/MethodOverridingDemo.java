package polymorphism;

//Parent -> Base -> Super 
class Parent{
	
	public void debay() {
		
		int b=10;
		int c=20;
		int a=(b+c);
		System.out.println(a);
		
		
	}
	
	void display() {
		System.out.println("Its an SuperClass method/ Parent Class method");
	}
	
}

//Child -> Sub -> Derived
class Child extends Parent {
	void display() {
		System.out.println("Its an Subclass method/ Derived Class method");
	}
	
}
public class MethodOverridingDemo {

	public static void main(String[] args) {
		
		Child obj1 = new Child();
		//obj1.display();
		obj1.debay();
	
		
		
//		Parent obj2 = new Child();
//		obj2.display();
//		
		
		


	}

}
