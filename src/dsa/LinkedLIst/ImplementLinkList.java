package dsa.LinkedLIst;
import dsa.LinkedLIst.LinkedList;
public class ImplementLinkList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertFirst(45);
        list.insertFirst(90);
        list.insertFirst(40);
        list.insertFirst(50);
        list.insertFirst(10);
        list.insertLast(999);
        list.insertAt(3,2);
        list.display();
        list.deleteFirst();
        list.display();
        list.deleteLast();
        list.display();
        list.deleteAt(9);
        list.display();
    }
}
