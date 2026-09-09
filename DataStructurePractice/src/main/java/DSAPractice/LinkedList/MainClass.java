
package DSAPractice.LinkedList;
class Node{
    int data;
    Node next;

    public Node(int data){
        this.data=data;
    
    }
}
    class MainClass{
        public static void main(String[] args){
            Node n1 = new Node(5);
            Node n2 = new Node(10);
            Node n3 = new Node(40);
            Node n4 = new Node(20);
            Node n5 = new Node(30);
            n1.next=n2;
            n2.next=n3;
            n3.next=n4;
            n4.next=n5;
            
            System.out.println(n1.data);
            System.out.println(n1.next.data);
            System.out.println(n1.next.next.data);
            System.out.println(n1.next.next.next.data);
            System.out.println(n1.next.next.next.next.data);


        }
    }

