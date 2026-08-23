import java.util.*;

class Question24 {

    static void element(String str) {

        String res = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            res = res + str.charAt(i);
        }
        System.out.println(res);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        String str = sc.next();

        element(str);
    }

}
