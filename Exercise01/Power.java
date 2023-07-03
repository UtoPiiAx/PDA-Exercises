public class Power {
  public static void main (String [] args) {
	  int a = 2;
	  int b = 4;
	  int result = 1;
	  int i = 1;
	  while (i <= b ) {
		  result *= a;
		  i = i + 1;
	  }
	  System.out.println(result);
  }
}
