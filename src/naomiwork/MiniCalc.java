package naomiwork;

import java.util.Scanner;

public class MiniCalc {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double start = 0.0;
		System.out.println(start);
		for (start = 0.0;;) {
			System.out.print('>');
			String operation = scanner.nextLine();
			char operator = operation.charAt(0);
			if (operator == 'x') {
				scanner.close();
				System.out.println("Bye!");
				break;

			}
			String ceRamane = operation.substring(1);
			double operand = Double.parseDouble(ceRamane);

			switch (operator) {
			case '+':
				start = start + operand;
				System.out.println(start);
				break;
			case '-':
				start = start - operand;
				System.out.println(start);
				break;
			case '*':
				start = start * operand;
				System.out.println(start);
				break;
			case '/':
				start = start / operand;
				System.out.println(start);
				break;
			case '=':
				System.out.println(start);
				break;
			default:
				System.out.println("Invalid operation.");

			}

		}
	}
}
