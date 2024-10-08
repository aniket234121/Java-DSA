package dsa.LinkedLIst;
import dsa.LinkedLIst.LinkedList.Node;
import java.util.HashMap;
public class ContainsCycle {
    public boolean hasCycle(Node head) {
        Node temp=head;
        HashMap<Node,Integer> map=new HashMap<>();
        while(temp!=null)
        {
            if(map.containsKey(temp))
            {
                return true;
            }
            else
            {
                map.put(temp,temp.getValue());
            }
            temp=temp.next;
        }
        return false;
    }
}
