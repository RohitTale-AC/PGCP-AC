import java.util.Scanner;

class SumOfNumber{

static void calculateSum(){

Scanner sc = new Scanner(System.in);

System.out.println("Enter the number : ");
int num = sc.nextInt();

int sum = 0;

for(int i=1; i<=num; i++){
	sum = sum + i;
}
System.out.println("The sum of numbers from 1 to "+ num +" is " + sum);

}

public static void main(String args[]){

SumOfNumber.calculateSum();

}
}