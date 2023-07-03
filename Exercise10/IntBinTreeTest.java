import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IntBinTreeTest {

	@Test
	void testIsFull() {
		Integer[] values1 = { 1, 2, 3 };
		IntBinTree tree1 = IntBinTree.createTree(values1);
		assertTrue(tree1.isFull());

		Integer[] values2 = { 1, 2 };
		IntBinTree tree2 = IntBinTree.createTree(values2);
		assertFalse(tree2.isFull());
	}

	@Test
	void testIsComplete() {
		Integer[] values1 = { 1, 2, 3, 4, 5, 6, 7 };
		IntBinTree tree1 = IntBinTree.createTree(values1);
		assertTrue(tree1.isComplete());

		Integer[] values2 = { 1, 2, 3, 4, 5, null, 7 };
		IntBinTree tree2 = IntBinTree.createTree(values2);
		assertFalse(tree2.isComplete());
	}

	@Test
	void testIsPerfect() {
		Integer[] values1 = { 1, 2, 3, 4, 5, 6, 7 };
		IntBinTree tree1 = IntBinTree.createTree(values1);
		assertTrue(tree1.isPerfect());

		Integer[] values2 = { 1, 2, 3, 4, 5, null, 7 };
		IntBinTree tree2 = IntBinTree.createTree(values2);
		assertFalse(tree2.isPerfect());

		Integer[] values3 = { 1 };
		IntBinTree tree3 = IntBinTree.createTree(values3);
		assertTrue(tree3.isPerfect());
	}

	@Test
	void testCountNodes() {
		Integer[] values = { 1, 2, 3, 4, 5, 6, 7 };
		IntBinTree tree = IntBinTree.createTree(values);
		assertEquals(7, tree.countNodes());
	}

	@Test
	void testCountInnerNodes() {
		Integer[] values = { 1, 2, 3, 4, 5, 6, 7 };
		IntBinTree tree = IntBinTree.createTree(values);
		assertEquals(3, tree.countInnerNodes());
	}

	@Test
	void testCountLeaves() {
		Integer[] values = { 1, 2, 3, 4, 5, 6, 7 };
		IntBinTree tree = IntBinTree.createTree(values);
		assertEquals(4, tree.countLeaves());
	}

	@Test
	void testGetHeight() {
		Integer[] values = { 1, 2, 3, 4, 5, 6, 7 };
		IntBinTree tree = IntBinTree.createTree(values);
		assertEquals(3, tree.getHeight());
	}

}
