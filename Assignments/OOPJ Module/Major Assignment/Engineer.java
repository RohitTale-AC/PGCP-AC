

public final class Engineer extends Employee {

	protected int overtime;

	
	Engineer(String name, String address, int age, String gender, float basicSalary,int overtime){
		
		super(name,address,age,gender,basicSalary,"Engineer");
		setOvertime(overtime);

	}

	public int getOvertime() {
		return overtime;
	}

	public void setOvertime(int overtime) {
		this.overtime = overtime;
	}
	
	
	
@Override
	public void display() {

	super.display();
	System.out.println("Overtime : "+ getOvertime());
	}
	
}
