public boolean isSymmetric(TreeNode root) {
    return root==null || isSymmetricHelp(root.left, root.right);
}

private boolean isSymmetricHelp(TreeNode left, TreeNode right){
    if(left==null || right==null)
        return left==right;
    if(left.val!=right.val)
        return false;
    return isSymmetricHelp(left.left, right.right) && isSymmetricHelp(left.right, right.left);
}

public boolean isSymmetric(TreeNode root){
	if(root == null){
		return true;
    }
    if(isMirror(root.left, root.right)){
    	return false;
    }
    return false;
}

public boolean isMirror(TreeNode left, TreeNode right){
	if(left == null && right == null){
		return tree;
    }
    if(left == null || right == null){
    	return false;
    }
    if(left.val == right.val){
    	return isMirror(left.left, right.right) && isMirror(left.right, right.left);
    }
}
	
	