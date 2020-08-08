

import java.util.Scanner;

public class DivisorCalc {

public static void  main(String [] args)
	{ //driver program
	    Scanner input = new Scanner(System.in);
	    System.out.println("Number 1:");
	    int num1 = input.nextInt();
	    System.out.println("Number 2:");
	    int num2 = input.nextInt();

	    System.out.println("The GCD is " +  gcd(num1,num2));
	}

	
public static int gcd(int num1, int num2) {
		
		if(num2 <= num1 && num2 % num1 == 0) {
			return num1;
		}
		if(num1 < num2) {
			return gcd(num2, num1);
		}
		return gcd(num2, num1%num2);
	}

}
