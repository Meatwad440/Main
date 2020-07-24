import java.util.Scanner;

public class VowelCounter {
	

	public static void main(String args[]){
		
		Scanner keyboard = new Scanner(System.in);
	    System.out.println("Please type a sentence: ");
	    
	    String input=keyboard.nextLine();
	    char []chars=input.toCharArray();


	    int spaces = 0;
	    int consonants = 0;
	    int vowelCountA = 0;
	    int vowelCountE = 0;
	    int vowelCountI = 0;
	    int vowelCountO = 0;
	    int vowelCountU = 0;

	//Count all lower case vowels from input string
	    
	    for (int a=0 ; a<input.length(); a++) {
	    	char ch = input.charAt(a);
	    	if (ch == 'a') {
	    		++vowelCountA;}
	    	if (ch == 'e') {
	    		++vowelCountE;}
	    	if (ch == 'i') {
	    		++vowelCountI;}
	    	if (ch == 'o') {
	    		++vowelCountO;}
	    	if (ch == 'u') {
	    		++vowelCountU;}
	    	if (ch >='a' && ch <= 'z') {
	    		++consonants;}
	    	if (ch == ' ') {
	    		++spaces;}
	    }
	    

		
	//Store sum of all vowels
	    
	    int vowelSum = vowelCountA + vowelCountE + vowelCountI + vowelCountO + vowelCountU;
	    
	    int charTotal = spaces + consonants;
	    
	//Count all characters in string
	    
	    System.out.println("Number of vowels = " + vowelSum);
	
	//Left this in from trouble shooting
	//    System.out.println(vowelCountA+"::"+vowelCountE+"::"+vowelCountI+"::"+vowelCountO+"::"+vowelCountU);    

	    System.out.println("Total non vowel characters in sentence = " + charTotal);
	}}