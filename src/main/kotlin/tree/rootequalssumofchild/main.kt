package tree.rootequalssumofchild

import tree.TreeNode

fun main() {

    /**
     * Input: root = [10,4,6]
     * Output: true
     * Explanation: The values of the root, its left child, and its right child are 10, 4, and 6, respectively.
     * 10 is equal to 4 + 6, so we return true.
     *
     * Input: root = [5,3,1]
     * Output: false
     * Explanation: The values of the root, its left child, and its right child are 5, 3, and 1, respectively.
     * 5 is not equal to 3 + 1, so we return false.
     *
     */

    val input1 = TreeNode(10).apply {
        left = TreeNode(4)
        right = TreeNode(6)
    }
    val outputActual = checkTree(input1)
    println("OUTPUT: $outputActual")

}

fun checkTree(root: TreeNode?): Boolean {
    return root!!.`val` == (root.left!!.`val` + root.right!!.`val`)
}