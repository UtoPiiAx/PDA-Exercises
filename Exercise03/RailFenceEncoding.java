
public class RailFenceEncoding {

	public static void main(String[] args) {
		String text = "gartenzauntransposition";
	
		char [] sequence = text.toCharArray () ;
		char [] sequenceEncoded = new char [sequence.length]; 
		
		int index = 0;
		
		for (int i = 0; i < sequence.length; i += 2) {
			sequenceEncoded[index++] = sequence[i];
		}
		
		for (int i = 1; i < sequence.length; i += 2) {
			sequenceEncoded[index++] = sequence[i];
		}
		
		// encoding...
		
		String code = String.copyValueOf(sequenceEncoded);
		System.out.println(code);
		
		char [] sequenceDecoded = new char [sequenceEncoded.length]; 
		
		index = 0;
		for (int i = 0; i < sequenceEncoded.length; i += 2) {
			sequenceDecoded[i] = sequenceEncoded[index++];
		}
		for (int i = 1; i < sequenceEncoded.length; i += 2) {
			sequenceDecoded[i] = sequenceEncoded[index++];
		}
		
		// decoding ...
		
		text = String.copyValueOf(sequenceDecoded);
		System.out.println(text);
	}
}



/* encoded | original
 * 0 (+1)		0 (+2)
 * 1			2
 * 2			1 (+2)
 * 3			3
 * 
 */