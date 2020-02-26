package definition;

import java.util.Objects;

public class Person implements Comparable<Person>{
    private String firstName;
    private String lastName;
    private ContactList<Long> phoneNumber;
    private String email;

    public Person(String firstName, String lastName, ContactList<Long> phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public ContactList<Long> getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("-------- * -------- * -------- * --------\n");
        sb.append("First Name: ").append(firstName).append("\n");
        sb.append("Last Name: ").append(lastName).append('\n');
        if (phoneNumber.size() > 1) {
            for (int i = 0; i < phoneNumber.size() - 1; i++) {
                sb.append("Contact Number(s): ");
                sb.append(phoneNumber.get(i)).append(", ");
            }
            sb.append(phoneNumber.get(phoneNumber.size() - 1));
            sb.append("\n");
        } else
            sb.append("Contact Number: ").append(phoneNumber.get(phoneNumber.size() - 1)).append("\n");
        sb.append("Email: ").append(email).append('\n');
        sb.append("-------- * -------- * -------- * --------");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getFirstName().equals(person.getFirstName()) &&
                getLastName().equals(person.getLastName()) &&
                getPhoneNumber().equals(person.getPhoneNumber()) &&
                Objects.equals(getEmail(), person.getEmail());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getPhoneNumber(), getEmail());
    }

    @Override
    public int compareTo(Person person) {
        return this.getFirstName().compareTo(person.getFirstName());
    }
}
