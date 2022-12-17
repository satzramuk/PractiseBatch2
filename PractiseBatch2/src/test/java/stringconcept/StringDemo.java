package stringconcept;

public class StringDemo {

	public static void main(String[] args) {
		
		
		//Using String literal Way
		
		//String s = "Raj";
		
		//Using new Keyword way
		
		//String s1 = new String("Agni");
		
		System.out.println("*******************************");
		
		//Here we will see list of String methods and String concepts

				String name = "SathishKumar";
				String value = " Raj Kumar ";
				int number = 3;
				
				

				//returns character value for the particular index

				System.out.println("1st one is: "+name.charAt(1));
				
				//returns string length

				System.out.println("2nd one is: "+name.length());
				
				//checks the equality of string with the given object

				System.out.println("3rd one is: "+name.equals("SathishKumar"));
				
				//checks the equality of string with the given string object without case sensitivity

				System.out.println("4th one is: "+name.equalsIgnoreCase("SATHISHKUMAR"));
				
				//Checks if string is empty or not
				System.out.println("5th one is: "+name.isEmpty());

				//returns true or false based on the given value is present or not
				System.out.println("6th one is: "+name.contains("a"));
				
				//take a particular portion of the string
				System.out.println("7th one is: "+name.substring(3));
				
				//take a particular portion of the string begin and end index
				//				String name = "SathishKumar";
				System.out.println("8th one is: "+name.substring(1, 5));
				
				
				//appends the string to the given string
				System.out.println("9th one is: "+name.concat("Maruti"));
				
				//replaces the existing char with given char
				System.out.println("10th one is: "+name.replace("a", "A"));
				System.out.println("10th one is: "+name.replace("Sathish", "Siva"));
				
				//finds the position of a character in the String
				System.out.println("11th one is: "+name.indexOf("i"));
				
				//finds the character specified from the index position
				//				String name = "SathishKumar";
				System.out.println("12th one is: "+name.indexOf("a",5));
				
				//Trim will remove the white spaces before and after
				//String value = " Raj Kumar ";

				System.out.println("13th one is: "+value.trim());
				
				//convert the given data type to String
				System.out.println("14th one is: "+String.valueOf(number));
				
				
				//converts your uppercase string to lowercase string
				String upperCase = "SATHISHKUMAR";
				System.out.println("15th one is: "+upperCase.toLowerCase());
				
				//converts your lowercase string to uppercase string
				String lowerCase = "sathishkumar";
				System.out.println("16th one is: "+lowerCase.toUpperCase());
				
				
				//Returns a Joined String with Given delimiter
				System.out.println("17th one is: "+String.join("-", "Learn","Testing","Online"));
				System.out.println("18th one is: "+String.join("/", "24","05","2021"));
	
				
				
				//split
				String splitThis ="Am,I,teaching,good?";
				String[] splited = splitThis.split(",");
				
			String op=	splitThis.split(",")[3];
			System.out.println("Output Value :"+op);
				
				for (String val : splited) {
					
					System.out.println("Values are :"+val);
					
				}
				
				






		
		
		

		
		
		
		

	}

}
