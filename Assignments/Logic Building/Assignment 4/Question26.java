import java.util.*;

class Question26 {

    static void element(String str) {

        str.toLowerCase();
        String res = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            res = str.charAt(i) + res;
        }
        if (res.equals(str)) {
            System.out.println("The string " + str + " is a pallindrome.");
        } else {
            System.out.println("The string " + str + " is a not pallindrome.");
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String :");
        String str = sc.next();

        element(str);

    }

}
