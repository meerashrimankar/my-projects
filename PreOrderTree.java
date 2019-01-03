package trees;

public class PreOrderTree {
	public static void main(String[] args) {
		SimpleTree sm = new SimpleTree();
		Node root = sm.getTreeRoot();
		System.out.println("inOrder: ");
		inOrder(root);
		System.out.println("\npreOrder: ");
		preOrder(root);
		System.out.println("\npostOrder: ");
		postOrder(root);
	}

	public static void inOrder(Node root) {
		if (root != null) {
			inOrder(root.left);
			System.out.print(root.data + "\t");
			inOrder(root.right);
		}
	}
	public static void preOrder(Node root) {
		if (root != null) {
			System.out.print(root.data + "\t");
			preOrder(root.left);
			preOrder(root.right);
		}
	}
	public static void postOrder(Node root) {
		if (root != null) {
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.data + "\t");
		}
	}
}
