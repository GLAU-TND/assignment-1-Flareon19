package definition;

import java.util.ArrayList;

public class Person {
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
}
