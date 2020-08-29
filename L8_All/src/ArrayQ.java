
public class ArrayQ {

	   private final int DEFAULT_CAPACITY = 100;
	   private int front, rear, count;
	   private int[] queue;

	   
	   public ArrayQ()
	   {
	      front = rear = count = 0;
	      queue = new int[DEFAULT_CAPACITY];
	   }

	   public void enqueue (int element) {
	      if (count == queue.length)
	          expandCapacity();

	       queue[rear] = element;
	       rear = (rear+1) % queue.length;
	       count++;	   
	   }

	   public void expandCapacity()
	   {
	      int[] larger = new int[queue.length*2];

	      for (int index=0; index < count; index++)
	         larger[index] = queue[(front+index) % queue.length];

	      front = 0;
	      rear = count;
	      queue = larger;
	   }
	  
	   public int dequeue() {
		   if (count==0) return -1;
		   int x = queue[front];
	       front = (front+1) % queue.length;
	       count--;
		   return x;
	   }

	   public int first() {
		   return queue[front];
	   }

	   public boolean isEmpty() {
		   return count==0;
	   }

	   public int size() {
		   return count;
	   }

	   public String toString() {
		   return "";
	   }

}
