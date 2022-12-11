package arraysDemo;

public class SingleDArrayDEmo {
	
	

	public static void main(String[] args) {
		
		int a = 5;
		int b =4;
		int c =3;
		int d =2;
		int e = 1;
		
		int dw [] = {5,4,3,2,1};
		//(or)
		int dw1[] = new int[5];
		dw1[0] = 5;
		dw1[1] = 4;
		dw1[2] = 3;
		dw1[3] = 2;
		dw1[4] = 1;
//or
		int [] dw2 = new int[5];

          
       //   int ab[] = {10,11,12,16,14,15};
          
        //  (or)
          
          int ab[] = new int[5];
         // (or)
          //int []bc = new int[7];
          
          
          ab[0] = 10;
          ab[1] = 11;
          ab[2] = 12;
          ab[3] = 13;
          ab[4] = 14;
          ab[5] = 15;
          
          
          System.out.println("Array value is :"+ab[5]);
          
          for(int i=0;i<ab.length;i++) {
        	  
        	  System.out.println("List of array values :"+ab[i]);
          }
          
          
          
	}

}
