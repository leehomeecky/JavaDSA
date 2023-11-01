package DataStructures.Node;

public class SingleLinkNode <T>{
    private T data;
    private SingleLinkNode<T> next;

    public SingleLinkNode(){
    }

    public void setData(T data){
        this.data = data;
    }

    public void setNext(SingleLinkNode<T> next){
        this.next = next;
    }

    public T getData(){
        return this.data;
    }

    public SingleLinkNode<T> getNext(){
        return this.next;
    }
}
