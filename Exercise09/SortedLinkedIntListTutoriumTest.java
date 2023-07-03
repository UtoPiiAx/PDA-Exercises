import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class SortedLinkedIntListTutoriumTest {
	@Test
	void testOrder () {
		SortedLinkedIntList list = new SortedLinkedIntList();
		assertArrayEquals(new int [] {}, list.toArray());
		list.add(5);
		assertArrayEquals(new int [] { 5 }, list.toArray());
		list.add(3);
		assertArrayEquals(new int [] { 3, 5}, list.toArray());
		list.add(8);
		assertArrayEquals(new int [] { 3, 5, 8}, list.toArray());
		list.add(4);
		assertArrayEquals(new int [] { 3, 4, 5, 8}, list.toArray());
		list.add(-2);
		assertArrayEquals(new int [] { -2, 3, 4, 5, 8}, list.toArray());
		list.add(5);
		assertArrayEquals(new int [] { -2, 3, 4, 5, 5, 8}, list.toArray());
	}
}
