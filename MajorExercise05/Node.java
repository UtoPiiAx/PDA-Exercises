public class Node {

	private String content;
	private Node left;
	private Node right;

	public Node(String content) {
		this.content = content;
		left = null;
		right = null;
	}
	
	// getter and setter ...

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}

}
