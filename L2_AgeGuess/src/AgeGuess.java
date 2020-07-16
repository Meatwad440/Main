import java.util.Scanner;
import java.util.Random;

public class AgeGuess {

	public static void main(String[] args) {
				
		Random gen = new Random ();
		
		int age = gen.nextInt(101);
		
		Scanner in = new Scanner (System.in);
		
		System.out.print("What is your first name?  ");
		String name = in.next();
		
		System.out.print("How old am I?  ");
		int ageGuess = in.nextInt();
		
		System.out.println("Your name is " + name + " and you guessed I am " + ageGuess +" years old, but I am " + age);
		
	}

}
