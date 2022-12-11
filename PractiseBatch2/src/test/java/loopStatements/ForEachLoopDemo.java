package loopStatements;

public class ForEachLoopDemo {

	public static void main(String[] args) {
		
		
		/*for(initialize ; condition ; increment/decrement)
		{

		Code here/ Logic here/

		}
*/
		
		int arr[] = {5,6,4,3,6,7};
		
		//conventional way of For loop
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Array values are :"+arr[i]);
			
		}
		
		
		//for each way
		for (int i : arr) {
			System.out.println(i);
			
		}
		

	}

}
