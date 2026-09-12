import secondJava.consoleInput;

public class ArrayAvg {

public void avgArray(){
		
		System.out.println("Enter the size of the array : ");
		int size = consoleInput.getInt();

		int arr[] = new int[size];

		// Input of the array.
		for (int iarr = 0; iarr < size; iarr++) {
			arr[iarr] = consoleInput.getInt();
		}

		int sum=0;
		int average = 0;
		for (int iarr = 0; iarr < size; iarr++) {
			sum = sum + arr[iarr];
		}
		
		average = sum/size;
		
		System.out.println("The average of array is : "+ average);
	
	}
}
