package Java.assignment10;

public class Node<T>{
    T item;
    Node next;

    Node(T item){
        this.item=item;
        next=null;
    }
}