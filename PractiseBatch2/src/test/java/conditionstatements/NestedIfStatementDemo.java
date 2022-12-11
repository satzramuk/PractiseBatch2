package conditionstatements;

public class NestedIfStatementDemo {

	public static void main(String[] args) {


		int a =15;
		int b= 30;
		int c= 15;


		if(a==5 || b==20) // OR operator
		{
			System.out.println("Values are :"+(b+c));

		}
		else if (a==10) {

			System.out.println("Values are :"+(a+c));

		}
		else if (a==15 && b==30) { // and operator

			System.out.println("Values are :"+(a-c));

		}
		else {
			System.out.println("Not matching");
		}



	}

}
