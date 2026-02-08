public class ll {

    private Node head;
    private Node tail;
    private int size;

    public ll() {
        this.size = 0;
    }

    // Insert at beginning
    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size++;
    }

    // Insert at end
    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }

        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    // Insert at index
    public void insert(int val, int index) {
        if (index < 0 || index > size) {
            System.out.println("Invalid index");
            return;
        }

        if (index == 0) {
            insertFirst(val);
            return;
        }

        if (index == size) {
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

    // Delete first
    public int deleteFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return -1;
        }
6
        int val = head.value;
        head = head.next;
        size--;

        if (head == null) {
            tail = null;
        }

        return val;
    }

    // Delete last
    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }

        Node secondLast = head;
        while (secondLast.next != tail) {
            secondLast = secondLast.next;
        }

        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;

        return val;
    }

    // Delete at index
    public int delete(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid index");
            return -1;
        }

        if (index == 0) {
            return deleteFirst();
        }

        if (index == size - 1) {
            return deleteLast();
        }

        Node prev = head;
        for (int i = 0; i < index - 1; i++) {
            prev = prev.next;
        }

        int val = prev.next.value;
        prev.next = prev.next.next;
        size--;

        return val;
    }

    // Display list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }

    // Node class
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
