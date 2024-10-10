package dsa.LinkedLIst;
import dsa.LinkedLIst.LinkedList.*;
public class ReverseNodesKgroup {
    public static Node findKthNode(Node head, int k){
        Node temp=head;
        k-=1;
        while(k>0 && temp!=null){
            temp=temp.next;
            k--;
        }
        return temp;
    }
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
    public static Node reverseKGroup(Node head, int k) {
        Node temp=head;

        Node prevLast=null;
        while(temp!=null)
        {
            Node KthNode=findKthNode(temp,k);
            if(KthNode==null)
            {
                if(prevLast!=null)
                {
                    prevLast.next=temp;
                }
                break;
            }
            Node nextNode=KthNode.next;
            KthNode.next=null;
            reverseList(temp);
            if(temp==head)
            {
                head=KthNode;
            }
            else{
                prevLast.next=KthNode;
            }
            prevLast=temp;
            temp=nextNode;
        }
        return head;
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
        LinkedList list2=new LinkedList();
        list2.setHead(reverseKGroup(list.getHead(),2));
        list2.display();

    }
}
