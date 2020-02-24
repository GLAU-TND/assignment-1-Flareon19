package definition;

import java.util.ArrayList;

public class Person implements Comparable<Person>{
    private String firstName;
    private String lastName;
    private ArrayList<Long> phoneNumber;
    private String email;

    public Person(String firstName, String lastName, ArrayList<Long> phoneNumber, String email) {
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

    public ArrayList<Long> getPhoneNumber() {
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
        sb.append("Contact Number(s): ").append(phoneNumber).append("\n");
        sb.append("Email: ").append(email).append('\n');
        sb.append("-------- * -------- * -------- * --------");
        return sb.toString();
    }

    @Override
    public int compareTo(Person o) {
        return this.getFirstName().compareTo(o.getFirstName());
    }
}
