package InterviewPracticeProblem;
import java.util.*;

public class LRUCache {
    class Node {
        int key;
        int value;
        Node prev;
        Node next;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }


    private int capacity;
    private Map<Integer, Node> cache;
    private Node head;
    private Node tail;


    public LRUCache(int capacity) {
        this.capacity = capacity;
        cache = new HashMap<>();

        head = new Node(-1,-1);
        tail = new Node (-1, -1);
        head.next = tail;
        tail.prev = head;
    }

}

