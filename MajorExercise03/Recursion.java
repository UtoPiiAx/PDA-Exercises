public class Recursion {

	public static void main(String[] args) {
		System.out.println(sum(5));
		System.out.println(sum(-5));
		System.out.println(sum(0));
	}
	
	public static long sum(int number) {
		if (number == 0) {
			return 0;
		} else if (number > 0) {
			return number + sum(number - 1);
		} else {
			return number + sum(number + 1);
		}
	}
}
