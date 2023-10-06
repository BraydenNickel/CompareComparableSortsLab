package compare;

import java.util.List;

public class Sorts {
	public static void swap(List<Integer> sortList, int i, int j) {
			Integer temp = sortList.get(i);
			sortList.set(i,  sortList.get(j));
			sortList.set(j, temp);
	}
	
	public static void quickSort (List<Integer> sortList, int low, int high) {
		int pivot;
		// Termination Condition //
		if (low < high) {
			pivot = partition (sortList, low, high);
			quickSort (sortList, low, pivot - 1);
			quickSort (sortList, pivot + 1, high);
		}
	}
	// partition re factored 
	public static int partition(List<Integer> sortList, int low, int high) {
	    int pivotNumber = sortList.get(low);
	    int left = low + 1;
	    int right = high;

	    while (true) // Moves left while number is <= pivot // 
	    	{
	        while (left <= right && sortList.get(left) <= pivotNumber)
	            left++;
	        // Moves right while number is > pivot //
	        while (left <= right && sortList.get(right) > pivotNumber)
	            right--;
	        // if left and right intersect break loop //
	        if (left > right)
	            break;
	        // swap number at left and right pointers //
	        swap(sortList, left, right);
	        left++;
	        right--;
	    }
	    // swap pivot at low number with right number and return right //
	    swap(sortList, low, right);
	    return right;
	}
	
	// Non re factored partition method both work :) //
	
	/*	public static int partition(List<Integer> sortList, int low, int high) {
		int left, right, pivotNumber = sortList.get(low);
		left = low;
		right = high;
		// continue until left and right intersect //
		while (left < right) {
			// move left while number < pivot //
			while (sortList.get(left) <= pivotNumber)
				left++;
			// Move right while number > pivot //
			while (sortList.get(right) > pivotNumber)
				right--;
			// if left is still left of right swap numbers at each
			if (left < right)
				swap(sortList, left, right);
		}
		// swap the pivot with right
		sortList.set(low, sortList.get(right));
        sortList.set(right, pivotNumber);
		return right;
	}

 */
	// Bubble sort method //
	public static void bubbleSort(List<Integer> sortList) {
		// Get size of input list //
	    int size = sortList.size();
	    int pass, i, temp;
	    boolean swapped = true; // sets swapped check to true
	    // Loop for passes in decreasing order //
	    for (pass = size - 1; pass >= 0 && swapped; pass--) {
	        swapped = false; // sets swapped to false at each pass
	        // compare and swap adjacent numbers
	        for (i = 0; i < pass; i++) {
	            //compare current num with next num //
	        	if (sortList.get(i) > sortList.get(i + 1)) {
	                // swap num if num is out of order //
	        		temp = sortList.get(i);
	                sortList.set(i, sortList.get(i + 1));
	                sortList.set(i + 1, temp);
	                swapped = true;
	            }
	        }
	    }
	}
	
	// Selection Sort //
	
	public static void selectionSort(List<Integer> sortList) {
	    // get size of list //
		int size = sortList.size();
	    int i, j, min, temp;
	    for (i = 0; i < size - 1; i++) {
	        min = i; // assume index has a min value //
	        for (j = i + 1; j < size; j++) {
	            if (sortList.get(j) < sortList.get(min)) // compare using get method
	                min = j; // update index for min value
	        }
	        temp = sortList.get(min); // get value at index min
	        sortList.set(min, sortList.get(i)); // set value at index min to value at index i
	        sortList.set(i, temp); // set value at index i to temp
	    }
	}
	
	// Insertion Sort //
	public static void insertionSort(List<Integer> sortList) {
		// Get size of list //
		int size = sortList.size();
		int i, j, temp;
		for ( i = 1; i < size; i++) {
			temp = sortList.get(i); // store current number in temp //
			j = i; // initialize j to current index //
			// move numbers greater than temp to the right
			while(j > 0 && sortList.get(j - 1) > temp) {
				sortList.set(j, sortList.get(j - 1)); // shift elements to the right //
				j--; // move j to previous index
			}
			sortList.set(j, temp); // place temp in correct position //
		}
	}
}
