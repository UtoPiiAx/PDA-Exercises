import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Tutorium08 {
	public static int div(int a, int b) {
		if (a == 0 || b == 0 || b == 0) {
			return 0;
		} else {
			return a / b;
		}
	}	
	@Test
	void test() {
		assertEquals(4, div(8, 2));
		assertEquals(3, div(7, 2));
		assertEquals(-4, div(-8, 2));
		assertNull(div(8, 0));
//		assertNull(div(8, null));
//		assertArrayEquals(new int[] { 0, 2, -4 }, arrayMult(new int[] { 0, 1, -2 }, 2));
//		assertArrayEquals(new int[] { -2 }, arrayMult(new int[] { 1 }, -2));
//		assertArrayEquals(new int[] { }, arrayMult(new int[] { }, 1));
//		assertTrue(checkPrime(new int[] { 3 }));
//		assertTrue(checkPrime(new int[] { 3, 7 }));
//		assertTrue(checkPrime(new int[] { }));
//		assertFalse(checkPrime(new int[] { 3, 4 }));
//		assertFalse(checkPrime(new int[] { -3 }));
	}

}
