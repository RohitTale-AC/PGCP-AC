
public final class Manager extends Employee {

	protected int hra;


	Manager(String name, String address, int age, String gender, float basicSalary, int hra) {
		super(name, address, age, gender, basicSalary,"Manager");
		setHra(hra);

	}

	public int getHra() {
		return hra;
	}

	public void setHra(int hra) {
		if (hra > 5000)
			this.hra = hra;
		else
			this.hra = 5000;
	}




	@Override
	public void display() {


		super.display();

		System.out.println("HRA : " + getHra());
		System.out.println("Total Salary : " + (getHra() + basicSalary));
	}

}
