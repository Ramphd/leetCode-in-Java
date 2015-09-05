package algorithms;

public class PowerOfTwo {
	static boolean isPowerOfTwo(int n) {
		if(n > 0)
		 return (n & n-1) == 0;
		else
			return false;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
