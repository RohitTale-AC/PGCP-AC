import java.util.Scanner;

class Question21{

static void pattern(){
Scanner sc = new Scanner(System.in);

System.out.println("Enter the number :");
int num = sc.nextInt();
int sum = 0;

for(int i=1;i<=num;i++){
for(int j=1;j<=i;j++){
	
	 sum = sum + 1;
	 System.out.print(" "+sum);

}
System.out.println(" ");
}




}

public static void main(String args[]){

pattern();

}
}
