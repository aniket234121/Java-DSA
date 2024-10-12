package dsa.LinkedLIst;
import dsa.LinkedLIst.LinkedList.*;
public class SwapPair {
    public static void swap(Node temp,Node prev)
    {
        if(temp==null || temp.next==null)
        {
            return;
        }
        Node nextNode=temp.next;
        temp.next=temp.next.next;
        nextNode.next=temp;

        if(prev!=null){
            prev.next=nextNode;
        }
        prev=temp;
        swap(temp.next,prev);
    }
    public static Node swapPairs(Node head) {
        if(head==null)
        {
            return null;
        }
        else if(head.next==null)
        {
            return head;
        }
        Node newhead=head.next;
        swap(head,null);
        return newhead;
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
        list.setHead(swapPairs(head));
        list.display();

    }
}
