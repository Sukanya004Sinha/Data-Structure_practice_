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
    
    

  class MainLL{
    public static void main(String[] args){
      LinkedList list = new LinkedList();
      list.addFirst(10);
      list.addFirst(20);
      list.addFirst(30);
      list.addLast(40);
      list.addLast(50);
      list.display();
    }
  }  
}