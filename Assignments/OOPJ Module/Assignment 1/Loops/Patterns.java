
public class Patterns {

	public static void main(String[] args) {

		// Display odd numbers till 1000

//		int num = 1000;
//		for (int iTemp = 1; iTemp <= num; iTemp++) {
//			if (iTemp % 2 != 0)
//				System.out.println("The odd number is : " + iTemp);
//		}

		// Display even number till 500

//		int num = 500;
//		for (int iTemp = 1; iTemp <= num; iTemp++) {
//			if (iTemp % 2 == 0)
//				System.out.println("The even number is : " + iTemp);
//		}

		// Display 7th number till 200

//		int num = 200;
//		for (int iTemp = 1; iTemp <= num; iTemp++) {
//			if (iTemp % 7 == 0)
//				System.out.println("The even number is : " + iTemp);
//		}

		// Half Piramid

//		int num = 5;
//		for (int iTemp = 1; iTemp <= num; iTemp++) {
//			for (int jTemp = 1; jTemp <= iTemp; jTemp++) {
//				System.out.print("*");
//			}
//			System.out.println(" ");
//		}

		// Inverted half piramid

//		int num = 5;
//		
//		for (int iTemp = num; iTemp >= 1; iTemp--) {
//			for (int jTemp = 1; jTemp <= iTemp; jTemp++) {
//				System.out.print("*");
//			}
//			System.out.println(" ");
//		}/

		// Numbers half piramid

//		int num = 4;
//		int number = 1;
//		for (int iTemp = 1; iTemp <= num; iTemp++) {
//			for (int jTemp = 1; jTemp <= iTemp; jTemp++) {
//				System.out.print(number + " ");
//				number ++;
//			}
//			System.out.println(" ");
//		}
		
		//continue number piramid
		
//			int num = 6;
//			for (int iTemp = 1; iTemp <= num; iTemp++) {
//			for (int jTemp = 1; jTemp <= iTemp; jTemp++) {
//				System.out.print(jTemp + " ");
//			}
//			System.out.println(" ");
//		}
			
			// Inverted continue number piramid
			
			int num = 6;
			for (int iTemp = num; iTemp >=1; iTemp--) {
			for (int jTemp = 1; jTemp <= iTemp; jTemp++) {
				System.out.print(jTemp + " ");
			}
			System.out.println(" ");
		} 

	}

}
