package LinkedList;
import java.util.HashMap;

class LRUCache {
    private int capacity;
    private HashMap<Integer, DNode> map;    
    private DoublyLinkedList dll;         
    
    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.map = new HashMap<>();
        this.dll = new DoublyLinkedList();
    }
    
    public int get(int key) {
        if(!map.containsKey(key)){
            return -1;
        }   
        DNode node = map.get(key);
        dll.moveToTail(node);
        return node.val; 
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            DNode node = map.get(key);
            node.val = value;
            dll.moveToTail(node);
            
        }
        else{
            if(map.size() == capacity) {
                DNode lru = dll.head.next;
                dll.removeNode(lru);
                map.remove(lru.key);
            }

            DNode newNode = new DNode(key, value);
            dll.addToTail(newNode);
            map.put(key, newNode);
        }
    }

    public int peek(int key) {
        if(!map.containsKey(key)){
            return -1;
        }   
        DNode node = map.get(key);
        return node.val; 
    }
}