public class IntNode {

	private Integer content;
	private IntNode left;
	private IntNode right;

	public IntNode(Integer content) {
		this.content = content;
		left = null;
		right = null;
	}

	// getter and setter ...

	public Integer getContent() {
		return content;
	}

	public void setContent(Integer content) {
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
