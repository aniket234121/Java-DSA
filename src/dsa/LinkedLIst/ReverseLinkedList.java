package dsa.LinkedLIst;

import dsa.LinkedLIst.LinkedList.Node;
public class ReverseLinkedList {
    public static Node reverseList(Node head) {
        Node curr=head;
        Node prev=null,next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        return prev;
    }
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);
        list.display();
        Node head=list.getHead();
        head=reverseList(head);
        list.setHead(head);
        list.display();
    }
}
