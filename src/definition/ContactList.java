package definition;

import adt.ListADT;

public class ContactList<E> implements ListADT<E> {
    private Node<E> head = null;
    private int size = 0;

    @Override
    public void add(E element) {
        add(size, element);
    }

    private void addFirst(E element) {
        head = new Node<>(head, null, element);
        size++;
    }

    private void addAfter(E element, Node<E> node) {
        node.setNext(new Node<>(node, null, element));
        size++;
    }

    private void add(int index, E element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException(Integer.toString(index));
        } else if (index == 0) {
            addFirst(element);
        } else {
            addAfter(element, getNode(size));
        }
    }

    /*
    private Node<E> getLastNode() {
        Node<E> temp = head;
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }
        return temp;
    }
    */
    public int size() {
        return size;
    }

    public E get(int index) {
        return getNode(index).getData();
    }

    private Node<E> getNode(int index) {
        Node<E> temp = head;
        for (int i = 0; i < index && temp.getNext() != null; i++) {
            temp = temp.getNext();
        }
        return temp;
    }

    @Override
    public void sort() {
        Node<E> temp = head;
        E data = temp.getData();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Node<E> temp = head;
        for (int i = 0; i < size; i++) {
            sb.append(temp.data).append("\n");
            temp = temp.getNext();
        }
        return sb.toString();
    }

    @Override
    public E remove(E element) {
        E data = head.getData();
        for (int i = 0; i < size; i++) {
            Node<E> temp = getNode(i);
            if (temp.getData().equals(element)) {
                data = remove(i, temp);
            }
        }
        return data;
    }

    public E remove(int index) {
        Node<E> temp = getNode(index);
        return remove(index, temp);
    }

    private E removeFirst() {
        Node<E> node = head;
        head = head.next;
        size--;
        return node.getData();
    }

    private E removeAfter(int index, Node<E> node) {
        Node<E> temp = getNode(index);
        temp.setNext(node.next);
        node.next = temp;
        size--;
        return node.getData();
    }

    private E remove(int index, Node<E> node) {
        if (index == 0) {
            return removeFirst();
        } else {
            return removeAfter(index - 1, node);
        }
    }

    @Override
    public int search(E element) {
        for (int i = 0; i < size; i++) {
            Node<E> temp = getNode(i);
            if (temp.getData().equals(element))
                return i + 1;
        }
        return -1;
    }

    private static class Node<E> {
        private Node<E> next;
        private Node<E> previous;
        private E data;

        private Node(Node<E> prev, Node<E> next, E data) {
            this.previous = prev;
            this.next = next;
            this.data = data;
        }

        private Node<E> getNext() {
            return next;
        }

        private void setNext(Node<E> next) {
            this.next = next;
        }

        private void setPrevious(Node<E> previous) {
            this.previous = previous;
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
