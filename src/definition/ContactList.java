package definition;

import adt.ListADT;

public class ContactList<Person> implements ListADT<Person> {
    @Override
    public void add(Person element) {

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

        public Node(Node<E> next, E data) {
            this.next = next;
            this.data = data;
        }

        private Node<E> getNext() {
            return next;
        }

        private E getData() {
            return data;
        }
    }
}
