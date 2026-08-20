import java.util.Scanner;

class SumOfTwoNumber{


static void sumofTwoNumbers(){
//Scanner sc = new Scanner(System.in);
//int num = sc.nextInt();

int num1 = 15;
int num2 = 25;
int result = num1 + num2;
System.out.println(result);
}

public static void main(String args[]){

SumOfTwoNumber obj = new SumOfTwoNumber();

SumOfTwoNumber.sumofTwoNumbers(); // Methodcalling using the class name.
//obj.sumofTwoNumbers(); // Method calling using the object.

}
}