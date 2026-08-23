import java.util.Scanner;

class Question1{

static void printNumber(){
Scanner sc = new Scanner(System.in);

System.out.println("Enter the number :");
int num = sc.nextInt();

for(int i=1; i<=num; i++){
System.out.println(i);
}

}

public static void main(String args[]){

printNumber();

}
}
