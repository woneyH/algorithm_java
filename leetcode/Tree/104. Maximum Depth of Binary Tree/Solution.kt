class Solution {
    fun maxDepth(root: TreeNode?): Int {
        if(root == null) return 0
        var left = maxDepth(root.left)
        var right = maxDepth(root.right)
        return 1+ max(left, right)
    }
}
