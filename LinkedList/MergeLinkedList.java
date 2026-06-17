package LinkedList;

public class MergeLinkedList {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(4);

        list1.next = node2;
        node2.next = node3;

        System.out.print("List1: ");
        Basic.printList(list1);


        ListNode list2 = new ListNode(1);
        ListNode node4 = new ListNode(3);
        ListNode node5 = new ListNode(5);

        list2.next = node4;
        node4.next = node5;

        System.out.print("List2: ");
        Basic.printList(list2);


        ListNode merge = mergeLinkedList(list1, list2);
        System.out.print("Merged: ");
        Basic.printList(merge);
    }

    static ListNode mergeLinkedList(ListNode list1, ListNode list2){
        ListNode ans = new ListNode(0);
        ListNode tail = ans;

        while(list1!=null && list2!=null){
            if(list1.val>list2.val){
                tail.next = list2;
                list2 = list2.next;
            }
            else{
                tail.next = list1;
                list1 = list1.next;
            }
            tail = tail.next;
        }
        if(list1!=null){
            tail.next = list1;
        }
        else{
            tail.next = list2;
        }
        
        return ans.next;
    }
}
