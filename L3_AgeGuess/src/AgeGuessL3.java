import java.util.Random;
import java.util.Scanner;

public class AgeGuessL3 {

	public static void main(String[] args) {
		
		
		Random gen = new Random ();
		
		int count = 1;
		int age = gen.nextInt(100);
		
		Scanner in = new Scanner (System.in);
		
		System.out.print("What is your first name?  ");
		String name = in.next();
		
		System.out.print("How old am I?  ");
		int ageGuess = in.nextInt();
		
		if (ageGuess < age)
			System.out.println("older");
		
		if (ageGuess > age)
			System.out.println("younger");
		
		if (ageGuess != age)
			System.out.println("You guessed wrong! Please Guess again:  ");	
	
		while (ageGuess != age) {	
			ageGuess = in.nextInt();
			count++;
			if (ageGuess > age) {
				System.out.println("younger");
				System.out.println("Guess again:  ");
			} else if (ageGuess < age) {
				System.out.println("older");
				System.out.println("Guess again:  ");
			}
					}
		
		if (ageGuess == age)
			System.out.println("That's correct " + name + ", I am " + age + " years old.");
			System.out.println("That took you " + count + " guesses!");
		
		
	}
}