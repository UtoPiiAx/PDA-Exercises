
public class Aufgabe2 {
	public class uebung062 {
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(symmetricDigitSequence(4));
		System.out.println(symmetricDigitSequenceRec(4));
		}
		
		public static String symmetricDigitSequence(int max) {
		//positive Zahlen
		if(max >= 0) {
			int count = max;
			String a = "";
			for( int i = count; i > 0; i-- ) {
				a = a + i;
			}
		String b = "0";
		String c = "";
			for( int j = 1; j <= count; j++ ) {
				c = c + j;
			}
		String result = a + b + c;
		return result;
		}
		
		//negative Zahlen
		else {
			int count = max;
			String a = "";
			for( int i = count; i < 0; i++ ) {
				a = a + i;
			}
			String b = "0";
			String c = "";
			for( int j = -1; j >= count; j-- ) {
				c = c + j;
			}
			String result = a + b + c;
			return result;
			}
		}
		
		public static String symmetricDigitSequenceRec(int max){
		//positive Zahlen
		if (max >=0) {
			if( max == 0) {
				return "0";
			}
		else {
			return max + symmetricDigitSequenceRec(max - 1) + max;
			}
		}
		
		//negative Zahlen
		else {
			if( max == 0) {
				return "0";
			}
		else {
			return max + symmetricDigitSequenceRec(max + 1) + max;
			}
			}
		}
	}
}
