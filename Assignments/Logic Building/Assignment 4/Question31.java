import java.util.*;

class Question31 {

    static void string() {

        String str1 = "Java";
        String str2 = "Java";
        String str3 = "Java";

   
        System.out.println("All strings point to the same object: " + (str1 == str2 && str2 == str3));

    }

    public static void main(String args[]) {

        string();

    }
}
