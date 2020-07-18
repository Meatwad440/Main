//Cipher Application by Nick Hutson

//Imports required for script

import java.util.Scanner;
import java.util.Random;

public class Cipher {

	public static void main(String[] args) {
		
//Declarations
		
		int num1, num2, num3, num4, num5, total;
		double cipherHold1, cipherHold2, finalCipher;
		String error = "Please read directions and try again!";
		
//Program greeting
		
		System.out.println("Programming Fundamentals");
		System.out.println("NAME: Nick Hutson");
		System.out.println("PROGRAMMING ASSIGNMENT 1");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Welcome to the Cipher program.");
		
//Begin to collect user input for 5 integers 0-19 inclusive
		
		System.out.println("Please enter 5 numbers between 0 and 19");
		
		Scanner in = new Scanner (System.in);
		
		System.out.print("1st number:  ");
		num1 = in.nextInt();
		
		if (num1 > 19) {
			System.out.println(error);
			System.exit(0);}
		if (num1 <0) {
			System.out.println(error);
			System.exit(0);}

		System.out.print("2nd number:  ");
		num2 = in.nextInt();
		
		if (num2 > 19) {
			System.out.println(error);
			System.exit(0);}
		if (num2 <0) {
			System.out.println(error);
			System.exit(0);}
		
		System.out.print("3rd number:  ");
		num3 = in.nextInt();
		
		if (num3 > 19) {
			System.out.println(error);
			System.exit(0);}
		if (num3 <0) {
			System.out.println(error);
			System.exit(0);}
		
		System.out.print("4th number:  ");
		num4 = in.nextInt();
		
		if (num4 > 19) {
			System.out.println(error);
			System.exit(0);}
		if (num4 <0) {
			System.out.println(error);
			System.exit(0);}
		
		System.out.print("5th number:  ");
		num5 = in.nextInt();
		
		if (num5 > 19) {
			System.out.println(error);
			System.exit(0);}
		if (num5 <0) {
			System.out.println(error);
			System.exit(0);}
		
//Data collection complete. Perform calculations and program required actions.
		
		total = num1 + num2 + num3 + num4 +num5;
			System.out.println("Total = " + total);

//Generate random key
		
		Random gen = new Random ();
		int key = gen.nextInt(10);
			System.out.println("Your random key is " + key);
		
//Perform modulo shift		
		
		cipherHold1 = (total - (total % 10)) / 10;
		cipherHold2 = total % 10;
		finalCipher = (((cipherHold1 + key) % 10) * 10) + ((cipherHold2 +key) % 10 );
				
//Convert encoded number finalCipher to int from float		
		int finalCipherWhole = (int) finalCipher;
			
//Conditional to ensure 2 digit encoded number		
		
		if (finalCipherWhole >= 10) {
		System.out.println("Your encoded number is " + finalCipherWhole);}
		if (finalCipherWhole < 10) {
		System.out.println("Your encoded number is 0" + finalCipherWhole);}
		
		
	}

}
