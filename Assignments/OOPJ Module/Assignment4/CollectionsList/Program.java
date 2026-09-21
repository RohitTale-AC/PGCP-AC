import java.util.*;

public class Program {

	public static void main(String[] args) {

//		addColor();
//		treeSet();
		greaterElement();

	}

	static void addColor() {
		List<String> list = new ArrayList<>();

		list.add("Red");
		list.add("Green");
		list.add("Blue");
		list.add("Yellow");
		list.add("Pink");
		list.add("Violet");
		list.add("Orange");
		list.add("Black");

		System.out.println("Original element : " + list); // Original List element

		System.out.println("--------------------");

		Collections.reverse(list);
		System.out.println("Reversed element : " + list); // Reversed the element of the list Question 10

		System.out.println("--------------------");

		Collections.sort(list); // Sort a given array list. Question 7
		System.out.println("Sorted element : " + list);

		System.out.println("--------------------");

		List<String> list2 = new ArrayList<>(list); // Copy 1 array to another array Question 8
		System.out.println("Sorted element : " + list2);

		System.out.println("--------------------");

		Collections.shuffle(list);
		System.out.println("Shuffled element : " + list); // Shuffled the element of the list Question 9

		System.out.println("--------------------");

	}

	static void treeSet() {

		TreeSet<String> set = new TreeSet<>();

		set.add("Red");
		set.add("Green");
		set.add("Blue");
		set.add("Yellow");
		set.add("Pink");
		set.add("Violet");
		set.add("Orange");
		set.add("Black");

		System.out.println("TeeSet element : " + set); // Print out the tree set Question 11

		System.out.println("--------------------");

		TreeSet<String> set2 = new TreeSet<>(); // All the elements of a specified tree set to another tree set.
												// Question 12
		set2.add("Brown");
		set2.add("White");

		set2.addAll(set);

		System.out.println("TeeSet All-Element : " + set2);

		System.out.println("--------------------");

		NavigableSet<String> reversed = set.descendingSet(); // Reverse order view of the elements contained in a given
																// tree set Question 13
		System.out.println("Reversed element : " + reversed);

		System.out.println("--------------------");

		System.out.println("First element : " + set.first()); //
		System.out.println("Last element : " + set.last()); // First and last elements in a tree set. Question 14

		System.out.println("--------------------");

	}

	static void greaterElement() {

		TreeSet<Integer> set = new TreeSet<>();

		set.add(10);
		set.add(20);
		set.add(40);
		set.add(53);
		set.add(134);
		set.add(135);
		set.add(33);

		System.out.println(set.ceiling(54));
		System.out.println("--------------------");
		System.out.println(set.descendingSet());

	}

}
