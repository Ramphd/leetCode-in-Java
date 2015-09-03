package algorithms;

public class PalindromeNumber {
	public static boolean isPalindrome(int x) {
		if (x < 0)
            return false;
        int xCopy = x;
        int reverse = 0;
        while (xCopy != 0) {
            reverse = 10 * reverse + xCopy % 10;
            xCopy /= 10;
        }
        return reverse == x;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
