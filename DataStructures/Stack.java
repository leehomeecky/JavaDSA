package DataStructures;

import DataStructures.Node.SingleLinkNode;

public class Stack<T> {
    SingleLinkNode<T> top;

    public void push(T data){
        SingleLinkNode<T> node = new SingleLinkNode<>();
        node.setData(data);
        node.setNext(this.top);
        this.top = node;
    }

    public T pop(){
        if (this.top == null) {
            System.out.println("Stack is empty");
            return null;
        }
        T data = this.top.getData();
        this.top = this.top.getNext();
        return data;
    }

    public T peek(){
        if (this.top == null) {
            System.out.println("Stack is empty");
            return null;
        }
        return this.top.getData();
    }

    public void display(){
        SingleLinkNode<T> temp = top;

        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }

    public int size(){
        SingleLinkNode<T> temp = top;
        int i = 0;

        for (; temp != null; i++) 
            temp = temp.getNext();

            return i;
    }
}
