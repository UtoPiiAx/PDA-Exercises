import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class SortedLinkedIntListTest {

	@Test
	public void testAdd() {
		SortedLinkedIntList list = new SortedLinkedIntList();
		list.add(3);
		list.add(1);
		list.add(2);
		list.add(5);
		list.add(4);
		assertArrayEquals(new int[] { 1, 2, 3, 4, 5 }, list.toArray());
	}

	@Test
	public void testReset() {
		SortedLinkedIntList list = new SortedLinkedIntList();
		list.add(3);
		list.add(1);
		list.add(2);
		list.reset();
		assertArrayEquals(new int[] { 1, 2, 3 }, list.toArray());
	}

	@Test
	public void testGetNext() {
		SortedLinkedIntList list = new SortedLinkedIntList();
		list.add(3);
		list.add(1);
		list.add(2);
		list.reset();
		assertArrayEquals(new int[] { 1, 2, 3 }, new int[] { list.getNext(), list.getNext(), list.getNext() });
	}

	@Test
	public void testHasNext() {
		SortedLinkedIntList list = new SortedLinkedIntList();
		list.add(3);
		list.add(1);
		list.add(2);
		list.reset();
		assertArrayEquals(new boolean[] { true, true, true, false },
				new boolean[] { list.hasNext(), list.hasNext(), list.hasNext(), list.hasNext() });
	}

	@Test
	public void testToArray() {
		SortedLinkedIntList list = new SortedLinkedIntList();
		list.add(3);
		list.add(1);
		list.add(2);
		assertArrayEquals(new int[] { 1, 2, 3 }, list.toArray());
	}
}
