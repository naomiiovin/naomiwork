package arraymanipulation;

public class ArrayManipulation {
	public static void main(String[] args) {
		char[] arr = new char[5];
		char[] arrr = { '.', ',', '.', ',', '.', ',', '.', ',', '.' };
		arr[0] = 'n';
		arr[1] = 'a';
		arr[2] = 'o';
		arr[3] = 'm';
		arr[4] = 'i';
		System.out.println(arr);

		System.arraycopy(arr, 0, arrr, 3, 3); // copying an array example
		System.out.println(arrr);

	}

}
//example of copying array elements into another array