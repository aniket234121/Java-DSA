package dsa.LinkedLIst;
import dsa.LinkedLIst.LinkedList.*;

import java.util.Stack;

public class CheckPalindromeLinkLIst {
    public static boolean isPalindrome(Node head) {
        Node temp=head;
        Stack<Integer> st=new Stack<>();
        while(temp!=null){
            st.push(temp.getValue());
            temp=temp.next;
        }
        temp=head;
        while(!st.isEmpty() && temp!=null){
            if(temp.getValue()!=st.pop())
            {
                return false;
            }
            temp=temp.next;
        }

        return true;
    }

    public static void main(String[] args) {

        LinkedList list=new LinkedList();
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(2);
        list.insertLast(2);
        list.display();
        LinkedList.Node head=list.getHead();
        System.out.println(isPalindrome(head));

    }
}
