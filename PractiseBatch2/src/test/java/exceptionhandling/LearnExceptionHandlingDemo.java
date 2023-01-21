package exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LearnExceptionHandlingDemo {
	
	public void testmethod()  {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void code() {
		
		try {
			Thread.sleep(3000);
			
		} catch (InterruptedException e) {
			throw new RuntimeException();
		}
	}
	

	public static void main(String[] args) {

		LearnExceptionHandlingDemo obj1 = new LearnExceptionHandlingDemo();
		obj1.code();

		System.out.println("Enter Some Input :");
		Scanner sc=new Scanner(System.in);
		try {
			int num = sc.nextInt();
			
			int	a = num % 0;
			System.out.println("O/P of the program :"+a);
		}catch (InputMismatchException e) {
			//e.printStackTrace();
			throw new RuntimeException();


		}
		catch (ArithmeticException e) {

			e.printStackTrace();
		}
		catch (Exception e) {

			System.out.println("Enter the digit less than zero");

		}
		finally {
			sc.close();
		}
		System.out.println("Completed Program Successfully");




	}

}
