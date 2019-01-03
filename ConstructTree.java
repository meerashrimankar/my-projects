package trees;

public class ConstructTree {
	public static void main(String[] args) {
		int[] preOrder = new int[]{3,9,20,15,7};
		int[] inOrder = new int[]{9,3,15,20,7};
		Node root = null;
		root.data = preOrder[0];
		Node next = null;
		for(int i=0; i < preOrder.length; i++) {
			next.data = preOrder[i];
			for(int j = 0;j<inOrder.length;j++){
				if(preOrder[i-1] == inOrder[j]){
					boolean flag = false;
					for(int k = 0;k<j-1;j++){
						if(preOrder[i] == inOrder[k]){
							root.left = next;
							flag = true;
							break;
						}
					}
					if(!flag){
						root.right = next;
					}
				}
			}
		}
	}
	public static void part(int start , int end, Node root, Node next, int[] inOrder) {
		for(int j = start;j<end;j++){
			if(root.data == inOrder[j]){
				boolean flag = false;
				for(int k = 0;k<j-1;j++){
					if(preOrder[i] == inOrder[k]){
						root.left = next;
						flag = true;
						break;
					}
				}
				if(!flag){
					root.right = next;
				}
			}
		}
	}
}
