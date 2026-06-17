package LinkedList;

public class Deletion {
    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(3);
        ListNode node5 = new ListNode(4);

        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        
        Basic.printList(head);//without change.

        head = deleteFromBeginning(head);
        Basic.printList(head);//deleting from the beginning.

        head = deleteFromEnd(head);
        Basic.printList(head);//deleting from the end.

        head = deleteAtPosition(head, 1);
        Basic.printList(head);
    } 

    //* Delete from the beginning of the list. */
    static ListNode deleteFromBeginning(ListNode head) {
        if(head==null){
            return head;
        }
        return head.next;
    }

    //* Delete from the end of the list. */
    static ListNode deleteFromEnd(ListNode head) {
        if(head==null || head.next==null){
            return null;
        }

        ListNode curr = head;
        while(curr.next.next!=null){
            curr = curr.next;
        }
        curr.next = null;
        return head;
    }

    //* Delete from the postition. */
    static ListNode deleteAtPosition(ListNode head, int pos) {
        if(head == null){ 
            return null;
        }
        if(pos == 0) {
            return head.next;
        }
        
        ListNode curr = head;
        for (int i = 0; i < pos-1; i++) {
            curr = curr.next;
        }
        curr.next = curr.next.next;
        return head;
    }
}
