/*		Week 4 lab assignment
		Author Nick HUtson
*/

public class Box {

	int size = 0;
    
    //Overload
    public void printBox(String string) {
    	
    	for (int i=0; i<size; i++) {
    	for (int j=0; j<size; j++)
    		
    		System.out.print(string);
    	System.out.println();
    	}
    	
    }
    
    //Method to print box with stars
    
    public void printBox() {
    	
    	for (int i=0; i<size; i++) {
    	for (int j=0; j<size; j++) 
    		
    		System.out.print("*");
    	  	System.out.println();
    	}
    }
    
    //Main with invoke printBox and size
    
    public static void main (String[] args) { 
    	
    	//Create a new instance of our "Box" class
    	
    	Box box = new Box();
    	
    	//Assign the Box size variable
    	
    	box.size = 5;
    	    	
    	box.printBox();
    	
    	System.out.println("And now for something completely different...");
    	
    	box.printBox("c");
    }
}

  