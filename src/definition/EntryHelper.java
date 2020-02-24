package definition;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EntryHelper {

    public Person addContact(Scanner scanner) {
        ArrayList<Long> contactNumber = new ArrayList<>();
        String flag = "y";
        System.out.println("Please enter the name of the Person");
        System.out.print("First Name: ");
        String firstName = scanner.next();
        System.out.print("Last Name: ");
        String lastName = scanner.next();
        while (flag.equals("y")) {
            System.out.print("Contact Number: ");
            contactNumber.add(scanner.nextLong());
            System.out.print("Would you like to add another contact number? (y/n): ");
            flag = scanner.next();
        }
        System.out.print("Would you like to add email address? (y/n): ");
        flag = scanner.next();
        scanner.nextLine();
        if (flag.equals("y")) {
            System.out.print("Email Address: ");
            return new Person(firstName, lastName, contactNumber, scanner.nextLine());
        }
        return new Person(firstName, lastName, contactNumber, null);
    }

    public String deleteContact(ArrayList<Person> arrayList, Scanner scanner) {
        System.out.println("Here are all your contacts: ");
        for (int i = 0; i < arrayList.size(); i++)
            System.out.println((i + 1) + ". " + arrayList.get(i).getFirstName() + " " + arrayList.get(i).getLastName());

        System.out.println("Press the number against the contact to delete it: ");
        Person p = arrayList.remove(scanner.nextInt() - 1);
        return p.getFirstName() + " " + p.getLastName();
    }

    public void showContacts(ArrayList<Person> arrayList) {
        Collections.sort(arrayList);
        System.out.println("---Here are all your contacts---");
        for (Person person : arrayList) {
            System.out.println(person);
        }
    }

    public void searchContact(ArrayList<Person> arrayList, String fName) {
        int count = 0;
        for (Person person : arrayList) {
            if (person.getFirstName().equals(fName))
                count++;
        }
        if (count > 0) {
            System.out.println(count + " match found!");
            for (Person person : arrayList) {
                if (person.getFirstName().equals(fName))
                    System.out.println(person);
            }
        } else
            System.out.println("NO RESULTS FOUND!");
    }

}
