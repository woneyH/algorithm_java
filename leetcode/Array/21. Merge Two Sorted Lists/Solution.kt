class Solution {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        var header: ListNode = ListNode(0)
        var tail: ListNode? = header
        var list1: ListNode? = list1
        var list2: ListNode? = list2

        while(list1!=null && list2!=null){
            if(list1.`val` <= list2.`val`) {
                tail?.next = list1
                list1 = list1.next
            }else {
                tail?.next = list2
                list2 = list2.next
            }
            tail = tail?.next
        }

        if(list1!=null) {
            tail?.next = list1
        }else {
            tail?.next = list2
        }
    
        return header.next
    }
}
