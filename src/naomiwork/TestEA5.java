package naomiwork;

public class TestEA5 {
	public static int cmmdc(int a, int b) {
		int temp = a * b;
		int cmmdc = temp;
		for (int i = 1; i < temp; i++) {
			if (a % i == 0 && b % i == 0) {
				cmmdc = i;
			}
		}
		return cmmdc;

	}

	public static void main(String[] args) {
		int a = 10;
		int b = 6;
		System.out.println(cmmdc(a, b));

	}
}
