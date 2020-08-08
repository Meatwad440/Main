import java.util.Scanner;
import java.io.*;

public class UserStrings {

public static void main(String[] args) throws IOException {
		
		Scanner strings = new Scanner(System.in);
		System.out.println("Input strings to save to text file. \nType DONE when finished.");
		
	       PrintWriter pw = new PrintWriter(new File("userStrings.txt"));
	       while (true){
	           String user = strings.nextLine();
	           if(user.equalsIgnoreCase("DONE")){
	                pw.close();
	              
	               break;
	           }
	           pw.println(user);
	       }
	      
	   }

	}