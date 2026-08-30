#include <iostream>
#include <string>

using namespace std;

class Employee
{

private:
    int empId;
    string name;
    string department;
    char grade;
    double basicSalary;
    bool isActive;

    static int employeeCount;

public:
    // Construtor

    Employee()
    {
        employeeCount++;
        empId = 1000 + employeeCount;
        name = " ";
        department = " ";
        grade = '\0';
        basicSalary = 0;
        isActive = true;
    }

    // setter with validation

    void setName(const string &n)
    {

        if (n.empty())
        {
            cout << "Error : Enter valid name. " << endl;
        }
        else
        {
            name = n;
        }
    }

    void setDepartment(const string &dept)
    {
        if (dept == "Engineering" || dept == "HR" || dept == "Finance" || dept == "Operations")
        {
            department = dept;
        }
        else
        {
            cout << " ' " << dept << " ' " << "is not a registered department. " << endl;
        }
    }

    void setGrade(char g)
    {

        if (g == 'A' || g == 'B' || g == 'C' || g == 'D')
        {
            grade = g;
        }
        else
        {
            cout << "Invalid grade entered. Accepted values: A, B, C, D. " << endl;
        }
    }

    void setBasicSalary(double salary)
    {
        if (salary > 10000 && salary < 500000)
        {
            basicSalary = salary;
        }
        else
        {
            cout << "ERROR: Salary must be between Rs.10,000 and Rs.5,00,000. Value rejected." << endl;
        }
    }

    void deactivate()
    {
        isActive = false;
    }

    // Getter with validation

    int getEmpId() const
    {
        return empId;
    }

    string getName() const
    {
        return name;
    }
    string getDepartment() const
    {
        return department;
    }

    char getGrade() const
    {
        return grade;
    }

    double getBasicSalary() const
    {
        return basicSalary;
    }

    bool getIsActive() const
    {
        return isActive;
    }

    // Business logic — all marked

    double computeAllowances() const
    {
        if (grade == 'A')
        {
            return basicSalary * 0.40;
        }
        else if (grade == 'B')
        {
            return basicSalary * 0.30;
        }
        else if (grade == 'C')
        {
            return basicSalary * 0.20;
        }
        else if (grade == 'D')
        {
            return basicSalary * 0.10;
        }
        return 0;
    }

    double computeGrossSalary() const
    {

        return basicSalary + computeAllowances();
    }

    double computeTax() const
    {
        double gross = computeGrossSalary();

        if (gross <= 50000)
        {
            return 0;
        }
        else if (gross >= 50000 && gross <= 100000)
        {
            return (gross - 50000) * 0.10;
        }
        else
        {
            return 5000 + (gross - 100000) * 0.20;
        }
    }

    double computeNetSalary() const
    {

        return computeGrossSalary() - computeTax();
    }

    void printPayslip() const
    {

        cout << " ============================================ " << endl;
        cout << "          EMPLOYEE PAYSLIP - AUG 2026         " << endl;
        cout << " ============================================ " << endl;
        cout << " Emp ID        : " << empId << endl;
        cout << " Name          : " << name << endl;
        cout << " Department    : " << department << endl;
        cout << " Grade         : " << grade << endl;
        if (getIsActive())
        {
            cout << " Status        : " << "Active" << endl;
        }
        else
        {
            cout << " Status        : " << "inActive" << endl;
        }

        cout << " -------------------------------------------- " << endl;
        cout << " Basic Salary      : " << " Rs. " << basicSalary << endl;
        cout << " Allowances (30%)  : " << " Rs. " << computeAllowances() << endl;
        cout << " Gross Salary      : " << " Rs. " << computeGrossSalary() << endl;
        cout << " -------------------------------------------- " << endl;
        cout << " Tax Deduction     : " << " Rs. " << computeTax() << endl;
        cout << " Net Salary        : " << " Rs. " << computeNetSalary() << endl;
    }

    static int getEmployeeCount()
    {
        return employeeCount;
    }

    void acceptDetails()
    {
        string n;
        string dept;
        double salary;
        char g;

        cout << "Enter the name : " << endl;
        cin >> n;
        setName(n);

        cout << "Enter the department : " << endl;
        cin >> dept;
        setDepartment(dept);

        cout << "Enter the grade : " << endl;
        cin >> g;
        setGrade(g);

        cout << "Enter the salary : " << endl;
        cin >> salary;
        setBasicSalary(salary);
    }
    // Reads all fields from the user — must call the corresponding setter for each
    // so that validation runs before any value is stored
};

// Static member definition
int Employee::employeeCount = 0;

int main()
{

    Employee e1;
    Employee *e2 = new Employee();
    Employee *e3 = new Employee();

    e1.acceptDetails();
    e2->acceptDetails();
    e3->acceptDetails();

    // EmpID and basicSalary is a private member function it is not allowed to call from ouside the class.

    // e1.empId = 999;
    // e1.basicSalary = -1000;

    e1.printPayslip();
    e2->printPayslip();
    // e3->printPayslip();

    // Simulate a resignation
    e3->deactivate();
    if (!e3->getIsActive())
    {
        cout << e3->getName() << " is no longer active. Payroll skipped." << endl;
    }
    cout << "Total Employees : " << Employee::getEmployeeCount() << endl;
    delete e2;
    delete e3;
    return 0;
}