package tree.invertbinarytree

import tree.TreeNode

fun main() {

    /**
     * https://leetcode.com/problems/invert-binary-tree/
     *
     * Input: root = [4,2,7,1,3,6,9]
     * Output: [4,7,2,9,6,3,1]
     *
     * Input: root = [2,1,3]
     * Output: [2,3,1]
     *
     * Input: root = []
     * Output: []
     */

    val input1 = TreeNode(2).apply {
        left = TreeNode(1)
        right = TreeNode(3)
    }

    val outputActual = invertTree(input1)

    println("OUTPUT: ${outputActual.toString()}")

}

fun invertTree(root: TreeNode?): TreeNode? {
    if (root == null) return root

    with(root) {
        val temp = left
        left = invertTree(right)
        right = invertTree(temp)
    }

    return root
}

