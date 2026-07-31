class no_23_marged_K_sorted_list.ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class 1_two_sum.src.1_two_sum.valid_soduku.no_23_marged_K_sorted_list.Solution:
    def removeNthFromEnd(self, head: no_23_marged_K_sorted_list.ListNode, n: int) -> no_23_marged_K_sorted_list.ListNode:

        length = 0
        current = head


        while current:
            length += 1
            current = current.next


        if length == n:
            return head.next


        current = head
        for _ in range(length - n - 1):
            current = current.next


        current.next = current.next.next

        return head