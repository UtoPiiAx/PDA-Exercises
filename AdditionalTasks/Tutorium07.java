import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Tutorium07 {
	
public static void main(String[] args) {
		
//		@Test
		assertEquals(4,div(8,2));
		assertEquals(4,div(9,2));
		assertNull(div(4,0));
		
//		@Test
//		assertArrayEquals(new int [] {0}, arrayMult(new int [] {0}, 1)); // 0*x
//		assertArrayEquals(new int [] {0,0,0}, arrayMult(new int [] {5,6,7}, 0)); // x*0
//		assertArrayEquals(new int [] {2,-4}, arrayMult(new int[] {1, -2}, 2)); // -*+
//		assertArrayEquals(new int [] {-10, -5}, arrayMult(new int [] {2, 1}, -5)); // +*-
//		assertArrayEquals([10, 5], arrayMult([-2, -1], -5)); // -*-
//		assertNull(arrayMult(new int [] {1,-2}, 2));
//		assertArrayEquals(new int [] {}, arrayMult(new int [] {}, 5));
//		
//		@Test
//		assertTrue(checkPrime(new int [] {7,13}));
//		assertFalse(checkPrime(new int [] {3,4}));
//		assertFalse(checkPrime(new int [] {-3}));
//		assertFalse(checkPrime(new int [] { }));
	}

public static int div(int a, int b) {
	if (a == 0 || b == 0 || b == 0) {
		return 0;
	} else {
		return a / b;
	}
}

}
