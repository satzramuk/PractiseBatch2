package stringconcept;

public class StringSamplePgm {

	public static void main(String[] args) {

		
		/*
		 * i/p string = "automation-testing"; 
		 * o/p string = "testing";
		 */		
		
		
		String input_string = "automation-testing";
		String output_string = input_string.split("-")[1];
		System.out.println("Output value is :"+output_string);
	}

}
