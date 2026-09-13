
public class Square extends Rectangle {

	protected int side;
	
	Square(int side){
		super(side,side);
	}
	
	void displaySquare() {
		System.out.println("Square is a rectangle...");
	}
	
}
