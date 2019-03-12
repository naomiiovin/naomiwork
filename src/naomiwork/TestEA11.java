package naomiwork;

public class TestEA11 {
	public static boolean isUnique(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i != j && arr[i] == arr[j]) {

					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int[] arr = { 8, 2, 7, 9, 3, 1 };
		System.out.println(isUnique(arr));
	}
}
