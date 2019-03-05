package naomiwork;

public class TestEA12 {
	public static int[] removePosition(int[] arr, int pos) {
		// public void removeElement(Object[] arr, int removedIdx) {
		System.arraycopy(arr, pos + 1, arr, pos, arr.length - 1 - pos);
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		System.out.println(removePosition(arr, 4));
	}
}
