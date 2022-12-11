package loopStatements;

public class ReverseString {

	public static void main(String[] args) {
		
		String str = "Programming";
		System.out.println("Character at index :"+str.charAt(5));
		String nstr = "";
		
		char ch;
		
		for(int i=0;i<str.length();i++) {
			
			ch = str.charAt(i);
			nstr = ch+nstr;
			System.out.println("String inside loop :"+nstr);
			
		}
		
		System.out.println("Reverse String is :"+nstr);
		
		

	}

}
