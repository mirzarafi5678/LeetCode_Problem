class 1_two_sum.src.1_two_sum.valid_soduku.no_23_marged_K_sorted_list.Solution:
    def swapPairs(self, head):
        dummy = no_23_marged_K_sorted_list.ListNode(0)
        dummy.next = head

        curr = dummy

        while curr.next and curr.next.next:
            first = curr.next
            second = first.next


            first.next = second.next
            second.next = first
            curr.next = second


            curr = first

        return dummy.next