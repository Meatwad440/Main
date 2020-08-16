//************************************************************
//  Lab 6 Exercise 1				Nick Hutson
//************************************************************

import java.util.*;

public class L6_Exer1 {

	public static int simpleTime(int n) 
	{
		int simpleTime = 0;
		for (int j = 0; j < n; j++)
			for (int k = 0; k < n; k++)
				for (int l = 0; l < n; l++)
					simpleTime++;
		return simpleTime;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an Integer: ");
		int n = sc.nextInt();
		System.out.println("\nSum is: " + simpleTime(n));
	
	}
	
}
