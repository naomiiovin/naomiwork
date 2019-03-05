package naomiwork;

public class TestBA1 {

	public static double avg(int[] sir) {
		int suma = 0;
		double media = 0;
		for (int i = 0; i < sir.length; i++) {
			suma += sir[i];
			media = suma / (double) sir.length;
		}
		return media;

	}

	public static void main(String[] args) {
		int[] sir = { 1, 2, 3, 4 };
		System.out.println(avg(sir));

	}

}
