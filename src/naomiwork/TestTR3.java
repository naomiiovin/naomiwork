package naomiwork;

import java.util.Scanner;

public class TestTR3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		System.out.println(number * number);
		System.out.println(number * number * number);

		scanner.close();
	}
}
