package Java.assignment10;

class SListIterator<T> {
    Node<T> head;
    Node<T> tail;
    Node<T> current;
    SListIterator(Node<T> head){
        this.head=head;
    }

    public void insertNode(T data) {
        Node node = new Node(data);
        if(head == null){
            head = node;
            tail = node;
        }
        else {
            tail.next = node;
            tail = node;
        }
    }

    public void removeNode() {
        if(head.next != null) {
            head = head.next;
        }
        else
            head=null;
    }
    public void iterator(){
        current=head;
    }
    public T next() {
        T data=current.item;
        current= current.next;
        return data;
    }

    public Node hasNext() {

        //return (current.next);
        return current;
    }

    public void displayList(){
        Node<T> node=head;

        while (node!=null){
            System.out.println(node.item);
            node=node.next;
        }
    }
}