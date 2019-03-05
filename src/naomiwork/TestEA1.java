package naomiwork;

public class TestEA1 {
	public static int reverse(int n) {

		int reversed = 0;
		for (int i = n; i != 0; i /= 10) {
			reversed = reversed * 10 + i % 10;
		}
		return reversed;
	}

	public static void main(String[] args) {
		int n = 123;
		System.out.println(reverse(n));
	}
}