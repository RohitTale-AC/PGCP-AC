
public class Rectangle {

	private int length;
	private int breadth;

	Rectangle(int len, int bre) {
		length = len;
		breadth = bre;
	}

	int area() {
		int arr = length * breadth;
		return arr;
	}

}
