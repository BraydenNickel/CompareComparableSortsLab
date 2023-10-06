package compare;
import java.util.*;

// Student class that implements comparable 
class Student implements Comparable<Student> {

	private String name;
	private int age;
	
	// Constructor
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// Get methods
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	// Method to compare two students names
	@Override
	public int compareTo(Student newStudent) {
		return this.name.compareTo(newStudent.name);
	}
	
	// Method to compare the age of two students
	// if two student have the same age compare by name
	public static Comparator<Student> AgeComparator = 
			Comparator.comparing(Student::getAge)
			.thenComparing(Student::getName);
		
}

