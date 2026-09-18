import secondJava.consoleInput;

public class Program {

	static Employee arrEmployee[] = new Employee[10];

	final int ADD_MANAGER = 1;
	final int ADD_ENGINEER = 2;
	final int ADD_SALESPERSON = 3;

	static int count = 0;

	public static void main(String[] args) {

		int choice;
		do {
			System.out.println(" ");
			System.out.println("====== Menu Driven Program =====");

			System.out.println("1. Add ");
			System.out.println("2. Display ");
			System.out.println("3. Delete ");
			System.out.println("4. Sort ");
			System.out.println("5. Exit ");

			System.out.print("Enter the choice : ");
			choice = consoleInput.getInt();

			switch (choice) {
			case 1:
				addEmployee();
				break;
			case 2:
				displayEmployee();
				break;
			case 3:
				deleteEmployee();
				break;
			case 4:
				sortEmployee();
				break;
			case 5:
				System.out.println("Exit...");
				break;
			default:
				System.out.println("Invalid Choice. ");
				break;
			}

		} while (choice != 5);

	}

	static void addEmployee() {

		int choice;
		do {
			System.out.println("===== Add Employee =====");
			System.out.println("1. Manager ");
			System.out.println("2. Engineer ");
			System.out.println("3. Sales Person ");
			System.out.println("4. Exit ");

			System.out.print("Enter the choice : ");
			choice = consoleInput.getInt();

			switch (choice) {
			case 1:
				addManger();
				break;
			case 2:
				addEngineer();
				break;
			case 3:
				addSalesPerson();
				break;
			case 4:
				System.out.println("Exit...");
				break;
			default:
				System.out.println("Invalid Choice. ");
				break;
			}

		} while (choice != 4);

	}

	// Input Data

	static String addName() {
		System.out.print("Enter the name : ");
		return consoleInput.getString();
	}

	static String addAddress() {
		System.out.print("Enter the address : ");
		return consoleInput.getString();
	}

	static int addAge() {
		System.out.print("Enter the age : ");
		return consoleInput.getInt();
	}

	static String addGender() {
		System.out.println("Enter the gender : ");
		return consoleInput.getString();
	}

	static float addBasicSalary() {
		System.out.println("Enter the basic salary : ");
		return consoleInput.getFloat();
	}

	static void addManger() {

		String name = addName();
		String address = addAddress();
		int age = addAge();
		String gender = addGender();
		float basicSalary = addBasicSalary();

		System.out.println("Enter the hra : ");
		int hra = consoleInput.getInt();

		arrEmployee[count] = new Manager(name, address, age, gender, basicSalary, hra);
		count++;
		System.out.println("Manager Registered...");
		System.out.println(" ");
	}

	static void addEngineer() {

		if (count == 40) {
			System.out.println("Employee is Full...");
		}

		String name = addName();
		String address = addAddress();
		int age = addAge();
		String gender = addGender();
		float basicSalary = addBasicSalary();

		System.out.println("Enter the overtime : ");
		int overtime = consoleInput.getInt();

		arrEmployee[count] = new Engineer(name, address, age, gender, basicSalary, overtime);
		count++;
		System.out.println("Engineer Registered...");
		System.out.println(" ");
	}

	static void addSalesPerson() {

		String name = addName();
		String address = addAddress();
		int age = addAge();
		String gender = addGender();
		float basicSalary = addBasicSalary();

		System.out.println("Enter the communication : ");
		String communication = consoleInput.getString();

		arrEmployee[count] = new SalesPerson(name, address, age, gender, basicSalary, communication);
		count++;
		System.out.println("SalesPerson Registered...");
		System.out.println(" ");
	}

	static void displayEmployee() {

		if (count == 0) {
			System.out.println("No employees available...");
			return;
		}

		for (int iarr = 0; iarr < count; iarr++) {
			System.out.println("Employee no " + (iarr + 1));

			arrEmployee[iarr].display();
			System.out.println(" ");
		}

	}

