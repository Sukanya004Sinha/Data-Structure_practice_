//package LinkedList;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//
//public class Merge2List {
//    public ListNode merge2List(ListNode list1, ListNode list2) {
//        List<Integer> arr = new ArrayList<>();
//        ListNode temp1 = list1;
//        ListNode temp2 = list2;
//        while(temp1 !=null){
//            arr.add(temp1.val);
//            temp1= temp1.next;
//        }
//        while (temp2!=null){
//            arr.add(temp2.val);
//            temp2=temp2.next;
//        }
//        Collections.sort(arr);
//        ListNode head = null;
//        ListNode curr = null;
//        for(int val: arr){
//            ListNode newNode= new ListNode(val);
//        }
//    }
//
//    public class ListNode {
//        int val;
//        ListNode next;
//
//        public ListNode(int val, ListNode next) {
//            this.val = val;
//            this.next = next;
//        }
//
//        public ListNode(int val) {
//            this.val = val;
//        }
//    }
//}
