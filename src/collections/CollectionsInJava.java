package collections;

public class CollectionsInJava {

	public static void main(String[] args) {
		
		//An array is a data structure that is going to allow us to store multiple values with similar data types together in the same memory location.

		String [] empNames = new String[3]; // This can hold 3 employee names.
		empNames[0] = "Bharath";
		empNames[1] = "ABC";
		empNames[2] = "Bharath";
		
		/****Challenges with Array****/
		//1. Arrays are fixed in size.
		//2. Memory will be allocated at the beginning of creating the array. That means it is a static memory allocation.
		//3. Array allows similar data types only.
		//4. Arrays won't allow modifications.
		
		/****** Collections Framework ******/
		
		// Advantages
		
		//1. Collections are dynamic in size, meaning no need to declare the size at the beginning.
		//2. Memory will be allocated dynamically based on the data that we are going to store.
		//3. Collections allow different data types within the same data structure.
		//4. Collections allow modifications.
		
		//Major categories of collections that we are going to use in our day-to-day automation roles. ==> List, Set, Map
		
		//List ==> ArrayList, LinkedList
		//1. List can store multiple values with similar data types together at one place by allocating the memory dynamically.
		//2. List follows dynamic memory allocation.
		//3. List allows Duplicate values.
		//4. List allows modifications.		
		
		//Set ==> HashSet, LinkedHashSet, TreeSet
		//1. Set can store multiple values with similar data types together at one place by allocating the memory dynamically.
		//2. Set follows dynamic memory allocation.
		//3. Set won't allow duplicate values.
		//4. Set allows modifications.
		
		//Map ==> HashMap, LinkedHashMap, TreeMap, Hashtable
		
		//1. Map can store multiple values with different data types together (like Key, Value) at one place by allocating memory dynamically.
		//2. Map follows dynamic memory allocation.
		//3. Map won't allow duplicate Keys, But allows duplicate values.
		//4. Set allows modifications.

		// Difference between each sub-category of List, Set, and Map.
		
		// Order of storing values : Insertion order, Sorted/Ascending Order , Random order
		// Allowing the Null values : Allowed / Not-Allowed
		// Memory Allocation Technique : Contiguous Memory Allocation/Non-Contiguous Memory Allocation
	}

}
