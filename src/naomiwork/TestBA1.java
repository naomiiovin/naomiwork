package naomiwork;

import java.util.Arrays;

public class TestBA1 {

	public static double avg(int[] sir) {
		int suma = Arrays.stream(sir).sum();
		double media = suma / (double) sir.length;

		return media;
	}

	public static void main(String[] args) {
		int[] sir = { 1, 2, 3, 4 };
		System.out.println(avg(sir));

	}

}
