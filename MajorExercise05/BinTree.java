public class BinTree {

	private Node root;

	public BinTree() { }

	public BinTree(String content) {
		this.root = new Node(content);
	}

	public BinTree(BinTree left, String content, BinTree right) {
		root = new Node(content);
		if (left != null) {
			root.setLeft(left.root);
		}
		if (right != null) {
			root.setRight(right.root);
		}
	}

	private BinTree(Node root) {
		this.root = root;
	}

	public boolean isEmpty() {
		return root == null;
	}

	public String getValue() {
		if (isEmpty()) {
			return null; // error
		}
		return root.getContent();
	}

	public BinTree getLeft() {
		if (isEmpty()) {
			return null; // error
		}
		return new BinTree(root.getLeft());
	}

	public void setLeft(BinTree tree) {
		if (isEmpty()) {
			return; // error
		}
		root.setLeft(tree.root);
	}

	public BinTree getRight() {
		if (this.isEmpty()) {
			return null; // error
		}
		return new BinTree(root.getRight());
	}

	public void setRight(BinTree tree) {
		if (this.isEmpty()) {
			return; // error
		}
		this.root.setRight(tree.root);
	}

	public void inorder() {
		if (!isEmpty()) {
			getLeft().inorder();
			System.out.print(getValue());
			getRight().inorder();
		}
	}

	public void preorder() {
		if (!isEmpty()) {
			System.out.print(getValue());
			getLeft().preorder();
			getRight().preorder();
		}
	}

	public void postorder() {
		if (!isEmpty()) {
			getLeft().postorder();
			getRight().postorder();
			System.out.print(getValue());
		}
	}

	public String postorderCalc() {
		String top = getValue();
		if (top.equals("+")) {
			String x = getLeft().postorderCalc();
			String y = getRight().postorderCalc();
			return Integer.toString(Integer.parseInt(x) + Integer.parseInt(y));
		} else if (top.equals("-")) {
			String x = getLeft().postorderCalc();
			String y = getRight().postorderCalc();
			return Integer.toString(Integer.parseInt(x) - Integer.parseInt(y));
		} else if (top.equals("*")) {
			String x = getLeft().postorderCalc();
			String y = getRight().postorderCalc();
			return Integer.toString(Integer.parseInt(x) * Integer.parseInt(y));
		} else if (top.equals("/")) {
			String x = getLeft().postorderCalc();
			String y = getRight().postorderCalc();
			return Integer.toString(Integer.parseInt(x) / Integer.parseInt(y));
		} else if (top.equals("%")) {
			String x = getLeft().postorderCalc();
			String y = getRight().postorderCalc();
			return Integer.toString(Integer.parseInt(x) % Integer.parseInt(y));
		} else {
			return top;
		}
	}

	public static void main(String[] args) {
		BinTree tree = new BinTree(new BinTree(new BinTree(new BinTree("3"), "+", new BinTree("4")), "*", new BinTree("12")), "/", new BinTree(new BinTree("8"), "-", new BinTree("5")));
		System.out.println(tree.postorderCalc()); // 28
	}
}
