import java.util.Scanner;

public class AgeGuess {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		System.out.print("What is your first name?");
		String name = in.next();
		
		System.out.print("What is your age?");
		int ageGuess = in.nextInt();
		
		System.out.println("Your name is " + name + " and you are " + ageGuess +" years old.");
		
	}

}
