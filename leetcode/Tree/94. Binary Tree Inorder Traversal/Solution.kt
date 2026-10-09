/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    var result: MutableList<Int> = mutableListOf()
    fun inorderTraversal(root: TreeNode?): List<Int> {
        if(root != null) {
            inorderTraversal(root.left)
            result.add(root.`val`)
            inorderTraversal(root.right)
        }
    
        return result
    }
}
