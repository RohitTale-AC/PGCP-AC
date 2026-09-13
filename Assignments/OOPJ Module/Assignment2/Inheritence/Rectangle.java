
public class Rectangle extends Shape{

 int length;
 int breadth;
	
	Rectangle(int length,int breadth){
		this.length = length;
		this.breadth = breadth;
	}
	

	 int perimeter() {
		return 2*(length+breadth);
	
	}
	
	 int area() {
		 return length * breadth;
	}
	
	
	 void displayRec() {
		 System.out.println("This is rectangular shape");
	 }
	 
}
