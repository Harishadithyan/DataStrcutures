public class Link {
    public static void main(String[] args) {

        ll list = new ll();

        list.insertFirst(10);
        list.insertFirst(20);
        list.insertLast(30);
        list.insertLast(40);
        list.insert(25, 2);

        list.display();   // 20 -> 10 -> 25 -> 30 -> 40 -> End

        list.deleteFirst();
        list.display();   // 10 -> 25 -> 30 -> 40 -> End

        list.deleteLast();
        list.display();   // 10 -> 25 -> 30 -> End

        list.delete(1);
        list.display();   // 10 -> 30 -> End
    }
}
