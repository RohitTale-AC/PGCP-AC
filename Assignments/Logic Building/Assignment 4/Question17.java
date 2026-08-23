
import java.util.Scanner;

class Question17 {

    static void pattern() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number :");
        int num = sc.nextInt();
        int sum = 1;

        for (int i = 1; i <= num; i++) {
            int n = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(n);
                if (j<i) {
                    System.out.print("*");
                }
                n = n+2;
            }
            System.out.println(" ");
        }

    }

    public static void main(String args[]) {

        pattern();

    }
}
