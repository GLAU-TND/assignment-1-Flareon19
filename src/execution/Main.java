package execution;

import definition.EntryHelper;
import definition.Person;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Person> contacts = new ArrayList<>();
        EntryHelper entryHelper = new EntryHelper();
        System.out.print("Welcome to Contact List App\n");
        while (true) {
            System.out.println("Press 1 to add a new contact\n" +
                    "Press 2 to view all contacts\n" +
                    "Press 3 to search for a contact\n" +
                    "Press 4 to delete a contact\n" +
                    "Press 5 to exit program ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("You have chosen to add a new contact: ");
                    contacts.add(entryHelper.addContact(scanner));
                    break;
                }
                case 2: {
                    if (contacts.size() > 0)
                        entryHelper.showContacts(contacts);
                    else
                        System.out.println("No contacts to show!\n");
                    break;
                }
                case 3: {
                    System.out.println("You could search for a contact from their first names: \n");
                    entryHelper.searchContact(contacts, scanner.next());
                    break;
                }
                case 4: {
                    if (contacts.size() > 0)
                        System.out.println(entryHelper.deleteContact(contacts, scanner));
                    else
                        System.out.println("No contacts found!");
                    break;
                }
                case 5: {
                    scanner.close();
                    System.exit(1);
                    break;
                }
                default:
                    System.out.println("Invalid Selection! Please try again:");
            }
        }
    }
}
