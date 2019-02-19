package naomiwork;

public class TestBA2 {

	public static int countNegatives(int[] sir) {
		int i;
		int count = 0;
		for (i = 0; i < sir.length; i++) {
			if (sir[i] < 0) {
				count++;

			}
		}
		return count;

	}

	public static void main(String[] args) {
		int[] sir = { 2, -3, 5, -10, 7 };
		System.out.println(countNegatives(sir));

	}
}
