public class Driver {

	public static void main(String[] args) {

		LinkedStack link = new LinkedStack();
		ArrayStack array = new ArrayStack();

		link.push(1);
		link.push(7);
		link.push(3);
		link.push(4);
		link.push(9);
		link.push(2);

		System.out.println(link);

		System.out.println(link.peek() + " Has Been Removed.");
		
		link.pop();
		
		System.out.println(link + "\n" + link.peek() + " Has Been Removed.");
		
		link.pop();
		
		System.out.println(link + "\n" + link.peek() + " Has Been Removed.");
		
		link.pop();
		
		System.out.println(link + "\n" + link.peek() + " Has Been Removed.");
		
		link.pop();
		
		System.out.println(link + "\n" + link.peek() + " Has Been Removed.");
		
		link.pop();
		
		System.out.println(link + "\n" + link.peek() + " Has Been Removed.");
		
		link.pop();

		System.out.println("\n    ALL GONE " + link);

		
		link.push(1);
		link.push(7);
		link.push(3);
		link.push(4);
		link.push(9);
		link.push(2);
		
		// Removal of bottom 0.5
		System.out.println();
		
		System.out.print("Original LinkedStack: ");
		
		System.out.println(link);

		System.out.print("Top half: ");
		
		link.removeBottomHalf();
				
		array.push(1);
		array.push(7);
		array.push(3);
		array.push(4);
		array.push(9);
		array.push(2);

		// Show as removed
		System.out.println("\n" + array.size() + " int types in the stack.");
		
		array.pop();
		
		System.out.println("\n" + array.size() + " int types in the stack.");
		
		array.pop();
		
		System.out.println("\n" + array.size() + " int types in the stack.");
		
		array.pop();
		
		System.out.println("\n" + array.size() + " int types in the stack.");
		
		array.pop();
		
		System.out.println("\n" + array.size() + " int types in the stack.");
		
		array.pop();
		
		System.out.println("\n" + array.size() + " int types in the stack.");
		
		array.pop();
		
		System.out.println("\n" + array.size() + " int types in the stack.");

	}

}