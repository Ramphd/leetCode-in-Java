package algorithms;

public class LengthofLastWord {
	static int lengthOfLastWord(String s) {
        int length = 0;
		if(s.length() > 0){
			
			String[] a = s.split(" ");
			if(a.length > 0)
				length = a[a.length -1].length();
			
        }
		return length;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lengthOfLastWord("b"));
	}

}
