import java.util.Scanner;

class Question19{

static void pattern(){
Scanner sc = new Scanner(System.in);

System.out.println("Enter the number :");
int num = sc.nextInt();

for(int i=1;i<=num;i++){
for(int j=1;j<=i;j++){
System.out.print(i);
}
System.out.println(" ");
}




}

public static void main(String args[]){

pattern();

}
}
