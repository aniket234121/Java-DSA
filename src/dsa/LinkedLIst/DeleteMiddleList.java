package dsa.LinkedLIst;
import dsa.LinkedLIst.LinkedList.*;
public class DeleteMiddleList {
    public static Node deleteMiddle(Node head) {
        Node slow = head, fast = head;
        if (head.next == null) {
            return head.next;
        }
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        fast = head;
        while (fast.next != slow) {
            fast = fast.next;
        }
        fast.next = fast.next.next;
        return head;
    }
    public static void main(String[] args) {

        LinkedList list=new LinkedList();
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(2);
        list.insertLast(1);
        list.display();

        deleteMiddle(list.getHead());
        list.display();
    }
}
