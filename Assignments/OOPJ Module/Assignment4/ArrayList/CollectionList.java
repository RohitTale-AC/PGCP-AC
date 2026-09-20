
import java.util.*;


public class CollectionList {

	public static void main(String[] args) {

		addColor(); // Question 1

	}

	// Question 1
	static void addColor() {

		ArrayList<String> list = new ArrayList<>();

		list.add("Red");
		list.add("Green");
		list.add("Blue");
		list.add("Yellow");
		list.add("Pink");
		list.add("Violet");
		list.add("Orange");
		list.add("Black");

		Iterator<String> iterator = list.iterator(); // Printing the all element by iterator. Question 1

		while (iterator.hasNext()) {
//			String data = iterator.next();
			System.out.println(iterator.next());
		}

		System.out.println("---------------------------");

		list.add(0, "Grey"); // inserting element at first position. Question 2

		System.out.println(list.get(5)); // Retrieving the element by the index number. Question 3

		System.out.println("---------------------------");

		System.out.println(list.set(3, "Hello")); // Update the specific element by the set method. print the previous
													// element and update with new element Question 4

		System.out.println("---------------------------");

		System.out.println(list.remove(3));
		
		System.out.println("---------------------------");
		
		Iterator <String> listS = list.iterator();
		
		String Data = "Hello";
		while(listS.hasNext()) {
			String data = listS.next();
			if(data == Data) {
				System.out.println(data);
			}else {
				System.out.println("Not found.");
			}
		}
	}

}