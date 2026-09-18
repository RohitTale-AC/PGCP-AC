
public sealed class Employee permits Manager,Engineer,SalesPerson {

	protected String name;
	protected String address;
	protected int age;
	protected String gender;
	protected float basicSalary;
	protected String designation;

	Employee(String name, String address, int age, String gender, float basicSalary,String designation) {
		setName(name);
		setAddress(address);
		setAge(age);
		setGender(gender);
		setBasicSalary(basicSalary);
		this.designation = designation;

	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name.isEmpty())
			this.name = "Demo name";
		else
			this.name = name;

	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		if (address.isEmpty())
			this.address = "Cdac, Mumbai. ";
		else
			this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age < 18 || age > 60)
			this.age = 21;
		else
			this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		if (gender.isEmpty()) {
			this.gender = "Male";
		} else {
			this.gender = gender;
		}
	}

	public float getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(float basicSalary) {
		if (basicSalary == 0)
			this.basicSalary = 10000;
		else if (basicSalary < 10000 || basicSalary > 100000)
			this.basicSalary = 10000;
		else
			this.basicSalary = basicSalary;
	}

	public void display() {
		System.out.println("Designation : " + getDesignation());
		System.out.println("Name : " + getName());
		System.out.println("Address : " + getAddress());
		System.out.println("Age : " + getAge());
		System.out.println("Gender : " + getGender());
		System.out.println("Basic Salary : " + getBasicSalary());

	}

}
