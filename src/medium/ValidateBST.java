package medium;


public class ValidateBST {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int val = 2;
		TreeNode left = new TreeNode(1);
		TreeNode right = new TreeNode(3);
		TreeNode root = new TreeNode(val, left, right);
		
		System.out.println(isValidBST(root));
	}
	
	public static boolean validate(TreeNode root, Integer low, Integer high)
    {
        if(root == null)
        {
            return true;
        }
        if((low != null && root.val <= low) || (high != null && root.val >= high))
        {
            return false;
        }
        
        return validate(root.right, root.val, high) && validate(root.left, low, root.val);
    }
    
    
    public static boolean isValidBST(TreeNode root) {
        
        return validate(root, null, null);
    }

}
