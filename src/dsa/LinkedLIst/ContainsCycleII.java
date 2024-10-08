package dsa.LinkedLIst;

import java.util.HashMap;
import dsa.LinkedLIst.LinkedList.Node;
public class ContainsCycleII {
    public Node hasCycle(LinkedList.Node head) {
        LinkedList.Node temp=head;
        HashMap<LinkedList.Node,Integer> map=new HashMap<>();
        while(temp!=null)
        {
            if(map.containsKey(temp))
            {
                return temp;
            }
            else
            {
                map.put(temp,temp.getValue());
            }
            temp=temp.next;
        }
        return null;
    }
}
