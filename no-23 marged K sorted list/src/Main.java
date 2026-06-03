import java.util.PriorityQueue;

class ListNode {
    int val;
    ListNode next ;
    ListNode (int val) {
        this.val = val ;

    }
}
class Solution {
    public ListNode mergedKLists(ListNode [] lists) {
        PriorityQueue<ListNode> minHeap = new PriorityQueue<>((a,b)-> a.val - b.val);

        for (ListNode node : lists){
             if ( node != null ){
                 minHeap.offer( node);

             }
        }
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while (!minHeap.isEmpty()) {
            ListNode smallest = minHeap.poll();

            tail.next = smallest;
            tail = tail.next;
            if (smallest.next != null){
            minHeap.offer(smallest.next);
            }

        }

        return  dummy.next;
    }

}


public class Main {
    static ListNode createList(int[] arr) {
        if (arr.length == 0) return null;

        ListNode head = new ListNode(arr[0]);
        ListNode temp = head;

        for (int i = 1; i < arr.length; i++) {
            temp.next = new ListNode(arr[i]);
            temp = temp.next;
        }

        return head;
    }
    static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 12, 13, 14, 17, 19};
        int[] arr2 = {1, 3, 14, 22, 23, 26};
        int[] arr3 = {1, 5, 11, 22, 24, 30};

        ListNode list1 = createList(arr1);
        ListNode list2 = createList(arr2);
        ListNode list3 = createList(arr3);
        ListNode [] arr = {list1,list2,list3};

        printList(list1);
        printList(list2);


        System.out.print("Merged k sorted List: ");
        Solution ss = new Solution();
        ListNode merged= ss.mergedKLists(arr);
        printList(merged);

    }

}