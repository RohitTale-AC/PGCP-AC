import java.util.Scanner;

class Question10{

static void averageElement(){
Scanner sc = new Scanner(System.in);

System.out.println("Enter the 5 integer :");

int arr[]= new int[5];
int sum=0;
int average =0;
for(int i=0; i<arr.length; i++){
	arr[i]=sc.nextInt();
}

for(int print : arr){
		sum = sum + print;
		average = sum/arr.length;
}
System.out.println("The average of the number is : "+ average);
}

public static void main(String args[]){

averageElement();

}
}
