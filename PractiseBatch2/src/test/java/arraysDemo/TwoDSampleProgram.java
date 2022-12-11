package arraysDemo;

public class TwoDSampleProgram {

	public static void main(String[] args) {
		
		int mat[][] = { {10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50},
              };
		
		
	    for(int i=0; i<mat.length; i++) {
	        for(int j=0; j<mat[i].length; j++) {
	            System.out.println("Values at arr["+i+"]["+j+"] is "+mat[i][j]);
	        }
	    }


		System.out.println("***************");
		for(int rows=0;rows<mat.length;rows++){
		    for(int columns=0;columns <mat[rows].length;columns++){
		        System.out.print(mat[rows][columns] + "\t" );
		        }
		    System.out.println();
		    }
	    
	}

}
