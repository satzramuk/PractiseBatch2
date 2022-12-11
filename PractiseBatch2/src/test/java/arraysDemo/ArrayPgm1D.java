package arraysDemo;

public class ArrayPgm1D {

	public static void main(String[] args) {
		
		int dw1[] = new int[5];
		dw1[0] = 5;
		dw1[1] = 4;
		dw1[2] = 3;
		dw1[3] = 2;
		dw1[4] = 1;
		
		System.out.println("Particular values of array :"+dw1[2]);
		
		System.out.println("********************For Loop********************");
		
		for(int i=0;i<dw1.length;i++) {
			System.out.println("Entire values of array is :"+dw1[i]);
	
		}
		
		
		System.out.println("*********************While loop*******************");

		
		int [] numbers= {5,4,3,2,1};
		int index =0;
		
		while(index<numbers.length) {
			System.out.println("Entire values of array using while loop :"+numbers[index]);
			index++;
		
		}
		
	//	System.out.println(dw1[5]);

	}
	
	

}
