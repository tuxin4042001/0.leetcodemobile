public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    List<List<Integer>> rlts = new ArrayList<List<Integer>>();
    if (root == null) {
        return rlts;
    } 
    
    Queue<TreeNode> que = new LinkedList<TreeNode>();
    que.add(root);
    boolean isForward = true;
    int lvlNumNodes = 1;
    LinkedList<Integer> rlt = new LinkedList<Integer>();
    
    while (!que.isEmpty()) {
        TreeNode node = que.poll();
        
        // From left to right
        if (isForward) {
            rlt.add(node.val);
        } else {
            // From right to left
            rlt.addFirst(node.val);
        }
        
        if (node.left != null) {
            que.add(node.left);
        }
        
        if (node.right != null) {
            que.add(node.right);
        }
        
        --lvlNumNodes;
        // New level
        if (lvlNumNodes == 0) {
            rlts.add(rlt);
            lvlNumNodes = que.size();
            
            if (lvlNumNodes != 0) {
                rlt = new LinkedList<Integer>();
            }
            
            // Change direction
            isForward = !isForward;
        }
    }
    
    return rlts;
}
2 years ago reply quote 
0
M monaziyi 
Reputation:  277
I tried C++ version , but I got :

10 / 33 test cases passed.
Any