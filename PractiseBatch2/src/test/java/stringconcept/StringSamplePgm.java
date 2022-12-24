package stringconcept;

public class StringSamplePgm {

	public static void main(String[] args) {


		/*
		 * i/p string = "automation-testing"; 
		 * o/p string = "testing";
		 */		


		//Using Split Way
		String input_string = "automation-testing";
		String output_string = input_string.split("-")[1];
		System.out.println("Output value is :"+output_string);

		//Using Substring Way
		String input_string1 = "automation-testing";
		String output_string2 = input_string1.substring(11);
		System.out.println("Substring values are :"+output_string2);
	}

}
