package algorithms;
/**
 * @author Cari
 *Reverse digits of an integer.
Example1: x = 123, return 321
Example2: x = -123, return -321
Have you thought about this?
Here are some good questions to ask before coding. Bonus points for you if you have already thought through this!
If the integer's last digit is 0, what should the output be? ie, cases such as 10, 100.
Did you notice that the reversed integer might overflow? Assume the input is a 32-bit integer, 
then the reverse of 1000000003 overflows.How should you handle such cases?
For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
 */
import static java.lang.Math.*;

public class ReverseInteger {
	public static int reverse(int x) { 
		if(x == 0) return x;
		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;
		boolean negative = false;
		if(x < 0) negative  = true;
		char[] a  = String.valueOf(abs(x)).toCharArray();
		char[] b = new char[a.length];
		for(int i = a.length -1 ; i >=0 ; i--)
			b[a.length -1 - i] = a[i];
		System.out.println();
		return Integer.parseInt("56566");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverse(-234));
		//System.out.println(Integer.MIN_VALUE);
		
	}

}
