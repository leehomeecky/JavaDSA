package FloydTortoiseHareAlgorithm;

import DataStructures.LinkedList;
import DataStructures.Node.SingleLinkNode;


public class Solution {
    public SingleLinkNode<Integer> detectCycle(SingleLinkNode<Integer> head) {
        SingleLinkNode<Integer> temp = head;
        SingleLinkNode<Integer> circlePoint = getCircle(head);
        if (circlePoint == null) return null;
        circlePoint = circlePoint.getNext();
        while (temp != circlePoint){
            temp = temp.getNext();
            circlePoint = circlePoint.getNext();
        }
        return temp;
    }
    
private SingleLinkNode<Integer> getCircle(SingleLinkNode<Integer> head){
    SingleLinkNode<Integer> pointer1 = head;
    SingleLinkNode<Integer> pointer2 = head;
    if (pointer1 == null) return null;
    for (pointer1 = pointer1.getNext(); pointer1 != pointer2; pointer1 = pointer1.getNext()){
        if (pointer1 == null || pointer1.getClass() == null) return null;
        pointer1 = pointer1.getNext();
        pointer2 = pointer2.getNext();
    }
    return pointer2;
}
}
