import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IntBinTreeTest {

	@Test
    public void testIsSearchTree() {
        IntBinTree searchTree = new IntBinTree(new IntBinTree(null, 1, null), 2, new IntBinTree(null, 3, null));
        assertTrue(searchTree.isSearchTree());

        IntBinTree notSearchTree = new IntBinTree(new IntBinTree(null, 3, null), 2, new IntBinTree(null, 1, null));
        assertFalse(notSearchTree.isSearchTree());
    }
	
	@Test
	public void testIsAVLTree() {
        IntBinTree avlTree = new IntBinTree(new IntBinTree(null, 1, null), 2, new IntBinTree(null, 3, null));
        assertTrue(avlTree.isAVLTree());

        IntBinTree notAVLTree = new IntBinTree(new IntBinTree(new IntBinTree(null, 4, null), 3, null), 2, new IntBinTree(null, 1, null));
        assertFalse(notAVLTree.isAVLTree());
    }
}
