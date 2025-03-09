import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Arrays;


public class Test { // Define the main class

	public static void main(String[] args) {

		// Assign an Integer array to grades
		Integer[] grades = { 1, 2, 3, null, 8, null, 5, 105 };

		// Create a new LinkedList<Integer> and add values
		LinkedList<Integer> gradesLinked = new LinkedList<Integer>();
		// add intiger by using add method in List class
		gradesLinked.add(8);
		gradesLinked.add(9);
		// Add null value
		gradesLinked.add(null);
		gradesLinked.add(20);
		// Add null value
		gradesLinked.add(null);
		gradesLinked.add(45);
		gradesLinked.add(118);
		gradesLinked.add(-50);

		// Create an ArrayList<Integer> and add values
		ArrayList<Integer> gradesList = new ArrayList<Integer>();
		// add intiger by using add method in List class
		gradesList.add(8);
		gradesList.add(9);
		// Add null value
		gradesList.add(20);
		// Add null value
		gradesList.add(null);
		gradesList.add(45);
		gradesList.add(118);
		gradesList.add(-50);

		// Call first method to calculate average from Integer array
		// Print original array	
		System.out.println("Before applying the find average method: " + Arrays.toString(grades)); 															
		double averageFirstMethod = averageGrades(grades); 
		// Print average result
		System.out.println("After applying the find average method: " + averageFirstMethod); 
		// Print new line
		System.out.println(); 

		// Call second method to calculate average from List
		 // Print original list
		System.out.println("Before applying the find average method: " + gradesList);
		double averageSecondMethod = averageGrades(gradesList); 
		// Print average result
		System.out.println("After applying the find average method: " + averageSecondMethod); 
		 // Print new line
		System.out.println();
		// Call third method to filter grades within range (4,9) from an array
		// Print original array
		System.out.println("Before applying the find average method: " + Arrays.toString(grades)); 
		// Filter grades within range
		LinkedList<Integer> filteredGrades = averageGrades(grades, 4, 9); 
		 // Print filtered results
		System.out.println("After applying the find average method: " + filteredGrades);
		 // Print new line
		System.out.println();

		// Call fourth method to filter grades within range (4,9) from a LinkedList
		// Print original LinkedList
		System.out.println("Before applying the find average method: " + gradesLinked); 
		 // Filter grades within range
		Integer[] gradeArr = averageGrades(gradesLinked, 4, 9);
		// Print filtered results
		System.out.println("After applying the find average method: " + Arrays.deepToString(gradeArr)); 
		// Print new line																							
		System.out.println(); 

		// Call fifth method to remove incorrect grades from an array
		// Print original array
		System.out.println("Before applying the removal method: " + Arrays.toString(grades)); 
		 // Remove invalid grades
		removeIncorrectGrades(grades);
		// Print modified array
		System.out.println("After applying the removal method: " + Arrays.toString(grades)); 
		 // Print new line
		System.out.println();

		// Call sixth method to remove incorrect grades from a LinkedList
		// Print original LinkedList
		System.out.println("Before applying the removal method: " + gradesLinked); 
		 // Remove invalid grades
		removeIncorrectGrades(gradesLinked);
		 // Print modified LinkedList
		System.out.println("After applying the removal method: " + gradesLinked);
		
	
		System.out.println("\nStackArray\n");
		
		// Initialize a new StackArray with size 4
		StackArray strArray = new StackArray(4);
		strArray.push("snake");    // Push "snake" onto the stack
		strArray.push("leon");     // Push "leon" onto the stack
		strArray.push("bear");     // Push "bear" onto the stack

		System.out.println(strArray.pop()); // Pop the top element and print it
		strArray.display(); // Display remaining stack elements
		System.out.println(strArray.size()); // Print the current stack size

		System.out.println("\nNaiveQueue\n");

		// Initialize a new NaiveQueue with size 4
		NaiveQueue queueArrayNaiveQueue = new NaiveQueue(4);
		queueArrayNaiveQueue.enqueue("banana");     // Enqueue "banana"
		queueArrayNaiveQueue.enqueue("muz");        // Enqueue "muz"
		queueArrayNaiveQueue.enqueue("strawberry"); // Enqueue "strawberry"
		queueArrayNaiveQueue.enqueue("cilek");      // Enqueue "cilek"
		queueArrayNaiveQueue.displayList();         // Display queue elements

		System.out.println(queueArrayNaiveQueue.dequeue()); // Dequeue and print the first element ("banana")
		queueArrayNaiveQueue.displayList(); // Display remaining queue elements

		System.out.println("\n\nCircularQueue\n");

		// Initialize a new CircularQueue with size 4
		CircularQueue circularQueue = new CircularQueue(4);
		circularQueue.enqueue("peanut");    // Enqueue "peanut"
		circularQueue.enqueue("welnut");    // Enqueue "welnut"
		circularQueue.enqueue("pistachio"); // Enqueue "pistachio"
		circularQueue.enqueue("fig");       // Enqueue "fig"
		circularQueue.displayQueue();       // Display circular queue elements
		
	}

