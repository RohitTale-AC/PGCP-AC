import java.util.*;

class Question13 {

    static void element(int arr[], int num) {

        Arrays.sort(arr);
        int res = Arrays.binarySearch(arr, num);

        if (res >= 0) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }

    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the 5 integer :");

        int arr[] = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the number to search : ");
        int num = sc.nextInt();

        element(arr, num);

    }
}
