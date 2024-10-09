package dsa.LinkedLIst;
import dsa.LinkedLIst.LinkedList.*;
public class MiddleLinkedList {
    public static Node middleNode(Node head) {
        Node slow = head, fast = head;
        while (fast!= null && fast.next != null ) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public static void main(String[] args) {

        LinkedList list=new LinkedList();
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);
        list.display();
        LinkedList.Node head=list.getHead();
        System.out.println(middleNode(head).getValue());

    }
}
