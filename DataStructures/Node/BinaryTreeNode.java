package DataStructures.Node;

public class BinaryTreeNode <T> {
    private T data;
    private BinaryTreeNode <T> leftNode;
    private BinaryTreeNode <T> rightNode;

    public BinaryTreeNode(){

    }

    public void setData(T data){
        this.data = data;
    }

    public T getData(){
        return this.data;
    }

    public void setLeftNode(BinaryTreeNode <T> leftNode){
        this.leftNode = leftNode;
    }

    public BinaryTreeNode <T> getLeftNode(){
        return this.leftNode;
    }

    public void setRighttNode(BinaryTreeNode <T> rightNode){
        this.rightNode = rightNode;
    }

    public BinaryTreeNode <T> getRightNode(){
        return this.rightNode;
    }
}
