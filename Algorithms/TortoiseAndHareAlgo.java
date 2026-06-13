package Algorithms;

//* Also known as slow and fast technique. */

class ListNode{
    int val;
    ListNode next;

    ListNode(int val){
        this.val = val;
        this.next = null;
    }
}

public class TortoiseAndHareAlgo {
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

        printList(head);

        ListNode curr = middleNode(head);
        System.out.println(curr.val);
    }

    static ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    static void printList(ListNode head){
        ListNode curr = head;

        while (curr != null) {
            System.out.print(curr.val + " → ");
            curr = curr.next;
        }
        System.out.println("null");
    }
}
