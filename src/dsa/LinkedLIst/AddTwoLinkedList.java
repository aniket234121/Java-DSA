package dsa.LinkedLIst;
import dsa.LinkedLIst.LinkedList.*;
public class AddTwoLinkedList {
    public static Node addTwoNumbers(Node l1, Node l2) {
        if(l1==null)
        {
            return l2;
        }
        else if (l2==null)
        {
            return l1;
        }

        Node temp=l1,temp2=l2;
        Node ans=new Node(-1);
        Node temp3=ans;
        int carry=0;
        while(temp!=null && temp2!=null)
        {
            int value=temp.getValue()+temp2.getValue()+carry;
            Node li= new Node(value%10);
            carry=value/10;
            temp=temp.next;
            temp2=temp2.next;
            temp3.next=li;
            temp3=temp3.next;
        }

        if(temp==null)
        {

            while(temp2!=null)
            {
                int value=temp2.getValue()+carry;
                Node li=new Node(value%10);
                carry=value/10;
                temp3.next=li;
                temp3=temp3.next;
                temp2=temp2.next;
            }
        }
        else if(temp2==null)
        {

            while(temp!=null)
            {
                int value=temp.getValue()+carry;
                Node li= new Node(value%10);
                carry=value/10;
                temp3.next=li;
                temp3=temp3.next;

                temp=temp.next;

            }
        }
        if(carry!=0)
        {
            Node li=new Node(carry);
            temp3.next=li;
        }
        return ans.next;
    }
    public static void main(String[] args) {

        LinkedList list=new LinkedList();
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(2);
        list.insertLast(1);
        list.display();
        LinkedList list2=new LinkedList();
        list2.insertLast(9);
        list2.insertLast(7);
        list2.insertLast(1);
        list2.display();
        Node sum=addTwoNumbers(list.getHead(),list2.getHead());
        LinkedList li=new LinkedList();
        li.setHead(sum);
        li.display();
    }

}
