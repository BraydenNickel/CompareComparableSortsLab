package compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<>(); // Array Declared
		studentList.add(new Student("Brayden", 22));
		studentList.add(new Student("Dodger", 9));
		studentList.add(new Student("Nickel", 22));
		
		// Sort name using Comparable
		Collections.sort(studentList);
		System.out.println("Sorted by name:");
		for (Student student : studentList) {
			System.out.println("Name:" + student.getName() + ", Age:" + student.getAge());
		}
		
		// Sort age using Comparable 
		Collections.sort(studentList, Student.AgeComparator);
		System.out.println("\nSorted by age:");
		for (Student student : studentList) {
			System.out.println("Age:" + student.getAge() + ", Name:" + student.getName());
		}
		
		// Sort numbered list with a Binary Search
		List<Integer> numberedList = new ArrayList<>();
		numberedList.add(1);
		numberedList.add(2);
		numberedList.add(4);
		numberedList.add(8);
		numberedList.add(16);
		numberedList.add(32);
		numberedList.add(64);
		
		int searchTarget = 32;
		int search = BinarySearch.binarySearch(numberedList, searchTarget);
			if (search != -1) {
				System.out.println("\nReturned " + searchTarget + " at index value " + search);
			}
			else {
				System.out.println("\nNo record of" + searchTarget + " in the the list.");
			};
		
		/*
		// Sort through two lists using a quick sort
		List<Integer> sortList = new ArrayList<>();
		sortList.add(12);
		sortList.add(82);
		sortList.add(36);
		sortList.add(14);
		sortList.add(5);
		sortList.add(54);
		sortList.add(54);
		sortList.add(2);
		
		
		Sorts.quickSort(sortList, 0, sortList.size() - 1);
		System.out.println("Sorted List:");
		for (Integer num : sortList) {
			System.out.print(num + " ");
		}
		*/
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("\nChoose a sorting algorithm: \n" +
				"1. Quick Sort\n" +
				"2. Bubble Sort\n" +
				"3. Selection Sort\n" +
				"4. Insertion Sort\n" +
				"Enter the number for desired sort: ");
		// read user input //
		int userChoice = scanner.nextInt();
		
		System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();
        List<Integer> sortList = new ArrayList<>();
        
        System.out.println("Enter the elements of the list:");
        for (int i = 0; i < size; i++) {
            sortList.add(scanner.nextInt());
        }
        
        System.out.println("Before sorting: " + sortList);

		
		//System.out.println("List before sorting: " + sortList);
		
		switch(userChoice) {
		case 1:
			Sorts.quickSort(sortList, 0, sortList.size()-1);
			break;
		case 2: 
			Sorts.bubbleSort(sortList);
			break;
		case 3:
			Sorts.selectionSort(sortList);
			break;
		case 4:
			Sorts.insertionSort(sortList);
			break;
		
		}
		System.out.println("After sorting: " + sortList);
		

	        
	    scanner.close();
	}
}