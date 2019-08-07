import java.util.Objects;


public class MyLinkedList {

    public class Cat {
        private String name;
        private int age;

        Cat(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Cat)) return false;
            Cat cat = (Cat) o;
            return age == cat.age &&
                    Objects.equals(name, cat.name);
        }
    }

    private class Node {
        Cat c;
        Node next;

        private Node(Cat c) {
            this.c = c;
        }

        private Node(String name, int age) {
            this.c = new Cat(name, age);
        }

        @Override
        public String toString() {
            return String.format("N: %s, A: %d", c.name, c.age);
        }
    }

    private Node head;

    public MyLinkedList() {
        head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void insert(String name, int age) {
        Node node = new Node(name, age);
        node.next = head;
        head = node;
    }

    public Cat remove() {
        if (isEmpty()) return null;
        Cat temp = head.c;
        head = head.next;
        return temp;
    }

    public boolean find(String name, int age) {
        Node current = head;
        while (!(current.c.age == age &&
                current.c.name.equals(name))) {
            if (current.next == null)
                return false;
            else
                current = current.next;
        }
        return true;
    }

    @Override
    public String toString() {
        Node current = head;
        StringBuilder sb = new StringBuilder("[");
        while (current != null) {
            sb.append(current);
            current = current.next;
            sb.append((current == null) ? "]" : ", ");
        }
        return sb.toString();
    }

    public Cat delete(String name, int age) {
        Cat cat = new Cat(name, age);
        Node current = head;
        Node previous = head;
        while (!current.c.equals(cat)) {
            if (current.next == null) {
                return null;
            } else {
                previous = current;
                current = current.next;
            }
        }

        if (current == head) {
            head = current.next;
        } else {
            previous.next = current.next;
        }
        return current.c;
    }
}

