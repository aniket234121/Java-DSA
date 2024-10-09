package dsa.LinkedLIst;
import dsa.LinkedLIst.LinkedList.*;
public class OddEvenLinkedList {

    public static Node oddEvenList(Node head) {
        if (head == null || head.next == null || head.next.next == null) {
            return head;
        }

        Node oddHead = head, tempOdd = head;
        Node evenHead = head.next, tempEven = head.next;
        int count = 1;
        Node temp = evenHead.next;

        while (temp != null) {
            if (count % 2 != 0) {
                tempOdd.next = temp;
                tempOdd = tempOdd.next;
            } else {
                tempEven.next = temp;
                tempEven = tempEven.next;
            }
            temp = temp.next;
            count++;
        }

        tempOdd.next = null;
        tempEven.next = null;
        tempOdd.next = evenHead;

        return oddHead;
    }
    public static void main(String[] args) {

        LinkedList list=new LinkedList();
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(2);
        list.insertLast(1);
        list.display();
        LinkedList.Node head=list.getHead();
        oddEvenList(head);
        list.display();
    }
}
