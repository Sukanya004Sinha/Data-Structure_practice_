package LinkedList;

import java.util.NoSuchElementException;

public class DoublyLinkedList {
    Node head;
    private int size = 0;

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.printList();
//        list.insertLast(40);
//        list.printList();
//        list.insertAtIndex(1, 50);
//        list.printList();
//        System.out.println("get first " + list.getFirst());
//        System.out.println("get Last " + list.getLast());
        System.out.println("get At Index " + list.getAtindex(1));
        System.out.println("search element " + list.search(80));

    }

    private void insertFirst(int data) {
        Node newNode = new Node(data);
        newNode.prev = null;
        if (head == null) {
            newNode.next = null;

        } else {
            newNode.next = head;
            head.prev = newNode;
        }
        head = newNode;
        size++;

    }

    private void insertAtIndex(int index, int data) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        } else if (size == 0) {
            insertFirst(data);
        } else if (index == size) {
            insertLast(data);
        } else {
            Node newNode = new Node(data);
            Node curr = head;


            for (int i = 0; i < index - 1; i++) {
                curr = curr.next;
            }
            newNode.prev = curr;
            newNode.next = curr.next;
            curr.next.prev = newNode;
            curr.next = newNode;
        }
        size++;


    }

    private void insertLast(int data) {
        Node newNode = new Node(data);
        newNode.prev = null;
        if (head == null) {
            newNode.next = null;
            head = newNode;
        } else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
            newNode.next = null;
            newNode.prev = curr;
        }
        size++;
    }

    private int getFirst() {
        if (head == null) {
            throw new NoSuchElementException("List is empty");
        }
        return head.data;
    }

    private int getLast() {
        if (head == null) {
            throw new NoSuchElementException("List is empty");
        } else if (size == 1) {
            return head.data;
        } else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            return curr.data;
        }
    }

    private int getAtindex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index not found" + +index);

        } else if (head == null) {
            throw new NoSuchElementException("List is empty");
        } else {
            Node curr = head;
            for (int i = 0; i < index; i++) {
                curr = curr.next;
            }
            return curr.data;

        }

    }
    private boolean search(int key){
        Node curr = head;
        while (curr.next!=null){
            if(key==curr.data){
                return true;
            }
            curr=curr.next;

        }
        return false;
    }

    private void printList() {
        Node curr = head;
        if (curr == null) {
            System.out.println("List is empty");
            return;
        }

        while (curr != null) {
            System.out.println(curr.data + "---->");
            curr = curr.next;

        }
        System.out.println("null");
    }

    class Node {
        private final int data;
        private Node prev;
        private Node next;


        public Node(int data, Node prev, Node next) {
            this.data = data;
            this.prev = prev;
            this.next = next;
        }

        public Node(int data) {
            this.data = data;
        }
    }
}
