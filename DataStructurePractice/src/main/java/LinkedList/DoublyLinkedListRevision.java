package LinkedList;

public class DoublyLinkedListRevision {
    Node head;

    private class Node {
        int value;
        Node next;
        Node prev;

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }

        public Node(int value) {
            this.value = value;
        }
        private void insertFirst(int val){
         Node node= new Node(value);
         node.next = head;
         node.prev = null;
         if(head!=null){

         }
        }
    }
}
