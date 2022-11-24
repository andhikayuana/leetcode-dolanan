package linkedlist.palindrome_linkedlist

import linkedlist.ListNode
import java.util.*

fun main() {
    /**
     * example 1
     * Input: head = [1,2,2,1]
     * Output: true
     *
     * example 2
     * Input: head = [1,2]
     * Output: false
     */

    val input = ListNode(1).apply {
        next = ListNode(2).apply {
            next = ListNode(2).apply {
                next = ListNode(1)
            }
        }
    }

    println("INPUT: ${input}")
    println("OUTPUT: ${isPalindrome(input)}")

    val input2 = ListNode(1).apply {
        next = ListNode(2)
    }

    println("INPUT: ${input2}")
    println("OUTPUT: ${isPalindrome(input2)}")

}

fun isPalindrome(head: ListNode?): Boolean {

    var temp = head
    var result = true

    val stack = Stack<Int>()

    while (temp != null) {
        stack.push(temp.value)
        temp = temp.next
    }

    temp = head
    while (temp != null) {
        val item = stack.pop()
        if (temp.value == item) {
            result = true
        } else {
            result = false
            break
        }
        temp = temp.next

    }

    return result
}