	static void deleteEmployee() {

		if (count == 0) {
			System.out.println("No employee avilable to delete");
			return;
		}

		displayEmployee();

		System.out.println("Enter the Employee you want to delete : ");

		int index = consoleInput.getInt();

		if (index < 1 || index > count) {
			System.out.println("Invalid index number...");
			return;
		}

		for (int iIndex = index - 1; iIndex < count - 1; iIndex++) {
			arrEmployee[iIndex] = arrEmployee[iIndex - 1];
		}

		arrEmployee[count - 1] = null;
		count--;

		System.out.println("Deleted Successfully");
		System.out.println(" ");

	}

	static void sortEmployee() {

		String index;

		do {
			System.out.println("===== Sort the employee =====");
			System.out.println("a. By Name Assending Order ");
			System.out.println("b. By Name Dessending Order ");
			System.out.println("c. By Designation Order (Not yet done) ");
			System.out.println("d. Exit ");

			System.out.print("Enter the choice : ");
			index = consoleInput.getString();

			switch (index.charAt(0)) {
			case 'a':
				sortByNameA();
				break;
			case 'b':
				sortByNameD();
				break;
			case 'c':
				sortByDesignation();
				break;
			case 'd':
				System.out.println("Exit...");
				break;
			default:
				System.out.println("Invalid Index... ");
				break;
			}

		} while (index.charAt(0) != 'd');

	}

	static void sortByNameA() {

		for (int isort = 0; isort < count - 1; isort++) {
			for (int jsort = 0; jsort < count - 1 - isort; jsort++) {
				if (arrEmployee[jsort].getName().compareToIgnoreCase(arrEmployee[jsort + 1].getName()) > 0) {
					Employee temp = arrEmployee[jsort];

					arrEmployee[jsort] = arrEmployee[jsort + 1];
					arrEmployee[jsort + 1] = temp;

				}
			}
		}
		displayEmployee();
	}

	static void sortByNameD() {
		for (int isort = 0; isort < count - 1; isort++) {
			for (int jsort = 0; jsort < count - 1 - isort; jsort++) {
				if (arrEmployee[jsort].getName().compareToIgnoreCase(arrEmployee[jsort + 1].getName()) < 0) {
					Employee temp = arrEmployee[jsort];

					arrEmployee[jsort] = arrEmployee[jsort + 1];
					arrEmployee[jsort + 1] = temp;
				}
			}
		}
		displayEmployee();
	}

	static void sortByDesignation() {
		String val;

		do {
			System.out.println(" ");
			System.out.println("===== Sort By Designation =====");
			System.out.println("a. Manager ");
			System.out.println("b. Engineer ");
			System.out.println("c. Sales Person ");
			System.out.println("d. Exit ");

			System.out.print("Enter the choice : ");
			val = consoleInput.getString();

			switch (val.charAt(0)) {
			case 'a':
				sortManager("Manager");
				break;
			case 'b':
				sortEngineer("Engineer");
				break;
			case 'c':
				sortSalesPerson("SalesPerson");
				break;
			case 'd':
				System.out.println("Exit...");
				break;
			default:
				System.out.println("Invalid Index... ");
				break;
			}

		} while (val.charAt(0) != 'd');

	}

	static void sortManager(String designation) {
		for (int i = 0; i < count; i++) {
			if (arrEmployee[i].getDesignation().equals(arrEmployee[i].designation)) {
				arrEmployee[i].display();
			}
		}
	}

	static void sortEngineer(String designation) {
		for (int i = 0; i < count; i++) {
			if (arrEmployee[i].getDesignation().equals(arrEmployee[i].designation)) {
				arrEmployee[i].display();
			}
		}
	}

	static void sortSalesPerson(String designation) {
		for (int i = 0; i < count; i++) {
			if (arrEmployee[i].getDesignation().equals(arrEmployee[i].designation)) {
				arrEmployee[i].display();
			}
		}
	}

}
