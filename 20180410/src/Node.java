public class Node {
    private int data;
    private Node next = null;
    public Node (int data1){
        data = data1;
    }
    public void addNode(Node node1){
        next = node1;
    }
    public Node getNext(){
        return this.next;
    }
}
