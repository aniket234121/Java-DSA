package dsa.LinkedLIst;
import dsa.LinkedLIst.LinkedList.*;

import java.util.HashMap;

public class IntersectionOfTwoLinkedList {
    //it take O(N) space
//    public Node getIntersectionNode(Node headA, Node headB) {
//        HashMap<Node, Integer> map = new HashMap<>();
//        Node temp = headA;
//
//        // Traverse through list A and store the nodes in the map
//        while (temp != null) {
//            map.put(temp, temp.val);
//            temp = temp.next;
//        }
//
//        // Traverse through list B and check for intersection
//        temp = headB;
//        while (temp != null) {
//            if (map.containsKey(temp)) {
//                return temp;  // Intersection node found
//            }
//            temp = temp.next;
//        }
//
//        // No intersection
//        return null;
//    }
    public Node getIntersectionNode(Node headA, Node headB) {
        Node temp = headA;
        int sizeA = 0, sizeB = 0;

        while (temp != null) {
            sizeA++;
            temp = temp.next;
        }

        temp = headB;
        while (temp != null) {
            sizeB++;
            temp = temp.next;
        }

        temp = headA;
        Node temp2 = headB;

        if (sizeB > sizeA) {
            for (int i = 0; i < sizeB - sizeA; i++) {
                temp2 = temp2.next;
            }
        } else {
            for (int i = 0; i < sizeA - sizeB; i++) {
                temp = temp.next;
            }
        }

        while (temp != null) {
            if (temp == temp2) {
                return temp;
            }
            temp = temp.next;
            temp2 = temp2.next;
        }

        return null;
    }

}
