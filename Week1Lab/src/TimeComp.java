
public class TimeComp {

	public static void main(String[] args) {

		int input = 9999;
		int numberOfDays;
		int numberOfHours;
		int numberOfMinutes;
		int numberOfSeconds;
		
		numberOfDays = input / 86400;
		numberOfHours = (input % 86400) / 3600;
		numberOfMinutes = ((input % 86400) % 3600) / 60;
		numberOfSeconds = ((input % 86400) % 3600) % 60;
		
		System.out.print(numberOfDays + "D:" + numberOfHours + "H:" + numberOfMinutes + "M:" +numberOfSeconds + "S");
		
	}

}
