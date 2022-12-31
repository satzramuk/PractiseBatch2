package constructor;

public class ParameterizedConstructorDemo {

	public ParameterizedConstructorDemo(int a){

		System.out.println("My first Constructor");

	}

	public ParameterizedConstructorDemo(double b,int a){

		System.out.println("My second Constructor");

	}

	public ParameterizedConstructorDemo(char c, double b){

		System.out.println("My third Constructor");

	}


	public static void main(String[] args) {
		
		new ParameterizedConstructorDemo(30);
		new ParameterizedConstructorDemo('G', 0.08);
		
		


	}

}
