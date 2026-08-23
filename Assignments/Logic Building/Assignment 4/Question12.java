import java.util.Scanner;
import java.util.Arrays;

class Question12{

static void sortArray(){
Scanner sc = new Scanner(System.in);

System.out.println("Enter the 6 integer :");

int arr[]= new int[5];

for(int i=0; i<arr.length; i++){
arr[i]=sc.nextInt();
}

Arrays.sort(arr);

System.out.println("Sorted arrays : "+ Arrays.toString(arr));

}

public static void main(String args[]){

sortArray();

}
}
