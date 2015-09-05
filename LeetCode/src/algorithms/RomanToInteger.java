package algorithms;

import java.util.HashMap;

public class RomanToInteger {
	static int romanToInt(String s) {
		HashMap<Character,Integer> gm = new HashMap<Character,Integer>();
		gm.put('I', 1);
        gm.put('V', 5);
        gm.put('X', 10);
        gm.put('L', 50);
        gm.put('C', 100);
        gm.put('D', 500);
        gm.put('M', 1000);
        int result = gm.get(s.charAt(s.length() - 1));
        for (int i = s.length() - 2; i >= 0; i--) {
        	 result += (gm.get(s.charAt(i)) < gm.get(s.charAt(i + 1)) ? 
                     -1 : 1) * gm.get(s.charAt(i));
        }
        return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
