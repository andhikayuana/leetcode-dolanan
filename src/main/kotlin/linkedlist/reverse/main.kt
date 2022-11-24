package linkedlist.reverse

import linkedlist.ListNode
import java.util.*

fun main() {

    /**
     * Input: head = [1,2,3,4,5]
     * Output: [5,4,3,2,1]
     *
     * Input: head = [1,2]
     * Output: [2,1]
     *
     * Input: head = []
     * Output: []
     */

    val input1 = ListNode(1).apply {
        next = ListNode(2).apply {
            next = ListNode(3).apply {
                next = ListNode(4).apply {
                    next = ListNode(5)
                }
            }
        }
    }

    println(input1)
    val output1 = reverseList(input1)
    println(output1)
}

fun reverseList(head: ListNode?): ListNode? {

    if (head == null) return head

    var tmp = head
    var next: ListNode? = null
    var prev: ListNode? = null

    while (tmp != null) {
        next = tmp.next
        tmp.next = prev
        prev = tmp
        tmp = next
    }

    return prev
}
