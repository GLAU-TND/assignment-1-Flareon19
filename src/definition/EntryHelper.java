package definition;

import java.util.Scanner;

public class EntryHelper {

    public Person addContact(Scanner scanner) {
        ContactList<Long> contactNumber = new ContactList<>();
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

    public String deleteContact(ContactList<Person> arrayList, Scanner scanner) {
        System.out.println("Here are all your contacts: ");
        for (int i = 0; i < arrayList.size(); i++)
            System.out.println((i + 1) + ". " + arrayList.get(i).getFirstName() + " " + arrayList.get(i).getLastName());

        System.out.println("Press the number against the contact to delete it: ");
        Person p = arrayList.remove(scanner.nextInt() - 1);
        return p.getFirstName() + " " + p.getLastName() + "'s contact deleted from list!";
    }

    public void showContacts(ContactList<Person> arrayList) {
        //Collections.sort(arrayList);
        System.out.println("---Here are all your contacts---");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }

    public void searchContact(ContactList<Person> arrayList, String fName) {
        int count = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getFirstName().equals(fName))
                count++;
        }
        if (count > 0) {
            System.out.println(count + " match found!");
            for (int i = 0; i < arrayList.size(); i++) {
                if (arrayList.get(i).getFirstName().equals(fName))
                    System.out.println(arrayList.get(i));
            }
        } else
            System.out.println("NO RESULTS FOUND!");
    }

}
