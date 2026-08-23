import java.util.*;

class Question3 {

    static void element(int num) {

        int res = 1;

        for (int i = 1; i <= num; i++) {
            res = res * i;
        }
        System.out.println(res);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int num = sc.nextInt();

        element(num);

    }

}