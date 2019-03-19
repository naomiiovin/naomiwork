package testfinal;

public class Ex4 {
	public static void combinations(String s, int n) {
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			String before = s.substring(0, i);
			String after = s.substring(i + 1, s.length());
			combinations(before, n);

		}
		System.out.println();
	}

	public static void main(String[] args) {
		String s = "abc";
		int n = 2;
		System.out.println(combinations(s, n));
	}

}
