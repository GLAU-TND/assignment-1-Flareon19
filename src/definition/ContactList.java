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

        public Node<E> getNext() {
            return next;
        }

        public E getData() {
            return data;
        }
    }
}
