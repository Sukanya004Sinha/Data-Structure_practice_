package DSAPractice.LinkedList;

class LinkedList {
  Node head;
  Node tail;
  int size;

public LinkedList() {
this.head =null;
this.tail= null;
this.size=0;
}


    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
      }

      public void addLast(int val){
        Node newNode = new Node(val);
        if(head==null){
          head = newNode;
          tail = newNode;
        }
        else{
          tail.next = newNode;
          tail = newNode;
        }
        size++;
      }

      public void addFirst(int val){
        Node newNode = new Node(val);
        if(head==null){
          head = newNode;
          tail = newNode;
        }
        else{
          newNode.next = head;
          head = newNode;
        }
        size++;
      }
   public void removeLast(){
    if(head==null){
      System.out.println("No such element in LinkedList to delete");
      return ;
    }
    else if(head==tail){
      head = null;
      tail = null;
    }
    else{
      Node temp = head;
      while(temp.next!=null){
        Node tempKaNext = temp.next;
        temp = tempKaNext;
      }
    temp.next = null;
    tail= temp;
   
    }
    this.size--;

  }
}
      public void display(){
        Node temp = head;
        while(temp!=null){
          System.out.print(temp.data + " -> ");
          Node tempKaNext = temp.next;
          temp = tempKaNext;
        }
        System.out.println("null");
      }
    
    }
  public class MainLL{
    public static void main(String[] args){
      LinkedList list = new LinkedList();
      list.addFirst(10);
      list.addFirst(20);
      list.addFirst(30);
      list.addLast(40);
      list.addLast(50);
      list.addLast(60);
      list.display();
    }
  }
