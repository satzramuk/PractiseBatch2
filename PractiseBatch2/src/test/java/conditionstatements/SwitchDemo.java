package conditionstatements;

public class SwitchDemo {

	public static void main(String[] args) {
		
		char attendance = 'O';
		
		switch(attendance)	
		{
		
		case 'O':
			System.out.println("On-Duty");
			break;
		
		case 'P':
			System.out.println("Attend Classes");
			break;

			
		case 'A':
			System.out.println("Not Attend Classes");
			break;

			
			default :
				System.out.println("Invalid ");
		
		
		

	}

}
}
