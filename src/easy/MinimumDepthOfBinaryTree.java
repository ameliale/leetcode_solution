package easy;

public class MinimumDepthOfBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int val = 2;
		TreeNode left = new TreeNode(1);
		TreeNode right = new TreeNode(3);
		TreeNode root = new TreeNode(val, left, right);
		
		System.out.println(minDepth(root));
	}
	
	public static int minDepth(TreeNode root) {
		int minDepth = Integer.MAX_VALUE;
		
		if(root == null)
		{
			return 0;
		}
		if(root.left == null && root.right == null)
		{
			return 1;
		}
		if(root.left != null)
		{
			minDepth = Math.min(minDepth, minDepth(root.left));
		}
		if(root.right != null)
		{
			minDepth = Math.min(minDepth, minDepth(root.right));
		}
		
		return minDepth + 1;
	}

}
