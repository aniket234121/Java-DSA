package dsa.LinkedLIst;
import java.util.HashMap;
public class DeepCopyNodeList {

    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }


        public Node copyRandomList(Node head) {
            if (head == null) {
                return null;
            }

            // Step 1: Create a mapping from the old nodes to new nodes.
            Node temp = head;
            HashMap<Node, Node> map = new HashMap<>();

            // Create new nodes and map the original nodes to the new ones.
            while (temp != null) {
                Node node = new Node(temp.val);
                map.put(temp, node);
                temp = temp.next;
            }

            // Step 2: Assign next and random pointers to the new nodes.
            temp = head;
            while (temp != null) {
                Node newNode = map.get(temp);
                newNode.next = map.get(temp.next);
                newNode.random = map.get(temp.random);
                temp = temp.next;
            }

            // Return the new head node.
            return map.get(head);
        }

        public static void main(String[] args) {
            // Create a linked list with random pointers for testing.
            DeepCopyNodeList solution =new DeepCopyNodeList();
            Node node1 = solution.new Node(1);
            Node node2 = solution.new Node(2);
            Node node3 = solution.new Node(3);

            // Set next pointers
            node1.next = node2;
            node2.next = node3;

            // Set random pointers
            node1.random = node3;
            node2.random = node1;
            node3.random = node2;

            // Print the original list with random pointers
            System.out.println("Original list:");
            printList(node1);

            // Create a solution object and copy the random list

            Node copiedHead = solution.copyRandomList(node1);

            // Print the copied list with random pointers
            System.out.println("Copied list:");
            printList(copiedHead);
        }

        // Helper function to print the list
        public static void printList(Node head) {
            Node temp = head;
            while (temp != null) {
                String randomVal = (temp.random != null) ? String.valueOf(temp.random.val) : "null";
                System.out.println("Node val: " + temp.val + ", Random points to: " + randomVal);
                temp = temp.next;
            }
        }


}
