package code;

public class StringFunctions {
	
public static boolean isPalindrome(String str) {
		
		String reverse="";
		boolean flag=false;
		
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse= reverse+ str.charAt(i);
		}
		
		if (str.equalsIgnoreCase(reverse)) {
			flag=true;
		}
		
		return flag;
	}


}
