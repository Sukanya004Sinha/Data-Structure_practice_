package LinkedList;

import java.util.NoSuchElementException;

public class LinkedList {
    Node head;
    private int size = 0;

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.insertFirst(40);
        list.insertFirst(50);
    //    list.printList();
        System.out.println("^^^^^^^^^^^^^^");
//        list.deleteAtIndex(1);
//        list.printList();
        //  System.out.println(list.getsize());
//        list.insertLastNode(100);
//        list.printList();
//        System.out.println(list.getsize());
//        list.atPos(299, 5);
//        list.printList();
        ;
//        System.out.println(list.getsize());
//        System.out.println("***");
//        list.deleteLast1();
//        list.printList();
//         list.reverse();
//         list.printList();
         list.search(30);
         list.printList();
        System.out.println("^^^^^^^^^^^^^^");
        System.out.println("First element: " + list.getFirst());
        list.printList();
        System.out.println("Last element: " +list.getLast());
        System.out.println("At index: " +list.getAtindex(0));

    }

    private int getsize() {
        return size;
    }

    private void insertFirst(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            newNode.next = temp;
            head = newNode;
        }
        size++;
    }

    private void insertLastNode(int value) {
        if (head == null) {
            Node newNode = new Node(value);
            head = newNode;
        } else {
            Node newNode = new Node(value);
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        size++;
    }

    private void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty. Nothing to delte");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }


        head = head.next;
    }

    private void deleteLast() {
        if (head == null) {
            System.out.println("List is empty. Nothing to delte");
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
    }
    private int getFirst(){
        if(head==null){
            throw new NoSuchElementException("List is empty");
        }
        return head.value;
    }
    private int getLast(){
        if(head==null){
            throw new NoSuchElementException("List is empty");
        }
        Node curr =head;
        while(curr.next!=null){
            curr= curr.next;
        }
        return curr.value;
    }
    private int getAtindex(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index cannot be negative");

        } else if (head == null) {
            throw new NoSuchElementException("List is empty");

        } else {
            Node curr = head;
            for (int i = 0; i < index; i++) {
                curr = curr.next;

            }
            return curr.value;
        }
    }
    private void deleteAtIndex(int index) {
        if (head == null || index < 0) {
            return;
        }
        if (index == 0) {
            head = head.next;
            return;
        }

        Node prev = null;
        Node curr = head;
        Node next = curr.next;
        for (int i = 0; i < index; i++) {
            prev = curr;
            curr = curr.next;
        }
        if (curr == null) return;

        next = curr.next;
        prev.next = next;

    }

    private void deleteLast1() {
        Node curr = head;
        Node prev = null;
        while (curr.next != null) {
            prev = curr;
            curr = curr.next;


        }
        prev.next = null;
    }

    private void atPos(int value, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid Index" + index);
        } else if (index == 0) {
            insertFirst(value);
            return;
        } else if (index == size) {
            insertLastNode(value);
            return;
        } else {
            Node newNode = new Node(value);
            Node temp = head;
            for (int i = 0; i < index-1; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;

        }
        size++;

    }
   private Node reverse(){
        Node curr = head;
        Node prev = null;
        Node next = null;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev= curr;
            curr=next;
        }
        return prev;
   }
    private void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value + "---->");
            temp = temp.next;
        }
        System.out.println("null");

    }
    private void search(int key) {
        Node curr = head;
        while (curr != null) {
            if (curr.value == key) {
                System.out.println("key is present" + key);
                return;
            }
            curr = curr.next;
        }
                System.out.println("key is not present" + key);

        }


    private class Node {
        private int value;
        private Node next;


        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }
}

