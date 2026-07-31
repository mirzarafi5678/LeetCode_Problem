import javax.swing.event.ListDataEvent;

class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }
    void insert (int value){
        ListNode current = this;
        while (current.next != null ){
            current = current.next;
        }
        current.next = new ListNode (value);
    }
}
class Solution {
    public ListNode removeNthFromEnd(ListNode head , int n){
        int length = 0 ;
        ListNode current= head ;

        while ( current != null){
            length ++;
            current = current.next;

        }
        if (length == n) {

            return head.next;
        }
        current = head;
        for (int i = 1; i < length-n; i++) {
            current = current.next;
        }
        ListNode nextNode = current.next;
        current.next= nextNode.next;

        return head;
    }

}


public class Main{
    static void printList(ListNode head ){
        ListNode current = head ;
        while (current !=null ){
            System.out.print(current.val +" ");
            current = current.next;
        }
        System.out.println();
    }
    static ListNode build (int[] arr){
        ListNode head = new ListNode(arr[0]);
        ListNode current = head ;
        for (int i = 1; i < arr.length; i++){
            current.next = new ListNode(arr[i]);
            current = current.next;
        }
        return  head ;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.insert(2);
        head.insert(3);
        head.insert(4);
        head.insert(5);

        printList(head);
        ListNode head1 = build(new int [] {3,4,5,6,7,8});
        printList(head1);

        Solution ss = new Solution();
        printList(ss.removeNthFromEnd(head, 2));
        printList(ss.removeNthFromEnd(head1,5));
    }




}
