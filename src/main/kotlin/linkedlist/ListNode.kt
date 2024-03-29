package linkedlist

class ListNode(var value: Int) {
    var next: ListNode? = null

    override fun toString(): String {
        return if (next != null) "$value -> ${next.toString()}" else "$value"
    }
}
