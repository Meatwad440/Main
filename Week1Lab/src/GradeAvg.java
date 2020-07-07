import java.util.Scanner;

public class GradeAvg {
	
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		System.out.println("Input first quiz score");
		double quizScore1 = in.nextDouble();
		
		System.out.println("Input second quiz score");
		double quizScore2 = in.nextDouble();		
	
		System.out.println("Input third quiz score");
		double quizScore3 = in.nextDouble();
		
		System.out.println("Input first test score");
		double testScore1 = in.nextDouble();
		
		System.out.println("Input second test score");
		double testScore2 = in.nextDouble();
		
		double quizScoreAvg = (quizScore1 + quizScore2 + quizScore3) / 3;
		
		double testScoreAvg = (testScore1 + testScore2) / 2;
		
		System.out.println("Your average quiz score is:"+quizScoreAvg+"%");
		
		System.out.println("Your average test score is:"+testScoreAvg+"%");
	}

}
