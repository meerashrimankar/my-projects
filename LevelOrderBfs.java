package trees;

import java.util.List;
import java.util.LinkedList;

public class LevelOrderBfs {

	public static void main(String[] args) {
		SimpleTree st = new SimpleTree();
		Node root = st.getTreeRoot();
		LevelOrderBfs bfs = new LevelOrderBfs();
		System.out.println(bfs.levelOrderBottom(root));
	}
	public List<List<Integer>> levelOrderBottom(Node root) {
		List<List<Integer>> wrapList = new LinkedList<List<Integer>>();
		levelMaker(wrapList, root, 0);
		return wrapList;
	}

	public void levelMaker(List<List<Integer>> list, Node root, int level) {
		if (root == null)
			return;
		if (level >= list.size()) {
			list.add(0, new LinkedList<Integer>());
		}
		levelMaker(list, root.left, level + 1);
		levelMaker(list, root.right, level + 1);
		list.get(list.size() - level - 1).add(root.data);
	}
}