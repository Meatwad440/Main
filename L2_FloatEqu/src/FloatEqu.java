
public class FloatEqu {

	public static void main(String[] args) {
	
	//Declare two doubles
	Double x = ((1.0/10)*(1.0/10));
	Double y = (1.0/100);
	
	if (x == y) {
		System.out.println("Equal");
	} else if (x !=y) {
		System.out.println("NOT EQUAL");
	}
	
	//Conditional for equality approximation
	Double TOLERANCE = 0.000001;
			
	if (Math.abs(x-y) < TOLERANCE) {
		System.out.println("...But essentially equal");
	}
	
	}

}
