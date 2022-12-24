package stringconcept;

public class StringBufferDemo {

	public static void main(String[] args) {
		// To demonstrate the string buffer is mutable
		
		System.out.println("String is Immutable");
		String name= "Arya";
		System.out.println("Appending a name with Arya :"+name.concat("prasath"));
		System.out.println("Original name : "+name);
		
		
		System.out.println("StringBuffer is Mutable");
		StringBuffer name1= new StringBuffer("Arya");
		StringBuilder name12= new StringBuilder("Arya");
		System.out.println("Appending a name with Arya :"+name1.append("prasath"));
		System.out.println("Original name : "+name1);
		
		System.out.println("****************************************");
		
		//StringBuffer Methods
		
		// Reverse
		
		System.out.println("1st method :"+name1.reverse());
		
		StringBuffer replacethis= new StringBuffer("Arul");

		// Replace
		System.out.println("2nd Method :"+replacethis.replace(0, 3, "Riya"));
		
		
		//Delete
		
		StringBuffer deletethis= new StringBuffer("xyzArul");
		System.out.println("3rd Method :"+deletethis.delete(0, 3));
		
		//Insert
		StringBuffer insertthis= new StringBuffer("Moni");
		System.out.println("4th Method :"+insertthis.insert(4, "sha"));
		
		//capacity
		System.out.println("4th Method :"+insertthis.capacity());
		
		
        // Methods like CharAt, Substring, length method also applicable in StringBuffer Class



		
		
		
		
		
		
		


	}

}
