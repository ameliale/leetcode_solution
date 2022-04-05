package easy;

public class SymmetricTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int val = 2;
		TreeNode left = new TreeNode(3);
		TreeNode right = new TreeNode(3);
		TreeNode root = new TreeNode(val, left, right);
		
		System.out.println(isSymmetric(root));
	}
	
	public static boolean isSymmetric(TreeNode root) {
		
		return isMirror(root, root);
	}
	
	public static boolean isMirror(TreeNode r1, TreeNode r2)
	{
		if(r1 == null && r2 == null)
		{
			return true;
		}
		else if(r1 == null || r2 == null)
		{
			return false;
		}
		else
		{
			return (r1.val == r2.val) & isMirror(r1.left, r2.right) && isMirror(r1.right, r2.left);  
		}
	}

}
