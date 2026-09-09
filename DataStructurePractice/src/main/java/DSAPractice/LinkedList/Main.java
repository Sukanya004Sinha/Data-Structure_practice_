package DSAPractice.LinkedList;
class Node {
  int value;
  Node next;

  public Node(int value) {
    this.value = value;
  }
}

class LinkedList{
    Node head;
    Node tail;
    int size;
    
public LinkedList() {
    this.head=null;
    this.tail=null;
    this.size=0;
    
}

public void insertFirst(int value){
    Node newnode = new Node(value);
    if(head==null){
        head=newnode;
        tail=newnode;
    }else{
        newnode.next=head;
        head=newnode;

}
size++;
}
public void insertLast(int value){
    Node newnode = new Node(value);
    if(head==null){
        head=newnode;
        tail=newnode;
    }else{
        tail.next=newnode;
        tail=newnode;
}
size++;
}

public void deleteLast(){
    if(head==null){
        System.out.println("List is empty");
       
    }
   else if (head==tail){
    head=null;
    tail=null;
    size--;
   }
   else{
   Node temp = head;
   while(temp.next!=tail){
  Node tempkaNext = temp.next;
     temp=tempkaNext;

   }
    temp.next=null;// removing the last node
    tail=temp;//shifting the tail to the second last node
   
   }
    size--;
   }
//   public void reverseData() {
//     int left = 0;
//     int right = size - 1;

//     while (left < right) {

//         Node leftNode = this.getNodeAt(left);
//         Node rightNode = this.getNodeAt(right);

//         int temp = leftNode.data;
//         leftNode.data = rightNode.data;
//         rightNode.data = temp;

//         left++;
//         right--;
//     }
// }

public int middleElement(){
    Node slow = head;
    Node fast = head;
    while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
    }
    return slow.value;
}
public ListNode findFirstMiddle(ListNode head) {
    ListNode slow = head;
    ListNode fast = head;
    
    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
    }
    
    return slow; // This will be the first middle node
}

public void reverse2(){

    Node prev = null;
    Node curr = head;
    while(curr!=null){
        Node next = curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
    }
    tail=head;
    head=prev;
}


public void display() {
    
    Node temp = head;
    while (temp != null) {
        System.out.print(temp.value + " -> ");
        temp = temp.next;
    }
    System.out.println("null");

    
}



public class Main {
  public static void main(String[] args) {
    LinkedList list = new LinkedList();
    list.insertFirst(1);
    list.insertFirst(2);
    list.insertFirst(3);
    list.insertLast(4);
    list.insertLast(5);
    list.display();
   list.deleteFirst();
   list.deleteFirst();
    list.display();
  }

    
}
