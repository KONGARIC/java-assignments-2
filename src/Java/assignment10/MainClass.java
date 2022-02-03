package Java.assignment10;

public class MainClass {
    public static void main(String[] args) {
        SList<Integer> list = new SList<>();
        SListIterator listIterator = list.iterator();

        listIterator.insertNode(2);
        listIterator.insertNode(3);
        listIterator.insertNode(4);
        listIterator.insertNode(5);
        listIterator.removeNode();
        listIterator.removeNode();
        listIterator.insertNode(6);

        listIterator.insertNode(7);

        listIterator.displayList();

        System.out.println("printing data using hasNext() and next()");
        listIterator.iterator();
        while(listIterator.hasNext()!=null)
        {
            System.out.println(listIterator.next());
        }
    }
}
