package constructor;

public class ThisKeywordDemo {

	public ThisKeywordDemo() {

		System.out.println("My First Default Constructor");

	}

	public ThisKeywordDemo(int a) {

		this();
		System.out.println("My Second Parameterized Constructor");

	}

	public ThisKeywordDemo(double b, int a) {

		this(25);
		System.out.println("My Third Parameterized Constructor");

	}

	public ThisKeywordDemo(char c, double b, int a) {

		this(25.11, 33);
		System.out.println("My Fourth Parameterized Constructor");

	}


	public ThisKeywordDemo(char c, double b) {

		this('M',25.11, 33);
		System.out.println("My Fifth Parameterized Constructor");

	}

	public ThisKeywordDemo(double b) {

		this('M',25.11);
		System.out.println("My Sixth Parameterized Constructor");

	}



	public static void main(String[] args) {
		
		ThisKeywordDemo demo = new ThisKeywordDemo(23.22);


	}

}
