import javax.swing.plaf.metal.MetalButtonUI;

class ListNode {
    public  int val ;
    public  ListNode next ;

    public ListNode(int val) {
        this.val = val;
    }
}

class Solution{
    int Size (ListNode node ){
        int count = 0;
        while (node != null){
            count++;
            node=node.next;
        }
        return count;
    }

    ListNode KthNode (ListNode head , int num){
        int size= Size(head);
        if (num > size) return null;
        if (num <=0) return null;

        ListNode kthNode =null;
        ListNode current =  head ;

        int i = 0;
        while (current != null &&  i < num ) {
            kthNode = current;
            current = current.next;
            i++;
        }
        return kthNode;
    }

    ListNode ReverseNode( ListNode node   ){
       ListNode prev = null;
       ListNode nextNode = node;
       ListNode temp ;
       while (nextNode != null){

           temp = nextNode;
           nextNode = nextNode.next;
           temp.next= prev;

           prev = temp;


       }
       return prev;
    }
    public ListNode reverseKGroup(ListNode head, int k) {

        ListNode temp = head ;
        ListNode prev=null;
        ListNode nextNode = null;
        ListNode kthNode = null;
        ListNode groupReverse =null;
        ListNode newHead =null ;

        while (temp != null){
            kthNode = KthNode(temp, k);



            if (kthNode == null) {
                if (prev==null){
                    prev=temp;}
                else{
                prev.next=temp;

                }
                break;
            };

            nextNode = kthNode.next;
            kthNode.next = null;

             groupReverse = ReverseNode(temp);


            if (prev != null){
                 prev.next=groupReverse;

             }
             if (head == temp) newHead =kthNode;

             prev = temp;
             temp= nextNode;




        }



        return newHead;


    }


}




class Mian {

    public static void main(String[] args) {

    }
}