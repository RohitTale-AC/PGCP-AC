import java.util.Scanner;

class Question4{

static void evenNumber(){
Scanner sc = new Scanner(System.in);

System.out.println("Enter the number :");
int num = sc.nextInt();

for(int i=1; i<=num; i++){
if(i%2==0){
	System.out.println(i);
}
}

}

public static void main(String args[]){

evenNumber();

}
}
