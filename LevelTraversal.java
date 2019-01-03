package trees;

import java.util.ArrayList;
import java.util.List;

public class LevelTraversal {
	public static void main(String[] args) {
		SimpleTree sm = new SimpleTree();
		Node root = sm.getTreeRoot();
		System.out.println(levelOrderBottom(root));
	}

	public static List<List<Integer>> levelOrderBottom(Node root) {
		List<List<Integer>> mainList = new ArrayList<>();
		List<Node> list1 = new ArrayList();
		list1.add(root);
		List<Node> list3 = new ArrayList();
		if (list1.size() > 0) {
			for (int i = 0; i < list1.size(); i++) {
				System.out.println(i);
				List<Integer> list2 = new ArrayList();
				// if (mainList.size() == 0) {
				// list2.add(root.data);
				// }
				System.out.println("list2::" + list2);
				root = list1.get(i);
				System.out.println(root);
				if (root.left != null) {
					list3.add(root.left);
					list2.add(root.left.data);
				}
				System.out.println("list2::" + list3);
				System.out.println("list3::" + list2);
				if (root.right != null) {
					list3.add(root.right);
					list2.add(root.right.data);
				}
				System.out.println("list2::" + list3);
				System.out.println("list3::" + list2);
				if (i == list1.size() - 1) {
					list1 = list3;
					mainList.add(list2);
				}
				System.out.println("list1::" + list3);
				System.out.println("main list::" + mainList);
			}
		}
		return mainList;
	}
}