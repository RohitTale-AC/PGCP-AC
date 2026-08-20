import java.util.Scanner;

class MultiplicationTable{

static void printMultiplicationTable(int num){

for(int i=1; i<=10; i++){
int result = num*i;
System.out.println(num +" * "+ i + " = " + result);
}
}

public static void main (String args[]){

Scanner sc = new Scanner(System.in);

System.out.println("Enter a number : ");
int num = sc.nextInt();

MultiplicationTable.printMultiplicationTable(num);

}

}
