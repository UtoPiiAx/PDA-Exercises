
public class IntNode {
	private int content;
	private IntNode left;
	private IntNode right;
	
	// Konstruktor
	public IntNode (int content) {
		this.content = content;
		left = null;
		right = null;
	}
	
	// Getter und Setter
	public int getContent() {
		return content;
	}

	public void setContent(int content) {
		this.content = content;
	}

	public IntNode getLeft() {
		return left;
	}

	public void setLeft(IntNode left) {
		this.left = left;
	}

	public IntNode getRight() {
		return right;
	}

	public void setRight(IntNode right) {
		this.right = right;
	}
}
