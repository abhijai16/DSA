package LinkedList;

public class RemoveDuplicates{
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(3);

        head.next = node2;
        node2.next = node3;
        node3.next = node4;

        head = deleteDuplicates(head);
        Basic.printList(head);
    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = head;

        if(head==null || head.next==null){
            return head;
        }

        while(dummy.next!=null){
            if(dummy.val==dummy.next.val){
                dummy.next = dummy.next.next;
            }
            else{
                dummy = dummy.next;
            }
        }
        return head;
    }
}

