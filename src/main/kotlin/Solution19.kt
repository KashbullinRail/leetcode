//class Solution19 {
//    fun reverseList(head: ListNode?): ListNode? {
//        var current : ListNode? = head
//        var previous: ListNode? = null
//        do {
//            val temp = current?.next
//            current?.next = previous
//            previous = current
//            current = temp
//        } while (current != null)
//        return previous
//    }
//}