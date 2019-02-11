package arraymanipulation;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulation2 {
	public static void main(String[] args) {

		int[] arr = { 31, 75, 1, 89, 21 };

//		Scanner scanner = new Scanner(System.in);
//
//		System.out.print("Cauta elementul: ");
//		int n = scanner.nextInt();
//		for (int i = 0; i < arr.length; i++) {
//
//			int a = arr[i];
//			if (n == a)
//				System.out.println("Element gasit in sir pe pozitia " + i + ".");
// }

		System.out.println(Arrays.binarySearch(arr, 5));

	}
}
//example of searching for elements in an array
//done in 2 different ways
