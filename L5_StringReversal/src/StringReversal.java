import java.util.Scanner;

public class StringReversal {
	
public static void main(String[] args) {
		
		Scanner phrase = new Scanner(System.in);
		
		System.out.println("Enter a phrase: ");
		
		String s = phrase.nextLine();
		
		System.out.println(reverseString(s));

	}

public static String reverseString(String s) {
	if (s.isEmpty())
		return s;
	return reverseString(s.substring(1)) + s.charAt(0); //recursive method to replace string characters
}



}
