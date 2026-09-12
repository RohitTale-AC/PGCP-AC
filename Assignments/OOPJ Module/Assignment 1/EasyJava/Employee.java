
public class Employee {

	private String name;
	private int yoj;
	private int salary;
	private String address;
	private int how;
	
	public void setEmployee(String n,int y, String add) {
		name=n;
		yoj = y;

		address=add;
	}
	
	void getInfo(int salary,int how) {
		
		this.salary=salary;
		this.how=how;
	}
	
	void add() {
		if(salary<500) 
			salary=salary+10;
	}
	
	void addWork() {
		if(how>6)
			salary= salary+5;
	}
	
	void display() {
	
		System.out.println(name+"        "+yoj+"        "+address+"     ");

	}
	
	void displaySalary() {
		System.out.println("The final salry is : "+ salary);

	}
	
	
}
