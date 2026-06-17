package LinkedList;

public class Insertion {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);

        head.next = node2;
        node2.next = node3;

        Basic.printList(head);//without change.

        head = insertAtBeginning(head, 0);
        Basic.printList(head);//inserting at the beginning.

        head = insertAtEnd(head, 4);
        Basic.printList(head);//inserting at the end;

        head = insertAtPosition(head, 5, 2);
        Basic.printList(head);//inserting at the middle;

    }

    //* Inserting at the beginning (head) */
    static ListNode insertAtBeginning(ListNode head, int val) {
        ListNode newNode = new ListNode(val);

        newNode.next = head;
        return newNode;
    }

    //* Inserting at the end with 2 cases. */
    // 1. If the list is empty , newNode becomes head.
    // 2. If the list is not empty, traverse to the last node and then link the newNode.

    static ListNode insertAtEnd(ListNode head, int val) {
        ListNode curr = head;
        ListNode newNode = new ListNode(val);
        if(head == null){
            return newNode;
        }

        while(curr.next!=null){
            curr = curr.next;
        }
        curr.next = newNode;
        return head;  //why we are return head and not curr because they both were referencing the same value in the heap so changes occurs in both.
    }

    //* Inserting at a position. */
    static ListNode insertAtPosition(ListNode head, int val, int pos) {
        ListNode newNode = new ListNode(val);
        if(pos == 0){
            newNode.next = head;
            return newNode;
        }
        ListNode curr = head;
        for(int i=0; i<pos-1; i++){
            curr = curr.next;
        }
        newNode.next = curr.next;
        curr.next = newNode;
        return head;
    }
}
