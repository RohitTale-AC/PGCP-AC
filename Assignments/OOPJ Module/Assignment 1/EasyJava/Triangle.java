
public class Triangle {
	private int side1;
	private int base;
	private int side3;

	Triangle(int s1, int s2, int s3) {
		side1 = s1;
		base = s2;
		side3 = s3;
	}

	double perimeter() {
		double peri = side1 + base + side3;
		return peri;
	}

	double area() {
		
		double height = 2 * side1 / base;
		double arr = 1.0 / 2 * base * height;
		return arr;
	}

}
