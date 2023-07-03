public class Datentypen {

	public static void main(String[] args) {
		int integer = 50;
		long longinteger = 5000000L;
		float floatingnumber = 5.0F;
		double doublevalue = 500000000;
		char character = 'A';
		double sumdouble = integer + longinteger + floatingnumber + doublevalue + character;
		int sumint = integer + (int) longinteger + (int) floatingnumber + (int) doublevalue + (int) character;
		System.out.println(sumdouble);
		System.out.println(sumint);
	}
}
