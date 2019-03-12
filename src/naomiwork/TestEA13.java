package naomiwork;

public class TestEA13 {
	public static int getMaxTriple(int[] arr) {
		int sum = 0;
		int sum2 = 0;
		int max = 0;
		if (arr.length < 1) {
			return 0;
		}
		if (arr.length < 4) {
			for (int element : arr) {
				sum2 += element;
			}
			return sum2;
		}

		for (int i = 0; i < arr.length - 2; i++) {

			sum = arr[i] + arr[i + 1] + arr[i + 2];
			if (sum > max) {
				max = sum;
			}
		}

		return max;
	}

	public static void main(String[] args) {
		int[] arr = {};
		System.out.println(getMaxTriple(arr));
	}
}
