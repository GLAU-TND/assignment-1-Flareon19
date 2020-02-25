package adt;

public interface ListADT<Person> {

    void add(Person element);

    void sort();

    Person remove(Person element);

    int search(Person element);

}
