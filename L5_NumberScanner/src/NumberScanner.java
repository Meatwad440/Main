
import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class NumberScanner {

	public static void main(String[] args) {
	
		
				try {
					//Open file
					File f = new File("input.csv");
					Scanner scanFile = new Scanner(f);
					
					
					String[] maxValues = null;
					String line;
					int row = 1;
					
					//Read and evaluate each line
					while (scanFile.hasNext()) {
						line = scanFile.nextLine();
						maxValues = line.split(",");
						int max = 0;
						for (int i = 0; i < maxValues.length; i++) {
							int current = Integer.parseInt(maxValues[i]);

							if (max < current) {
								max = current;
							}
						}
						System.out.println("Row " + row + ": " + max);
						max = 0;
						row++;
					}
					scanFile.close();
				} catch (IOException e) {
					e.printStackTrace();
				}

	}

}
