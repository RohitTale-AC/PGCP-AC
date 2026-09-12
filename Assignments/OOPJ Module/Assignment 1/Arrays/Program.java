import secondJava.consoleInput;
import java.util.Arrays;

public class Program {

	public static void main(String[] args) {

		// 2. Sorting of Arrays.

//		ArraySort objSort = new ArraySort();
//		objSort.sortArray();

		// 3. Sum of Arrays.

//		ArraySum objSum = new ArraySum();
//		objSum.addArray();

		// 4. Average of Arrays.

//		ArrayAvg objAvg = new ArrayAvg();
//		objAvg.avgArray();

		// 5. Copy of iterating array

//		IterateArray objIte = new IterateArray();
//		objIte.copyArray();

		// 6. Min & Max of Arrays.

//		MinMaxArray objMinMax = new MinMaxArray();
//		objMinMax.minMaxArr();

		// 7. Reverse of Arrays.

//		ArrayRev objRev = new ArrayRev();
//		objRev.revArray();

		// 8. Finding duplicate values in array for integer values.

//		DuplicateArray objDuplicate = new DuplicateArray();
//		objDuplicate.duplicateArr();

		// 9. Finding duplicate values in array.

//		DupArray objDupVal = new DupArray();
//		objDupVal.dupValueArr();

		// 10. Common element in the array

//		CommonElement objCom = new CommonElement();
//		objCom.comElem();
		

		// Complex Number

		ComplexNumber arr[] = new ComplexNumber[5];

		for (int iarr = 0; iarr < 5; iarr++) {
			arr[iarr] = new ComplexNumber();

			System.out.println("Enter the num 1 : ");
			int num1 = consoleInput.getInt();
			System.out.println("Enter the num 2 : ");
			int num2 = consoleInput.getInt();

			arr[iarr].setNum1(num1);
			arr[iarr].setNum2(num2);
		}

		for (int iarr = 0; iarr < 5; iarr++) {
			int result = arr[iarr].computeComplexNumber();

			System.out.println("The multiple of num1 and num2 is : " + result);
		}

	}

}
