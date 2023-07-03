import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class IntBinTree {
	private IntNode root;
	
	public IntBinTree () { }
	
	public IntBinTree (int content) {
		this.root = new IntNode (content);
	}
	
	public IntBinTree(IntBinTree left, Integer content, IntBinTree right) {
		root = new IntNode(content);
		if (left != null) {
			root.setLeft(left.root);
		}
		if (root != null) {
			root.setRight(right.root);
		}
	}
	
	private IntBinTree(IntNode root) {
		this.root = root;
	}
	
	public boolean isEmpty() {
		return root == null;
	}
	
	public Integer getValue() {
		if (isEmpty ()) {
			return null; // error
		}
		return root.getContent();
	}
	
	public IntBinTree getLeft() {
		if (isEmpty()) {
			return null; // error
		}
		return new IntBinTree(root.getLeft());
	}
	
	public IntBinTree getRight() {
		if (this.isEmpty()) {
			return null; // error
		}
		return new IntBinTree(root.getRight());
	}
	
	public void setLeft(IntBinTree tree) {
		if ( this.isEmpty()) {
			return; // error
		}
		root.setLeft(tree.root);
	}
	
	public void setRight(IntBinTree tree) {
		if ( this.isEmpty()) {
			return; // error
		}
		root.setRight(tree.root);
	}
	
	
	// Aufgabe 1b
	public Integer[] inorder() {
        List<Integer> result = new ArrayList<>();
        inorder(root, result);
        return result.toArray(new Integer[0]);
    }
	
    private void inorder(IntNode node, List<Integer> result) {
        if (node == null) {
            return;
        }
        inorder(node.getLeft(), result);
        result.add(node.getContent());
        inorder(node.getRight(), result);
    }
    
    // Aufgabe 1c
    public static IntBinTree createTree(Integer[] values) {
        if (values.length == 0) {
            return new IntBinTree();
        }

        LinkedList<IntBinTree> queue = new LinkedList<>();
        IntBinTree root = new IntBinTree(values[0]);
        queue.add(root);

        for (int i = 1; i < values.length; i++) {
            IntBinTree current = queue.removeFirst();
            if (current.getLeft().isEmpty()) {
                current.setLeft(new IntBinTree(values[i]));
                queue.add(current.getLeft());
            } else if (current.getRight().isEmpty()) {
                current.setRight(new IntBinTree(values[i]));
                queue.add(current.getRight());
            }
        }
        return root;
    }
    
    // Aufgabe 1d
    public int countNodes() {
        return countNodes(root);
    }

    private int countNodes(IntNode node) {
        if (node == null) {
            return 0;
        }
        return 1 + countNodes(node.getLeft()) + countNodes(node.getRight());
    }

    public int countInnerNodes() {
        return countInnerNodes(root);
    }

    private int countInnerNodes(IntNode node) {
        if (node == null) {
            return 0;
        }
        if (node.getLeft() == null && node.getRight() == null) {
            return 0;
        }
        return 1 + countInnerNodes(node.getLeft()) + countInnerNodes(node.getRight());
    }

    public int countLeaves() {
        return countLeaves(root);
    }
    
    private int countLeaves(IntNode node) {
        if (node == null) {
            return 0;
        }
        if (node.getLeft() == null && node.getRight() == null) {
            return 1;
        }
        return countLeaves(node.getLeft()) + countLeaves(node.getRight());
    }
    
    public int getHeight() {
        return getHeight(root);
    }
    
    private int getHeight(IntNode node) {
        if (node == null) {
            return 0;
        }
        return 1 + Math.max(getHeight(node.getLeft()), getHeight(node.getRight()));
    }
    
    // Aufgabe 1e   
    public boolean isFull() {
        return isFull(root);
    }

    private boolean isFull(IntNode node) {
        if (node == null) {
            return false;
        }
        if (node.getLeft() == null || node.getRight() == null) {
            return false;
        }
        return isFull(node.getLeft()) && isFull(node.getRight());
    }

    public boolean isComplete() {
        if (root == null) {
            return true;
        }
        Queue<IntNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean flag = false;
        while (!queue.isEmpty()) {
            IntNode current = queue.poll();
            if (current.getLeft() == null && current.getRight() != null) {
                return false;
            }
            if (flag && (current.getLeft() != null || current.getRight() != null)) {
                return false;
            }
            if (current.getLeft() == null || current.getRight() == null) {
                flag = true;
            }
            if (current.getLeft() != null) {
                queue.offer(current.getLeft());
            }
            if (current.getRight() != null) {
                queue.offer(current.getRight());
            }
        }
        return true;
    }

    public boolean isPerfect() {
        return isPerfect(root, getHeight(root));
    }

    private boolean isPerfect(IntNode node, int height) {
        if (node == null) {
            return true;
        }
        if (getHeight(node.getLeft()) != height - 1 || getHeight(node.getRight()) != height - 1) {
            return false;
        }
        return isPerfect(node.getLeft(), height - 1) && isPerfect(node.getRight(), height - 1);
    }
}
