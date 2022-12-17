package arraysDemo;

public class DuplicateArrayDemo {

	public static void main(String[] args) {

		String names[] = {"Java", "Javascript","Ruby", "C", "Python", "java"};
		
		for(int i=0; i<names.length; i++) {
			for(int j=i+1;j<names.length;j++) {
				if(names[i].equalsIgnoreCase(names[j])) {
					System.out.println("duplicate element is ::"+names[i]);
				}
			}
			
		}
		
		
	}

}
