import java.util.Scanner;
import java.util.Random;

public class UserNames {

	public static void main(String[] args) {
		
		//Generate random number between 10 and 99
		Random gen = new Random ();
		int num = gen.nextInt(99) +10;
	
		//Collect user first and last name
		Scanner in = new Scanner (System.in);
		
		System.out.print("Enter your first name:  ");
		String firstName = in.next();
		
		System.out.print("Enter your last name:  ");
		String lastName = in.next();
		
		System.out.println("Hello " + firstName + " " + lastName);
		
		//Generate modified strings for first and last name
		String modFirstName, modLastName;
		
		modFirstName = firstName.substring(0,1);
		modLastName = lastName.substring(0,4);	
		
		//Generate string with all required information
		String nameComb = modFirstName + modLastName + num;
		
		//Print out generated string	
		System.out.println("Your username is " + nameComb);
		
		
		
		
		

	}

}
