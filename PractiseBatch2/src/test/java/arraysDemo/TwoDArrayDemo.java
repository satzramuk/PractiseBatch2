package arraysDemo;

public class TwoDArrayDemo {

	public static void main(String[] args) {

		int marks[][] = new int [2][2];
		
//		int markss[][];
//		
//		markss = new int[3][6];
//	
		
		marks[0][0]=12;
		marks[0][1]=24;
		marks[1][0]=12;
		marks[1][1]=16;
		
		System.out.println(marks[1][1]);
		
		System.out.println("***************");
		
		for(int i=0;i<marks.length;i++) {
			for(int j=0;j<marks[i].length;j++) {
				System.out.println("Values of 2D array :"+marks[i][j]);
			}
		}
		
		
		System.out.println("***************");
 
		int b[][] = new int[4][];
		
		b[0]= new int[5];
		b[1]= new int[3]; 
		b[2]= new int[5];
		b[3]= new int[5];


		
		
		
		
	}

}
