package trees;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelTraversalDFS {

	public static void main(String[] args) {
		SimpleTree st = new SimpleTree();
		Node root = st.getTreeRoot();
		LevelOrderBfs bfs = new LevelOrderBfs();
		System.out.println(bfs.levelOrderBottom(root));
	}

	public List<List<Integer>> levelOrderBottom(Node root) {
		Queue<Node> queue = new LinkedList<Node>();
		List<List<Integer>> wrapList = new LinkedList<List<Integer>>();

		if (root == null)
			return wrapList;

		queue.offer(root);
		while (!queue.isEmpty()) {
			int levelNum = queue.size();
			List<Integer> subList = new LinkedList<Integer>();
			for (int i = 0; i < levelNum; i++) {
				if (queue.peek().left != null)
					queue.offer(queue.peek().left);
				if (queue.peek().right != null)
					queue.offer(queue.peek().right);
				subList.add(queue.poll().data);
			}
			wrapList.add(0, subList);
		}
		return wrapList;
	}

}
