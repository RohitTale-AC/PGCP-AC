import java.util.*;

class Question13 {

    static boolean element(Integer[] arr, int num) {
        return Arrays.asList(arr).contains(num);
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the 5 integer :");

        Integer arr[] = new Integer[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the number to search : ");
        int num = sc.nextInt();

       boolean res =  element(arr, num);

       if (res) {
        System.out.println("Found");
       }else{
        System.out.println("Not found");
       }

    }
}
