package naomiwork;

public class TestBA6 {
	public static int arrayToInt(int[] arr) {
		int nr = 0;
		if (arr.length == 0) {
			return -1;
		}
		for (int element : arr) {
			nr *= 10;
			nr += element;
			if (element > 9) {
				return -2;
			}

		}
		return nr;
	}

	public static void main(String[] args) {
		System.out.println(arrayToInt(new int[] {}));
	}
}
