import java.util.Scanner;

class Question8{

static void printAllName(){
Scanner sc = new Scanner(System.in);

System.out.println("Enter the 4 names :");


String str[] = new String[4];

for(int i=0; i<str.length;i++){
	 str[i] =sc.nextLine();
}

for(String print : str){
System.out.print(print);
}
}

public static void main(String args[]){

printAllName();

}
}
