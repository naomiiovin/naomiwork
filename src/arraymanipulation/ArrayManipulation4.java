
package arraymanipulation;
import java.util.Arrays;

public class ArrayManipulation4 {
   public static void main(String[] args) {
	int size=5;
	int[] a = new int[size];
	int val = 3;
	Arrays.fill(a, val);
	for(int i=0;i<size;i++) {
	System.out.println(a[i]);
	}
}
}
 // exemple for fill
