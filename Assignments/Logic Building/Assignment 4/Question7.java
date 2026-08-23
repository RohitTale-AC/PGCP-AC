import java.util.Scanner;

class Question8{

static void printSumArr(){
Scanner sc = new Scanner(System.in);

System.out.println("Enter the 5 integer :");

int num;
int sum=0;
int arr[] = new int[5];

for(int i=0; i<arr.length;i++){
	 arr[i] =sc.nextInt();
}

for(int print : arr){
 sum = sum + print;

}
System.out.println("The sum of all number is "+ sum);

}

public static void main(String args[]){

printSumArr();

}
}
