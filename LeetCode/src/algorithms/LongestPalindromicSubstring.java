package algorithms;
/**
 * Given a string S, find the longest palindromic substring in S.
 *  You may assume that the maximum length of S is 1000, 
 * and there exists one unique longest palindromic substring
 * @author Cari
 *
 */

public class LongestPalindromicSubstring {

public  static String longestPalindromeWithDP(String s) {
	int length = s.length();
	if(s.length() < 2)
		return s;
	char[] c = s.toCharArray();
//	s.getChars(0, length, c, 0);
	//System.out.println(c[1]);
    boolean table[][] = new boolean[1000][1000];    
    int paliStart = 0;
    int maxLength = 0;
   
    for(int i = 0;i < length ; i++)
    	table[i][i] = true;
    for(int i = 0;i<length -1;i++){
    	if(c[i] == c[i+1]){
    		table[i][i+1] = true;
    		paliStart = i;
    		maxLength = 2;
    	}		
    }
    for(int len =3 ;len <=length;len++){
    	for(int i =0;i<length - len +1 ;i++){
    		int j = len +i -1;
    		if(c[i] == c[j] && table[i+1][j-1]){
    			table[i][j] = true;
    			paliStart = i;
    			maxLength = len;
    		}
    	}
    }
	return s.substring(paliStart,paliStart+ maxLength);
    }

public static String withCenterExpand(String s){
	int length = s.length();
	if(length < 2) return s;
	char c[] = new char[length];
	c = s.toCharArray();
	String sub = "";
	for(int i = 0 ;i < length ;i++){
		String sub1 = centerE(c, i, i);
		String sub2 = centerE(c, i, i+1);
		//System.out.println(sub.length()+" " + sub1 +" "+ sub2);
		if(sub1.length() > sub2.length()){
			if(sub1.length() > sub.length()){
				sub = sub1;
			}
		}else{
			if(sub2.length() > sub.length())
				sub = sub2;
		}
			
	}
	
	return sub;
}
public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(longestPalindromeWithDP("aaa"));
		System.out.println(withCenterExpand("bb"));
	}

public static String centerE(char[] c ,int x ,int y){
	int l = x;
	int r = y;
	int n = c.length;
	
	while (l >=0 && r<=n-1 && c[l] == c[r]){
		l--;
		r++;
	}
	return String.copyValueOf(c, l+1, r-l-1);
}
}
