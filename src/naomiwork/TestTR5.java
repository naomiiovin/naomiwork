package naomiwork;

import java.util.Scanner;

public class TestTR5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduceti suma in RON: ");
		int sumaInRon = scanner.nextInt();
		System.out.print("Introduceti cursul valutar: ");
		double curs = scanner.nextDouble();
		double sumaInEur = sumaInRon / curs;
		int sumaIntreagaInEur = (int) sumaInEur;
		double restInEur = sumaInEur - sumaIntreagaInEur;
		int restInRon = (int) (restInEur * curs);
		System.out.println("Suma in EUR: " + sumaIntreagaInEur);
		System.out.println("Suma in RON: " + restInRon);

		scanner.close();

	}
}
