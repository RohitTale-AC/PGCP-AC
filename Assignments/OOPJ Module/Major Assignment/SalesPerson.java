

public final class SalesPerson extends Employee {

	protected String communication;

	
	SalesPerson(String name, String address, int age, String gender, float basicSalary,String communication){
		super(name,address,age,gender,basicSalary,"SalesPerson");
		setCommunication(communication);

	}

	public String getCommunication() {
		return communication;
	}

	public void setCommunication(String communication) {
		this.communication = communication;
	}
	
	
	
	
@Override
	public void display() {

	super.display();
	System.out.println("Communication : "+ getCommunication());
		
	}

}
