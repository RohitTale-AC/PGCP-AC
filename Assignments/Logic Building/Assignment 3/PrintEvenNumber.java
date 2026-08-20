import java.util.Scanner;

class PrintEvenNumber{

static void printEvenNumbers(){

int num = 50;
int i=0;

while(i<=num){
if(i%2==0){
System.out.println(i);
}
i++;
}
}


public static void main(String args[]){

PrintEvenNumber.printEvenNumbers();

}
}