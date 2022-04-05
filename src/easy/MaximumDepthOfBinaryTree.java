package easy;

public class MaximumDepthOfBinaryTree {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int val = 2;
		TreeNode left = new TreeNode(1);
		TreeNode right = new TreeNode(3);
		TreeNode root = new TreeNode(val, left, right);
		
		System.out.println(maxDepth(root));
	}
	
	public static int maxDepth(TreeNode root)
	{
		int counterLeft = 0;
		int counterRight = 0;
		
		if(root == null)
		{
			return 0;
		}
		else
		{
			counterLeft = counterLeft + 1 + maxDepth(root.left);
			counterRight = counterRight + 1 + maxDepth(root.right);
		}
		
		return Math.max(counterLeft, counterRight);
	}

}
