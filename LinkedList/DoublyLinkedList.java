package LinkedList;

class DNode {
    int key, val;
    DNode prev, next;

    DNode(int key, int val) {
        this.key = key;
        this.val = val;
    }
}

public class DoublyLinkedList{
    DNode head, tail;
    
    DoublyLinkedList() {
        head = new DNode(0, 0);
        tail = new DNode(0, 0); 
        head.next = tail; 
        tail.prev = head; 
    }

    void removeNode(DNode node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    void addToTail(DNode node) {
        node.prev = tail.prev;
        node.next = tail;
        tail.prev.next = node;
        tail.prev = node;
    }

    void moveToTail(DNode node) {
        removeNode(node);
        addToTail(node);
    }
}

