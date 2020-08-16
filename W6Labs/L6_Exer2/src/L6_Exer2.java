//************************************************************
//  Lab 6 Exercise 2				Nick Hutson
//************************************************************

public class L6_Exer2 {

	public static void main(String[] args) {
		
		int N = 0; 
		System.out.println(foo(N));
	}

	static int foo(int N) {
		int result = 0;
		for (int i = 0; i < N; i++)
			result++;
		for (int j = 0; j < 1000000; j++) 
			result += j;

		return result;
		
	}

}
