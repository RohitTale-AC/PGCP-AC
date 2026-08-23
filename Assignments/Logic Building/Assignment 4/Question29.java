import java.util.*;

class Question29 {

    static void element() {

        String str1 = "hello";
        String str2 = "World";
        String str3 = str1 + str2;

        System.out.println("Is str3 pointing to the same object as str1 ? "+ (str3 == str1));
        
    }

    public static void main(String[] args) {
        element();
    }
}
