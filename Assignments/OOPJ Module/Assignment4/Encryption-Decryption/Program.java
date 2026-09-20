

import java.io.*;
import java.util.Scanner;

public class Program {

	static void fileEncrypt(String filePath) {

		String outputPath = filePath + "_enc";

		try {

			FileInputStream input = new FileInputStream(filePath);
			FileOutputStream output = new FileOutputStream(outputPath);

			int data = input.read();

			while (data != -1) {
				int encryptByte = (data + 5) % 256;
				output.write(encryptByte);
				data = input.read();
			}
			input.close();
			output.close();
			System.out.println("File is encrypted");
			System.out.println("The path of file is " + outputPath);

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	static void fileDecrypt(String filePath) {

		String outputPath = filePath + "_dec";

		try {

			FileInputStream input = new FileInputStream(filePath);
			FileOutputStream output = new FileOutputStream(outputPath);

			int data = input.read();

			while (data != -1) {

				int decryptByte = (data - 5) % 256;

				output.write(decryptByte);
				data = input.read();
			}

			input.close();
			output.close();

			System.out.println("File is decrypted");
			System.out.println("The path of decrypted file " + outputPath);

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("========== Encrytion/Decryption Menu ==========");
			System.out.println("1. Encrypt file");
			System.out.println("2. Decrypt file");
			System.out.println("3. Exit");

			System.out.println("Enter the choice number : ");
			String choice = sc.nextLine();

			if (choice.equals("1")) {
				System.out.println("Enter the filepath : ");
				String encryptPath = sc.nextLine();
				fileEncrypt(encryptPath);
			} else if (choice.equals("2")) {
				System.out.println("Enter the filepath : ");
				String decryptPath = sc.nextLine();
				fileDecrypt(decryptPath);
			} else if (choice.equals("3")) {
				System.out.println("Exit... ");
				break;
			} else {
				System.out.println("Invalid Choice.");
			}

		}

	}

}
