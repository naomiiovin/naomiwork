package testfinal;

public class Ex3 {
	public static int next(int[] arr, int n) {
		if (n == arr[arr.length - 1]) {
			return -1;

		}

		int nextNumber = 0;
		for (int i = 0; i < arr.length; i++) {
			if (n == arr[i]) {
				nextNumber = arr[i + 1];
				return nextNumber;
			}

		}
		return -2;

	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 8 };
		int n = 17;
		System.out.println(next(arr, n));
	}

}
