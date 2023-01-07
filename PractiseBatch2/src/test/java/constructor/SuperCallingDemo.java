package constructor;

class Ravi{

	Ravi(){
		System.out.println("Hi Ravi");
	}
}

class Vijay extends Ravi{

	Vijay(int b){
		super();
		System.out.println("Hello Vijay");
	}

}

class Ranjith extends Vijay{

	Ranjith(){
		super(9);
		System.out.println("Hello Ranjith");
	}

}





public class SuperCallingDemo {

	public static void main(String[] args) {

		new Ranjith();

	}

}
