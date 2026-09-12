
public class Student {

	private String name;
	private int roll_no;
	private String phone_no;
	private String address;

// A
//	public void setStudent(int rn, String nn ) {
//		roll_no = rn;
//		name = nn;
//	}
//
//	void display() {
//		System.out.println("Student Name : " + name);
//		System.out.println("Roll number  : " + roll_no);
//	}
	

	
// B
	public void setStudent(int rn, String nn,String pn, String ad ) {
		roll_no = rn;
		name = nn;
		phone_no = pn;
		address = ad;
	}

	void display() {
		System.out.println("Student Name : " + name);
		System.out.println("Roll number  : " + roll_no);
		System.out.println("Phone no : " + phone_no);
		System.out.println("Address  : " + address);
	}

}
