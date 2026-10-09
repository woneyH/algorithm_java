class Solution {
    List<Integer> result = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        inorder(root);
        return result;
    }

    public void inorder(TreeNode root) {
        if (root != null) {
            inorder(root.left);
            result.add(root.val);
            inorder(root.right);
        }
    }
}
