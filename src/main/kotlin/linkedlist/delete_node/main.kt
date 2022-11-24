package linkedlist.delete_node

import linkedlist.ListNode

fun main() {
    /**
     * Input: head = [4,5,1,9], node = 5
     * Output: [4,1,9]
     *
     * Input: head = [4,5,1,9], node = 1
     * Output: [4,5,9]
     */

    val head1 = ListNode(4).apply {
        next = ListNode(5).apply {
            next = ListNode(1).apply {
                next = ListNode(9)
            }
        }
    }
    val node1 = 5
    //todo
}

fun deleteNode(node: ListNode?) {

    node?.apply {
        value = next!!.value
        next = next!!.next
    }
}
