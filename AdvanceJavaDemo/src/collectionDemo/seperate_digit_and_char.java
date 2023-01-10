package collectionDemo;

public class seperate_digit_and_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Amit02Yadav07";
		String s2="";
		String s3="";
		for(int i=0; i<s.length(); i++) {
			
			if(Character.isDigit(s.charAt(i))){
				s2= s2 + s.charAt(i);
			}
			else {
				s3= s3+s.charAt(i);
			}
		}
		System.out.println(s2);
		System.out.println(s3);
	
	}

}
