package app;

public class UpperLowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "India is my country. All Indians are my brothers and sisters. I love my country";
		int uppercase=0;
		int lowercase=0;
		for(int i=0;i<s.length();i++){
			if(Character.isUpperCase(s.charAt(i))){
				uppercase++;
			}
			if(Character.isLowerCase(s.charAt(i))){
				lowercase++;
			}
		}
		System.out.println("No of uppercase letters are : " +uppercase);
		System.out.println("No of lowercase letters are : " +lowercase);
	}

}
