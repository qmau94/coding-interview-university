package qmau.me.linkedLists;

public class Node {

    private Object value;
    private Node nextNode;

    public Node(Object value) {
        this.value = value;
        this.nextNode = null;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    public void setNextNode() {
        this.nextNode = null;
    }

    public String toString() {
        if (this.nextNode == null)
            return "Node =>(" + this.value + ")";
        return "Node =>(" + this.value + "," + this.nextNode.toString() + ")";

    }


}
