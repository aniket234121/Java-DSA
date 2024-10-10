package dsa.LinkedLIst;

import java.util.Queue;
import dsa.LinkedLIst.LinkedList.*;
import java.util.LinkedList;
public class RotateList {
//    public static Node rotateRight(Node head, int k) {
//        Node temp = head;
//        int size = 0;
//        if (head == null || head.next == null) {
//            return head;
//        }
//        // Calculate the size of the list
//        while (temp != null) {
//            temp = temp.next;
//            size += 1;
//        }
//
//        // Reduce k to within bounds of the list size
//        k = k % size;
//        if (k == 0) {
//            return head;
//        }
//
//        temp = head;
//        Queue<Integer> queue = new LinkedList<Integer>();
//
//        // Rotate the list by k places
//        while (temp != null) {
//            if (k > 0) {
//                queue.offer(temp.getValue()); // Using getValue() method
//                k--;
//            } else {
//                queue.offer(temp.getValue());
//                int value = queue.poll();
//                temp.setValue(value); // Assuming there is a setValue() method
//            }
//            temp = temp.next;
//        }
//
//        temp = head;
//        while (!queue.isEmpty()) {
//            int value = queue.poll();
//            temp.setValue(value); // Assuming setValue() method exists
//            temp = temp.next;
//        }
//
//        return head;
//    }
public static Node rotateRight(Node head, int k) {
    if(head==null||head.next==null||k==0)
    {
        return head;
    }
    Node temp=head;
    int size=1;
    while(temp.next!=null)
    {
        size++;
        temp=temp.next;
    }
    k=k%size;
    temp.next=head;
    k=size-k;
    while(k>0)
    {
        k--;
        temp=temp.next;
    }
    head=temp.next;
    temp.next=null;
    return head;
}
    public static void main(String[] args) {
        dsa.LinkedLIst.LinkedList list=new dsa.LinkedLIst.LinkedList();
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);
        list.display();
        list.setHead(rotateRight(list.getHead(),2));
        list.display();
    }

}
