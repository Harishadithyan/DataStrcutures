public class Main {
    public static void main(String[] args) {
        CLL list = new CLL();

        list.insertFirst(10);
        list.insertLast(20);
        list.insertLast(30);
        list.insertAt(15, 1); // insert 15 at index 1
        list.display();        // 10 -> 15 -> 20 -> 30 -> (head)

        list.deleteAt(2);      // delete value 20
        list.display();        // 10 -> 15 -> 30 -> (head)

        list.deleteFirst();
        list.display();        // 15 -> 30 -> (head)

        list.deleteLast();
        list.display();        // 15 -> (head)
    }
}
