package naomiwork;

public class TestBA7 {
	public static int find(int[] sir, int n) {

		for (int i = 0; i < sir.length; i++) {

			int a = sir[i];
			if (n == a) {
				return i;
			}

		}
		return -1;
	}

	public static void main(String[] args) {
		int[] sir = { 2, 3, 7, 1 };
		int n = 7;
		System.out.println(find(sir, n));
	}
}
