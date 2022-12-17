package loopStatements;

public class ReverseString {

	public static void main(String[] args) {
		//Reverse String another Approach
		
		//Using char way to reverse an string
		
		String str = "Programming";
		//System.out.println("Character at index :"+str.charAt(5));
		String nstr = "";
		
		char ch;
		
		for(int i=0;i<str.length();i++) {
			
			ch = str.charAt(i);
			nstr = ch+nstr;
			System.out.println("String inside loop :"+nstr);
			
		}
		
		System.out.println("Reverse String is :"+nstr);
		
		
		
		//Approach 2
		
		
		String input = "softwaretesting";
		String output = "";
		
		for(int i=input.length()-1;i>=0;i--) {
			
		output = output + input.charAt(i);

		
		}
		System.out.println("Reversed output String is :"+output);

		
		}
		
		
		
		

	}


