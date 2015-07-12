package algorithms;

public class ZigZag {
	public static String convert(String s, int nRows){
	    if(nRows == 1) return s;
	    String[] res = new String[nRows];
	    for (int k = 0 ; k < res.length ; k ++)
	    	res[k] = "";
	    int i = 0, j, gap = nRows-2;
	    while(i < s.length()){
	        for(j = 0; i < s.length() && j < nRows; ++j) res[j] +=s.charAt(i++);
	        for(j = gap; i < s.length() && j > 0; --j){
	        	res[j] += s.charAt(i++);
	        }
	    }
	    String str = "";
	    for(i = 0; i < nRows; ++i)
	        str += res[i];
	    return str;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(convert("PAYPALISHIRING", 4));
	}

}
