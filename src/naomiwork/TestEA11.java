package naomiwork;

public class TestEA11 {
	public static boolean isUnique(int[] arr) {
		int count = 0;
		for (int element : arr) {
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == element) {
					count++;
				}

			}

		}
		if (count >= 2) {
			return false;
		}
		return true;

	}

	public static void main(String[] args) {
		int[] arr = { 8, 2, 7, 9, 3, 3 };
		System.out.println(isUnique(arr));
	}
}
