import java.util.*;

class ProbThree {
	class TreeNode {
		public int p;
		public int q;
		public Character operation;
		public TreeNode parent;
		public TreeNode left;
		public TreeNode right;

		public TreeNode(int p, int q) {
			this.p = p;
			this.q = q;
		}

		public void setLeft(TreeNode left) {
			left.parent = this;
			left.operation = 'L';
			this.left = left;
		}

		public void setRight(TreeNode right) {
			right.parent = this;
			right.operation = 'R';
			this.right = right;

		}

		public boolean equals (Integer n) {
			if (this.p == n || this.q == n) {
				return true;
			}
			return false;
		}
	}

	public boolean isOverloaded(long n) {
		if (n > Integer.MAX_VALUE || n < Integer.MIN_VALUE) {
			return true;
		}
		return false;
	}

	public String solution(int n) {
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		int p = 0, q = 1;
		TreeNode root = new TreeNode(p, q);
		queue.add(root);
		TreeNode target = null;
		while (queue.size() > 0) {
			TreeNode node = queue.remove();
			long l = 2 * node.p - node.q;
			long r = 2 * node.q - node.p;
			if (!this.isOverloaded(l)) {
				TreeNode left = new TreeNode((int) l, node.q);
				node.setLeft(left);
				if (left.equals(n)) {
					target = left;
					break;
				} else {
					queue.add(left);
				}
			}
			if (!this.isOverloaded(r)) {
				TreeNode right = new TreeNode(node.p, (int) r);
				node.setRight(right);
				if (right.equals(n)) {
					target = right;
					break;
				} else {
					queue.add(right);
				}
			}
		}
		if (target == null) {
			return "IMPOSSIBLE";		
		}
		StringBuilder builder = new StringBuilder();
		while (target.parent != null) {
			if (target.operation != null) {
				builder.append(target.operation);
			}
			target = target.parent;
		}
		return builder.toString();
	}

	public static void main(String args[]) {
		int n = Integer.parseInt(args[0]);
		ProbThree probThree = new ProbThree();
		String str = probThree.solution(n);
		System.out.println(str);
	}
}
