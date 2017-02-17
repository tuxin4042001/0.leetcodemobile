//completed balanced binary tree
public boolean isBalanced(TreeNode root){
	if(root == null) return true;
	if(root.left == null && root.right == null) return true;
	if(root.left == null || root.right == null) return false;
	return isBalanced(root.left) && isBalanced(root.right);
}

//calculate the binary tree height
public int height(TreeNode root){
	if(root == null) return 0;
	if(root.left == null && root.right == null) return 1;
	if(root.left != null || root.right != null) return 2;
	return 1 + Math.max(height(root.left), height(root.right));
}

//Answer
public boolean isBalanced(TreeNode root) {
    if(root==null){
        return true;
    }
    return height(root)!=-1;
    
}
public int height(TreeNode node){
    if(node==null){
        return 0;
    }
    int lH=height(node.left);
    if(lH==-1){
        return -1;
    }
    int rH=height(node.right);
    if(rH==-1){
        return -1;
    }
    if(lH-rH<-1 || lH-rH>1){
        return -1;
    }
    return Math.max(lH,rH)+1;
}

//Answer

public class Solution {
    public boolean isBalanced(TreeNode root) {
        return getDepth(root)!=-1;
    }
    
    public int getDepth(TreeNode root){
        if(root==null){
            return 0;
        }
        int left = getDepth(root.left);
        if(left!=-1){
            int right = getDepth(root.right);
            if(right!=-1){
                return Math.abs(left-right)<=1?1+Math.max(left,right):-1;
            }
        }
        return -1;
    }
}