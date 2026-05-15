class ListNode {
    int val;
    ListNode next= null;



    ListNode(int val){
        this.val = val;


    }
}
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head=null;
        ListNode current= null;

        int carry=0;
        while (l1!=null || l2!=null || carry !=0){
            int sum=carry ;
            if (l1!=null){
                sum += l1.val;
                l1=l1.next;
            }
            if (l2 != null){
                sum +=l2.val;
                l2=l2.next;
            }

            int digit = sum % 10;
            ListNode newnode= new ListNode(digit);

            if   (head == null) {
                head= newnode;
                current=newnode;
            }

            else{
                current.next=newnode;
                current = newnode;
            }
            carry = sum/10;


        }

    return head;

    }
}

class Main {
    public static ListNode createList(int num){
        ListNode head=null;
        ListNode current= null;
        while (  num >0){
              int digit = num % 10;
              num = num /10;
              ListNode newnode=new ListNode (digit);

              if (head == null){
                  head= newnode;
                  current= newnode;
              }
              else {
                  current.next = newnode;
                  current= newnode;
              }
        }

        return  head;
    }
    static  void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
                 System.out.print(current.val);
                 if (current.next != null){
                 System.out.print("->");}
                 current = current.next;
        }


}

    public static void main(String[] args) {
          ListNode head =createList(345);
          printList(head);


    }

}