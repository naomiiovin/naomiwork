package naomiwork;

public class TestBA5 {
	public static int product(int[] sir) {

		int suma = 0;
		int product = 1;
		for (int i = 0; i < sir.length; i++) {

			if (sir[i] != 0) {

				product = sir[i] * product;
			}
			suma = sir[i] + suma;
		}
		if (suma == 0) {
			return 1;
		}
		return product;

	}

	public static void main(String[] args) {
		int[] sir = { 2, 4, 5, 6, 0 };
		System.out.println(product(sir));
	}
}
