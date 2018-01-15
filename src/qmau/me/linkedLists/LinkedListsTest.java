package qmau.me.linkedLists;


public class LinkedListsTest {
    public static void main(String[] args) {
        LinkedLists ll = new LinkedLists();
        ll.pushFront(1);
        ll.pushBack(2);
        ll.pushFront(0);
        ll.popBack();
        ll.popFront();
        ll.pushBack(2);
        ll.pushBack(3);
        ll.pushBack(4);
        ll.pushBack(5);
        ll.pushFront(0);
        ll.insert(2, 200);
        ll.insert(3, 300);
        ll.removeValue(200);
        ll.erase(2);
        // ll.reverse();
        System.out.println("LinkedList with tail: ");
        System.out.println(ll.toString());

    }
}
