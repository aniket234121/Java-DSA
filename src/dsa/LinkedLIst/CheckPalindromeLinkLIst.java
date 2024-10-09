package dsa.LinkedLIst;
import dsa.LinkedLIst.LinkedList.*;

import java.util.Stack;

public class CheckPalindromeLinkLIst {
//    public static boolean isPalindrome(Node head) {
//        Node temp=head;
//        Stack<Integer> st=new Stack<>();
//        while(temp!=null){
//            st.push(temp.getValue());
//            temp=temp.next;
//        }
//        temp=head;
//        while(!st.isEmpty() && temp!=null){
//            if(temp.getValue()!=st.pop())
//            {
//                return false;
//            }
//            temp=temp.next;
//        }
//
//        return true;
//    }
public static Node reverse(Node head) {
    Node prev = null;
    Node temp = head;
    while (temp != null) {
        Node front = temp.next;
        temp.next = prev;
        prev = temp;
        temp = front;
    }
    return prev;
}

    public static boolean compare(Node Head1,Node Head2)
    {
        Node temp=Head2;
        Node temp2=Head1;
        while(temp!=null)
        {
            if(temp.getValue()!=temp2.getValue())
            {return false;}
            temp=temp.next;
            temp2=temp2.next;
        }
        return true;
    }

    public static Node findMiddle(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public static boolean isPalindrome(Node head) {
        Node temp=head;
        Node middle=findMiddle(temp);
        middle=reverse(middle.next);
        boolean ans=compare(temp,middle);
        reverse(middle);
        return ans;

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
        System.out.println(isPalindrome(head));

    }
}
