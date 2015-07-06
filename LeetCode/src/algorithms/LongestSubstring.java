package algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Longest Substring Without Repeating Characters 
 * @author Cari
 *Given a string, find the length of the longest substring without repeating characters. 
 *For example, the longest substring without repeating letters for "abcabcbb" is "abc",
 * which the length is 3. For "bbbbb" the longest substring is "b", with the length of 1.
 */
public class LongestSubstring {
	public static int lengthOfLongestSubstring1(String s) {//利用charASCII 码的数字和第一题有一样的取巧的思想
        boolean[] occur = new boolean[127];
        int result = 0;
        for (int i = 0, j = 0; j < s.length(); i++) {
            for (; j < s.length() && !occur[s.charAt(j)]; j++) {
                occur[s.charAt(j)] = true;
            }
            result = Math.max(result, j - i);
            occur[s.charAt(i)] = false;
        }
        return result;
    }
	
public static int lengthOfLongestSubstring(String s) {
        String ss = s;
        if(ss.equals("")){
        	return 0;
        }else{
        	if(ss.length() == 1)
        		return 1;
        }
        int  subStart = 0, subEnd = 1 , end = ss.length() - 1;
        String sub = ss.substring(subStart, subEnd);//subString not contains the [subEnd] element
       List<Integer> l = new ArrayList<Integer>();
        while(subEnd < end + 1){
        while(subEnd < end + 1 && !sub.contains(ss.subSequence(subEnd, subEnd +1))){
        	subEnd += 1;
        	sub = ss.substring(subStart, subEnd);
        }
        l.add(sub.length());
        subStart += 1;
        if(subStart == subEnd)
        	subEnd += 1;
        sub = ss.substring(subStart, subEnd);
        }
        
		return Collections.max(l);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcdefashjuib";
		System.out.println(lengthOfLongestSubstring1("ssss"));
		int[] a = new int[128];
		a[97] = 33;
		System.out.println(a['a']);
	}

}
