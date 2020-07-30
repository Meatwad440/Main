/*		Week 4 lab assignment
		Author Nick HUtson
*/

public class Account {

	static int numAccounts = 0;

	Account	() {

		//Set increment
		numAccounts = numAccounts + 1;
	}

	public static void main (String[]args) {


		Account savings = new Account();

		Account checking = new Account();

		Account investment = new Account();
		
		Account trust = new Account();

		System.out.println("The total number of open accounts is "+getNumAccounts());

	}

	private static int getNumAccounts () {

		return numAccounts;

	}

}