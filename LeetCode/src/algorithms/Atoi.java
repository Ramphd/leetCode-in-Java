package algorithms;
/**
 * Implement atoi to convert a string to an integer.
 * @author Cari
 *
 */
public class Atoi {
	public static int myAtoi(String str) {
        String s = str.trim();
        if(s.length() == 0) return 0;
        double result = 0;
        boolean sig = false;
        char a;
        int i = 0;
        if(s.charAt(0) == '-' || s.charAt(0) == '+'){
        	sig = s.charAt(0) == '-' ? true : false;
        	i = 1;
        }

        for(;i < s.length() ; i ++){
        		a = s.charAt(i);
        	if(a < '0' || a > '9')
        		break;
        	else
        		result = 10 * result + (a - '0');
        }
//        result *= (sig == true ? -1 : +1);
        if(result > Integer.MAX_VALUE)
        	return Integer.MAX_VALUE;
        else
        	if(result < Integer.MIN_VALUE)
        	return Integer.MIN_VALUE;
		return (int)result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(myAtoi("9223372036854775809"));
	}

}
