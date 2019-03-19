package testfinal;

public class Ex1 {
	public static double harmonicAvg(int a, int b) {
		if (a + b == 0) {
			return 0;
		}
		double mh = (2.0 * a * b) / (a + b);

		return mh;
	}

	public static void main(String[] args) {
		int a = 4;
		int b = 5;
		System.out.println(harmonicAvg(a, b));
	}
}
