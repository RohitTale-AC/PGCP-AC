import java.util.Scanner;

class Question9{

static void largestElement(){
Scanner sc = new Scanner(System.in);

System.out.println("Enter the 5 integer :");



int arr[]= new int[5];
int max = arr[0];

for(int i=0; i<arr.length;i++){
	arr[i]=sc.nextInt();
}
for(int i=0;i<arr.length;i++){
	if(arr[i]>max){
		max = arr[i];
	}
}
System.out.println("The largest element is : "+ max);
}

public static void main(String args[]){

largestElement();

}
}
