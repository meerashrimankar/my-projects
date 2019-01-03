package trees;

public class SimpleTree {
	public Node getTreeRoot(){
		Node[] a = new Node[10];
		a[0] = new Node(1);
		a[1] = new Node(2);
		a[2] = new Node(3);
		a[3] = new Node(4);
		a[4] = new Node(5);
		a[0].left = a[1];
		a[0].right = a[2];
		a[1].left = a[3];
		a[1].right = a[4];
		return a[0];
	}
}
