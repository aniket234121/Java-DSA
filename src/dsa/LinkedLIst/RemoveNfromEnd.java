package dsa.LinkedLIst;
import dsa.LinkedLIst.LinkedList.*;
public class RemoveNfromEnd {
    public static Node removeNthFromEnd(Node head, int n) {
        Node slow = head, fast = head;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        if (fast == null) {
            return head.next;
        }
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;

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
        removeNthFromEnd(list.getHead(),2);
        list.display();
    }
}
