package naomiwork;

public class TestBA4 {
	public static int max(int[] sir) {
		int max = 0;
		for (int i = 0; i < sir.length; i++) {
			if (sir[i] > max) {
				max = sir[i];

			}

		}
		return max;
	}

	public static void main(String[] args) {
		int[] sir = { 2, 5, 10, 65, 3 };
		System.out.println(max(sir));
	}
}
