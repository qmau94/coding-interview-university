package qmau.me.linkedLists;

public class LinkedLists {
    private Node head;
    private Node tail;
    private int size;

    public LinkedLists() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public int size() {
        return this.size;
    }

    public boolean empty() {
        return this.size == 0;
    }

    public Object valueAt(int index) {
        Node currentNode = this.head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.getNextNode();
        }
        return currentNode.getValue();
    }

    public Node nodeAt(int index) {
        Node currentNode = this.head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.getNextNode();
        }
        return currentNode;
    }

    public void pushFront(Object value) {
        Node node = new Node(value);
        node.setNextNode(this.head);
        this.head = node;
        this.tail = (this.empty()) ? node : this.tail;
        this.size += 1;
    }

    public Object popFront() {
        Node removedNode = this.head;
        this.head = this.head.getNextNode();
        this.tail = (removedNode.getNextNode() == null) ? null : this.tail;
        this.size -= 1;
        return removedNode.getValue();
    }

    public void pushBack(Object value) {
        Node node = new Node(value);
        if (this.empty()) {
            this.head = node;
            this.tail = node;
        } else {
            this.tail.setNextNode(node);
            this.tail = node;
        }
        this.size += 1;
    }

    public Object popBack() {
        Node removedNode = this.tail;
        Node currentNode = this.head;
        if (this.size == 1) {
            this.head = null;
            this.tail = null;
        } else {
            currentNode = nodeAt(this.size - 2);
        }
        this.tail = currentNode;
        currentNode.setNextNode();
        this.size -= 1;
        return removedNode.getValue();
    }

    public Object front() {
        return this.head.getValue();
    }

    public Object back() {
        return this.tail.getValue();
    }

    public void insert(int index, Object value) {
        if (index == 0) {
            pushFront(value);
        } else if (index == this.size - 1) {
            pushBack(value);
        } else {
            Node newNode = new Node(value);
            Node currentNode = this.head;
            for (int i = 0; i < index - 1; i++) {
                currentNode = currentNode.getNextNode();
            }

            newNode.setNextNode(currentNode.getNextNode());
            currentNode.setNextNode(newNode);
            this.size += 1;
        }

    }

    public Object erase(int index) {
        Node currentNode = this.head;
        for (int i = 0; i < index - 1; i++) {
            currentNode = currentNode.getNextNode();
        }
        currentNode.setNextNode(currentNode.getNextNode().getNextNode());
        this.size -= 1;
        return currentNode.getNextNode().getValue();
    }

    public Object valueNFromEnd(int n) {
        return valueAt(this.size - n);
    }

    // public void reverse() {
    // if (this.size < 1) {
    // } else {
    // this.head.setNextNode();
    // Node currentNode = this.head.getNextNode();
    // while (currentNode != null) {
    // currentNode = currentNode.getNextNode();
    // Node nextNode = currentNode.getNextNode();
    // nextNode.setNextNode(currentNode);
    // }
    // }
    // }

    public Object removeValue(Object object) {
        Node currentNode = this.head;
        for (int i = 0; i < this.size - 1; i++) {
            if (currentNode.getNextNode().getValue().equals(200)) {
                currentNode.setNextNode(currentNode.getNextNode().getNextNode());
                this.size -= 1;
            } else {
                currentNode = currentNode.getNextNode();
            }
        }
        return currentNode.getNextNode().getValue();
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public String toString() {
        if (this.empty())
            return "EmptyList";
        return "LinkedList(" + this.size + ") => " + this.head.toString();
    }

}
