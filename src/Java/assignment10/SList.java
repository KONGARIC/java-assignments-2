package Java.assignment10;

public class SList<T> {
    private Node<T> head;

    SList(){
        head=null;
    }

    public SListIterator<T> iterator(){
        return new SListIterator(head);
    }
}