	// Method to calculate the average of an Integer array (including null check)
	public static double averageGrades(Integer[] grades) {
		double sum = 0;
		int count = 0;
		 // Iterate over array
		for (Integer grade : grades) {
			 // Check if grade is not null
			if (grade != null) {
				// Add grade to sum
				sum += grade; 
				 // Increment count
				count++;
			}
		}
		// Avoid division by zero and return average
		// if / else condition
		return count == 0 ? 0 : sum / count; 
	}

	// Method to calculate the average of a List of Integer values
	public static double averageGrades(List<Integer> grades) {
		double sum = 0; 
		int count = 0; 
		// Iterate over list
		for (Integer grade : grades) { 
			 // Check if grade is not null
			if (grade != null) {
				// Add grade to sum
				sum += grade; 
				 // Increment count
				count++;
			}
		}
		// Avoid division by zero and return average
		return count == 0 ? 0 : sum / count; 
	}

	// Method to filter grades within a specific range (min, max) and return a LinkedList
	public static LinkedList<Integer> averageGrades(Integer[] grades, int min, int max) {
		// Initialize LinkedList
		LinkedList<Integer> nums = new LinkedList<>(); 
		// Iterate over array
		for (Integer grade : grades) { 
			// Check if grade is within range
			if (grade != null && grade > min && grade < max) { 
				 // Add grade to list
				nums.add(grade);
			}
		}
		// Return filtered list
		return nums; 
	}

	// Method to filter grades within a range (min, max) from a List and return an Integer array
	public static Integer[] averageGrades(List<Integer> grades, int min, int max) {
		// Initialize list
		List<Integer> nums = new ArrayList<>(); 
		// Iterate over list
		for (Integer grade : grades) { 
			 // Check if grade is within range
			if (grade != null && grade > min && grade < max) {
				// Add grade to list
				nums.add(grade); 
			}
		}
		 // Convert list to array and return
		return nums.toArray(new Integer[0]);
	}

	// Method to remove incorrect grades from an Integer array (Replace with 0)
	public static void removeIncorrectGrades(Integer[] grades) {
		int index = 0;
		 // Iterate over array
		for (Integer grade : grades) {
			// Check if grade is valid
			if (grade != null && grade >= 0 && grade <= 100) { 
				 // Assign valid grade to new position
				grades[index++] = grade;
			}
		}
		// Fill remaining positions with null
		while (index < grades.length) { 
			grades[index++] = null;
		}
	}

	// Method to remove incorrect grades from a LinkedList
	public static void removeIncorrectGrades(LinkedList<Integer> grades) {
		 // Iterate from end to start to avoid index shifting
		for (int i = grades.size() - 1; i >= 0; i--) {
			// assign the every index of grades to grade variable
			Integer grade = grades.get(i); 
			 // Check if grade is invalid
			if (grade == null || grade < 0 || grade > 100) {
				// Remove invalid grade
				grades.remove(i); 
			}
		}
	}
}
