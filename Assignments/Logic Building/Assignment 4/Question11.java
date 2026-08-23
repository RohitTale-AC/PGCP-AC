import java.util.Scanner;

class Question11{

static void positiveNegative(){
Scanner sc = new Scanner(System.in);

System.out.println("Enter the 6 integer :");

int arr[]= new int[6];
int countPositive=0;
int countNegative=0;

for(int i=0; i<arr.length; i++){
	arr[i]=sc.nextInt();
}

for(int print : arr){
		if(print>0){
		countPositive ++;
		}else{
		countNegative ++;
		}
}
System.out.println("Positive numbers " + countPositive);
System.out.println("Negative numbers " + countNegative);
}

public static void main(String args[]){

positiveNegative();

}
}
