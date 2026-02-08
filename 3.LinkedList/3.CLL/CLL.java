public class CLL {
    private Node head;
    private Node tail;
    private int size;

    // Node class
    private class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    // Constructor
    public CLL() {
        head = null;
        tail = null;
        size = 0;
    }

    // Insert at beginning
    public void insertFirst(int val) {
        Node node = new Node(val);
        if (head == null) {   // empty list
            head = node;
            tail = node;
            node.next = head; // circular link
        } else {
            node.next = head;
            head = node;
            tail.next = head; // maintain circular link
        }
        size++;
    }

    // Insert at end
    public void insertLast(int val) {
        if (head == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        tail.next = head; // maintain circular link
        size++;
    }

    // Insert at specific index
    public void insertAt(int val, int index) {
        if (index < 0 || index > size) {
            System.out.println("Index out of bounds");
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
        Node node = new Node(val);
        node.next = temp.next;
        temp.next = node;
        size++;
    }

    // Delete first node
    public int deleteFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return -1;
        }
        int val = head.value;
        if (size == 1) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            tail.next = head;
        }
        size--;
        return val;
    }

    // Delete last node
    public int deleteLast() {
        if (head == null) {
            System.out.println("List is empty");
            return -1;
        }
        if (size == 1) {
            return deleteFirst();
        }
        Node temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }
        int val = tail.value;
        tail = temp;
        tail.next = head;
        size--;
        return val;
    }

    // Delete at specific index
    public int deleteAt(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index out of bounds");
            return -1;
        }
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        int val = temp.next.value;
        temp.next = temp.next.next;
        size--;
        return val;
    }

    // Display the list
    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        for (int i = 0; i < size; i++) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("(head)");
    }
}
