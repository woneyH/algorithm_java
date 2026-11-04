class Solution {
    static int max;
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        max = 1;
        maxDepth(root,1);
        return max;
    }
    static void maxDepth(TreeNode root, int depth) {
        if(depth> max) max = depth;
        if(root.left!=null) {
            maxDepth(root.left, depth+1);
        }
        if(root.right!=null) {
            maxDepth(root.right, depth+1);
        }
    }
}
