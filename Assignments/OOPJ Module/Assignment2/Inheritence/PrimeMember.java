import secondJava.consoleInput;

public class PrimeMember extends Member {

	protected int joiningYear;
	protected int joiningFees;
	protected boolean isActive;

	public int getJoiningYear() {
		return joiningYear;
	}

	public void setJoiningYear(int joiningYear) {
		this.joiningYear = joiningYear;
	}

	public int getJoiningFees() {
		return joiningFees;
	}

	public void setJoiningFees(int joiningFees) {
		this.joiningFees = joiningFees;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	public void acceptData() {
		System.out.println("Enter the name : ");
		name = consoleInput.getString();
		setName(name);
		
		System.out.println("Enter the age : ");
		age = consoleInput.getInt();
		setAge(age);
		
		System.out.println("Enter the phone number : ");
		phone_number = consoleInput.getString();
		setPhone_number(phone_number);
		
		System.out.println("Enter the address : ");
		address = consoleInput.getString();
		setAddress(address);
		
		System.out.println("Enter the salary : ");
		salary = consoleInput.getInt();
		setSalary(salary);
		
		System.out.println("Enter the joiningYear : ");
		joiningYear = consoleInput.getInt();
		setJoiningYear(joiningYear);
		
		System.out.println("Enter the joiningFees : ");
		joiningFees = consoleInput.getInt();
		setJoiningFees(joiningFees);
		
	
		
	}
	
public void display() {
		
		System.out.println("Name : "+ getName());
		System.out.println("Age : "+ getAge());
		System.out.println("Phone Number : "+ getPhone_number());
		System.out.println("Address : "+ getAddress());
		System.out.println("Salary : "+ getSalary());
		System.out.println("Joining Year : "+ getJoiningYear());
		System.out.println("Joining Fees : "+ getJoiningFees());
	}

}
