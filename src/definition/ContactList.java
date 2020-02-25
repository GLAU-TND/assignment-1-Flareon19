package definition;

import adt.ListADT;

public class ContactList<Person> implements ListADT<Person> {
    private Node<Person> head = null;
    private int size = 0;

    @Override
    public void add(Person element) {

    }

    private void addFirst(Person element) {
        head = new Node<>(head, element);
        size++;
    }

    public void addAfter(Person element, Node<Person> node) {
        node.next = new Node<>(node, element);
        size++;
    }

    private void add(int index, Person element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException(Integer.toString(index));
        } else if (index == 0) {
            addFirst(element);
        }

    }

    @Override
    public void sort() {

    }

    @Override
    public Person remove(Person element) {
        return null;
    }

    @Override
    public int search(Person element) {
        return 0;
    }

    private static class Node<E> {
        private Node<E> next;
        private E data;

        private Node(Node<E> next, E data) {
            this.next = next;
            this.data = data;
        }

        private Node(E data) {
            this.data = data;
        }

        private Node<E> getNext() {
            return next;
        }

        private E getData() {
            return data;
        }

        @Override
        public String toString() {
            return "Node{" + "data=" + data + "}";
        }
    }
}
