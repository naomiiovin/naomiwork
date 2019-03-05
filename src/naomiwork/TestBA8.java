package naomiwork;

import java.util.Arrays;

public class TestBA8 {
	public static int[] reverse(int[] sir) {
		int j = sir.length - 1;
		for (int i = 0; i < sir.length / 2; i++, j--) {
			int temp = sir[i];
			sir[i] = sir[j];
			sir[j] = temp;
		}
		return sir;
	}

	public static void main(String[] args) {
		int[] sir = { 1, 2, 3, 4, 5 };
		System.out.print(Arrays.toString(reverse(sir)));

	}
}
