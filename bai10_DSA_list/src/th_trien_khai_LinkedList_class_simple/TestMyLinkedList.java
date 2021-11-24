package th_trien_khai_LinkedList_class_simple;

public class TestMyLinkedList {
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList("gfghff");
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addFirst(13);
        ll.addFirst(50);

        ll.add(4,9);
        ll.add(4,9);
        ll.printList();
    }
}
