import java.util.Scanner;

class Question2{

static void multipleofThree(){
Scanner sc = new Scanner(System.in);

System.out.println("Enter the number :");
int num = sc.nextInt();

for(int i=1; i<=num; i++){
if(i%3==0){
	System.out.println(i);
}
}

}

public static void main(String args[]){

multipleofThree();

}
}
