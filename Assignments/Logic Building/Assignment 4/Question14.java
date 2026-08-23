import java.util.*;

class Question14 {

  static void element(int arr[], int num) {

    Arrays.sort(arr);

    String str = Arrays.toString(arr);
    int res = Arrays.binarySearch(arr, num);
    System.out.println(str);
    System.out.println(res);

  }

  public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter 5 integer :");

    int arr[] = new int[5];

    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }

    System.out.println("Enter the number to be search :");
    int num = sc.nextInt();

    element(arr, num);
  }
}
