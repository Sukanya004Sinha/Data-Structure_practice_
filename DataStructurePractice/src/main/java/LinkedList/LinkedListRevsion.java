package LinkedList;

import java.util.NoSuchElementException;

public class LinkedListRevsion {
    private Node head;
    private Node tail;
    private int size;

    public LinkedListRevsion() {
        this.size = 0;
    }

    public static void main(String[] args) {
        LinkedListRevsion list = new LinkedListRevsion();
        list.insertFirst(10);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(15);
        list.display();
        list.insertLast1(30);
        list.display();
        list.insertAtIndex1(2, 99);
        list.display();
        list.deleteFirst();
        list.display();
        list.deletelast();
        list.display();
       // System.out.println(list.get(2));
        System.out.println("At index: " +list.get(2));

    }

    public void insertFirst(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;


        }
        size++;
    }

    public void insertFirst1(int val) {
        //Never put the actual insertion inside an else.
        //Only invariant-fixing goes in conditionals.
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void insertLast(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            size++;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        size++;

    }

    public void insertLast1(int value) {
        if (tail == null) {
            insertFirst1(value);
            return;
        }
        Node newNode = new Node(value);
        newNode.next = tail;
        tail = newNode;
        size++;

    }

    public void insertAtIndex(int value, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid index" + index);
        }
        if (index == 0) {
            insertFirst1(value);
            return;
        }
        if (index == size) {
            insertLast1(value);
            return;
        }
        Node newNode = new Node(value);
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
            newNode.next = temp.next;
            temp.next = newNode;
            size++;
        }
    }

    public void insertAtIndex1(int index, int value) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid index" + index);
        }
        if (index == 0) {
            insertFirst1(value);
        }
        if (index == size) {
            insertLast1(value);
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node newNode = new Node(value, temp.next);
        temp.next = newNode;
        size++;


    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty.... Nothing to delete");
        }
        Node temp = head;
        head = head.next;
        temp.next = null;//optional
        size--;


    }

    public void deleteFirst1() {
        if (head == null) {
            System.out.println("List is empty...... Nothing to delete");
        }
        head = head.next;
        size--;

    }


    public void deletelast() {
        if (head == null) {
            System.out.println("List is empty...... Nothing to delete");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;

        }
        temp.next = null;
        size--;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "->");
            temp = temp.next;

        }

        System.out.println("END");

    }

    public Node getFirst(){
       if(head==null){
           throw  new NoSuchElementException("List is empty");
       }
       return head;
    }
    public Node get(int index){
        if(head==null){
            throw  new NoSuchElementException("List is empty");
        }
        Node temp= head;
        for(int i =0;i<index;i++){
          temp= temp.next;
        }
        return temp;
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }


        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }


    }
}
