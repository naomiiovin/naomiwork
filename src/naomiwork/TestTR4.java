package naomiwork;

import java.util.Scanner;

public class TestTR4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Suma in EURO: ");
		int euro = scanner.nextInt();
		System.out.print("Curs valutar: ");
		double cursEuro = scanner.nextDouble();
		double sumaRon = euro * cursEuro;
		System.out.print("Suma in RON: " + sumaRon);
		
		
		scanner.close();
	}

}
