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
public class ReverseInteger {
	public static int reverse(int x) { 
		if(x == 0) return x;
//		int result = 0;
		long reTemp = 0;
//		boolean negative = false;
//		if(x < 0) negative  = true;
		while (x != 0 ){
			reTemp = 10 * reTemp + x % 10;
			x /= 10;
		}

		if(reTemp > Integer.MAX_VALUE || reTemp < Integer.MIN_VALUE)
			return 0;
		
		return (int)reTemp;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverse(-2345));
		System.out.println(Integer.MAX_VALUE);
		//System.out.println(Integer.MIN_VALUE);
		
	}

}
