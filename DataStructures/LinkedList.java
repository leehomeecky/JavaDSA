package DataStructures;

import DataStructures.Node.SingleLinkNode;

public class LinkedList <T>{
    SingleLinkNode<T> head;

    private SingleLinkNode<T> getNode(int index){
        SingleLinkNode<T> temp = head;
        
        if (head == null)
            return null;
        for (int i = 0; i < index; i++) {
            if (temp.getNext() == null)
                break;
            temp = temp.getNext();
        }

        return temp;
    }

    public boolean add(T data){
        SingleLinkNode<T> node = new SingleLinkNode<>();
        SingleLinkNode<T> lastNode = this.getNode(this.size() - 1);
        node.setData(data);
        if (lastNode == null)
        {
            node.setNext(head);
            head = node; 
        }
        else
        {
        lastNode.setNext(node);
        }
        return true;
    }

    public boolean add(T data, int index){
        if (index < 0)
            index = this.size() + index;
        SingleLinkNode<T> node = new SingleLinkNode<>();
        SingleLinkNode<T> indexNode = this.getNode(index - 1);
        node.setData(data);
        if (indexNode == null || index == 0)
        {
            node.setNext(head);
            head = node; 
        }
        else
        {
            node.setNext(indexNode.getNext());
            indexNode.setNext(node);
        }
        return true;
    }

    public T getData(int index){
        if (index < 0)
            index = this.size() + index;
        if (index >= this.size())
            return null;
        SingleLinkNode<T> indexNode = this.getNode(index);
        return indexNode.getData();
    }

    public boolean setData(T data, int index){
        if (index > this.size() || this.size() == 0)
            return false;
        if (index < 0)
            index = this.size() + index;
        this.getNode(index).setData(data);
        return true;

    }

    public void printList(){
        SingleLinkNode<T> temp = head;
        if (temp == null)
            return;
        while(temp != null){
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }

    public int size(){
        SingleLinkNode<T> temp = head;
        int i = 0;

        for (; temp != null; i++)
            temp = temp.getNext();
        return i;
    }

}
