
public class Program {

	public static void main(String[] args) {

		Parent objParent = new Parent();

		Child objChild = new Child();

//		objParent.parentMethod(); // method of parent class by object of parent class
//
//		objChild.parentMethod(); // method of child class by object of child class
//		objChild.childMethod(); // method of parent class by object of child class

//		PrimeMember objP_Member = new PrimeMember(); 
//		objP_Member.acceptData(); 
//		objP_Member.display();

//		Rectangle objRec = new Rectangle(5, 5);

//		System.out.println("Area of rectangle is : " + objRec.area());
//		System.out.println("Perimeter of rectangle is : " + objRec.perimeter());

		Square objSquare = new Square(2);

//		System.out.println("Area of Square is : " + objSquare.area());
//		System.out.println("Perimeter of Square is : " + objSquare.perimeter());
		
		objSquare.displaySquare();
		objSquare.displayRec();
		objSquare.displayShape();
	}

}
