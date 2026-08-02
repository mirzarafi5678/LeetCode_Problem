class ListNode {
    int val;
    ListNode next ;
    ListNode (int val) {
        this.val = val ;

    }
}
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
         ListNode dummy =new  ListNode(0);
         ListNode current = dummy;

         while (list1 != null && list2 != null){
             if (list1.val <= list2.val){
                 current.next = list1;
                 list1=list1.next;

             }else {

                 current.next= list2;
                 list2 = list2.next;
             }
             current= current.next;

         }
         if (list1 != null){
             current.next = list1;
         }
         if (list2 != null){
             current.next = list2;
         }

         return dummy.next;

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

        ListNode list1 = createList(arr1);
        ListNode list2 = createList(arr2);

        System.out.print("List 1: ");
        printList(list1);

        System.out.print("List 2: ");
        printList(list2);

        Solution ss = new Solution();
        ListNode merged = ss.mergeTwoLists(list1, list2);
        System.out.print("Merged List: ");
        printList(merged);
    }
}