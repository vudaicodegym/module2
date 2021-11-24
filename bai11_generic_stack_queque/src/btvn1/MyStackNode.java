package btvn1;

public class MyStackNode<E> {
    int size;
    Node<E> top;
    public void add(E e){
        Node<E> newNode = new Node<>(e);
        newNode.next = top;
        top = newNode;
        size++;
    }
    public E pop(){
        E element = top.data;
        return element;
    }
    public  E get(){
        return elements[size - 1];
    }
    public boolean isEmty(){
        if (size == 0){
            return true;
        }
        return false;
    }
    public void show(){
        Node<E> temp = top;
        for
    }
}
