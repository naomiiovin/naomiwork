package naomiwork;

import java.util.Arrays;

public class TestEA8 {
	public static boolean contains(int[] a, int[] b) {
		if (a.length == 0) {
			return false;
		}
		if (b.length == 0) {
			return true;
		}
		int[] newArr = new int[b.length];
		for (int i = 0; i < a.length; i++) {
			if (a[i] == b[0]) {
				System.arraycopy(a, i, newArr, 0, b.length);
			}

		}
		return Arrays.equals(newArr, b);

	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 2, 1, 3, 4 };
		int[] b = { 2, 3, 4 };
		System.out.println(contains(a, b));
	}
}
