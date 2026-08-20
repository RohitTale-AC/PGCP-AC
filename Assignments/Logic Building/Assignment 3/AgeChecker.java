import java.util.Scanner;
class AgeChecker{


static void checkAgeCategory(int age){

if(age>=18 && age<=60){
System.out.println("You are an adult.");
}else if(age<=17){
System.out.println("You are an minor.");
}else{
System.out.println("You are an senior citizen.");
}

}

public static void main(String args[]){

Scanner sc = new Scanner(System.in);

System.out.println("Enter the age : ");
int age = sc.nextInt();

AgeChecker.checkAgeCategory(age);



}

}