package naomiwork;
public class TestBA3 {
    public static int factorial(int n) {
    int produs = 1;
    int i;
    if(n==0) {
    	return 1;
    }
    for(i=1;i<n+1;i++) {
    	produs = produs * i;
    	
    }
    	return produs;
    	
    	
    }
    public static void main(String[] args) {
		int n = 0;
		System.out.println(factorial(n));
	}
}
