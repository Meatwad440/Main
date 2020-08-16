import java.util.Arrays;

//************************************************************
//  Lab 6 Exercise 5				Nick Hutson
//************************************************************

public class L6_Exer5 {

	public static void main(String[] args) {
		int [] list1 = {1, 29, 14, 15, 94};
		int [] list2 = {1, 29, 14, 15, 94};
		
		System.out.println("Array selection sort: ");
		selectionSort(list1);
		
		System.out.println("Array insertion sort: ");
		insertionSort(list2);	
	}
	public static void selectionSort(int[] list) {
		int minNum, minIndex, temp = 0; 
		for(int i = 0; i < 5; i++) {
			minNum = list[i];
			minIndex = i; 
			for(int j = i; j < 5; j++) {
				if(list[j] < minNum) {
					minNum = list[j];
					minIndex = j;
				}			
			}			
			if(minNum < list[i]) {
				temp = list[i];
				list[i] = list[minIndex];
				list[minIndex] = temp;				
			}	
		System.out.println(Arrays.toString(list));	
		}
	}
	public static void insertionSort(int[] list) {
		for(int i = 1; i < 5; i++) {
			int temp;
			for (int j = i; j > 0; j--) {
				if(list[j-1] > list[j]) {
					temp = list[j];
					list[i] = list[j - 1];
					list[j - 1] = temp; 
				}
			}
		System.out.println(Arrays.toString(list));	
		}

	}

}
