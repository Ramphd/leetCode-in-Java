package algorithms;

public class AddDigits {
	//static int temp = 0;
	static int addDigits(int num) {
		int temp = 0;
		Integer i = num;
		String s = i.toString();
		for(int j  = 0;j < s.length() ; j++){
			temp += Integer.parseInt(s.substring(j,	j+1));
		}
		if(temp >= 10)
			temp = addDigits(temp);

		return temp;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(addDigits(444));
	}

}
