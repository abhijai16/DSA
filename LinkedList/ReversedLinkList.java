package LinkedList;

public class ReversedLinkList {
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

        Basic.printList(head);//without reversing

        head = reversedLinkedList(head);
        Basic.printList(head);
    }

    //* reversing a linked list. */
    static ListNode reversedLinkedList(ListNode head){
        ListNode prev = null;
        ListNode curr = head;

        while(curr!=null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
