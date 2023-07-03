
public class Tutorium05 {

	public static void main(String[] args) {
		System.out.println(match("1234", "1?3?"));
		System.out.println(match("123", "1?3?"));
		System.out.println(match("1243", "1?3?"));
	}
	
	public static boolean match (String str, String mask) {
		if (str.length() != mask.length()) {
			return false;
		}
		
		if(mask.length () == 0) {
			return true;
		}
		
		if(str.charAt(0) == mask.charAt(0) || mask.charAt(0) == '?' ) {
			return match(str.substring(1), mask.substring(1));
		}
		
		return false;
		
	}

}
