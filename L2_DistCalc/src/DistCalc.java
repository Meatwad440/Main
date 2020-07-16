import java.lang.Math;
import java.util.Scanner;
import java.text.DecimalFormat;
public class DistCalc {

	public static void main(String[] args) {
	//user input of x and y values
		
		Scanner in = new Scanner (System.in);
		
		System.out.print("Input x1: ");
		int x1 = in.nextInt();
		
		System.out.print("Input x2: ");
		int x2 = in.nextInt();
		
		System.out.print("Input y1: ");
		int y1 = in.nextInt();
		
		System.out.print("Input y2: ");
		int y2 = in.nextInt();
		
	//calculation for distance given x and y	
		double dist;
		dist = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
			
	//3 sig fig for dist
		DecimalFormat fmt = new DecimalFormat ("0.###");
		
	//total distance output
		
	System.out.println("Total distance is " + fmt.format(dist) + " units measured.");	
	
	}
	
}
