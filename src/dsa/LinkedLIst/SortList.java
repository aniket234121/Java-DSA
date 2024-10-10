package dsa.LinkedLIst;

import dsa.LinkedLIst.LinkedList.*;
public class SortList {

    public  Node findMiddle(Node head)
    {
        if(head == null || head.next == null)
        {
            return head;
        }
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public  Node mergeTwoSortedList(Node headA, Node headB)
    {
        Node ans=new Node(-1);
        Node temp=ans;
        while(headA != null && headB != null)
        {
            if(headA.getValue()<=headB.getValue())
            {
                temp.next=headA;
                headA=headA.next;
            }
            else {
                temp.next=headB;
                headB=headB.next;
            }
            temp=temp.next;
        }

        if(headA!=null)
        {
            temp.next=headA;
        }
        if(headB!=null)
        {
            temp.next=headB;
        }
        return ans;
    }
    public  Node mergeSort(Node head)
    {
        if(head == null || head.next == null)
        {
            return head;
        }

        Node left=head;
        Node Middle=findMiddle(head);
        Node Right=Middle.next;
        Middle.next=null;

        left=mergeSort(left);
        Right=mergeSort(Right);
        return mergeTwoSortedList(left,Right);

    }
    public  Node sortList(Node head) {

        return mergeSort(head);
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
        SortList sl=new SortList();
        sl.sortList(head);
        list.display();
    }
}
