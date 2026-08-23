import java.util.Scanner;

class Question6{

static void printArr(){
Scanner sc = new Scanner(System.in);

System.out.println("Enter the 5 integer :");

int num;
int arr[] = new int[5];


for(int i=0; i<arr.length;i++){
	 arr[i] =sc.nextInt();
}

for(int print : arr){
System.out.println(print);
}

}

public static void main(String args[]){

printArr();

}
}
