package definition;

import java.util.ArrayList;
import java.util.Scanner;

public class EntryHelper {

    public boolean addContact(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Long> contactNumber = new ArrayList<>();
        String flag = "y";
        System.out.println("Please enter the name of the Person");
        System.out.print("First Name: ");
        String firstName = scanner.next();
        System.out.print("Last Name: ");
        String lastName = scanner.next();
        while (flag.equals("y")) {
            System.out.println("Contact Number: ");
            contactNumber.add(scanner.nextLong());
            System.out.println("Would you like to add another contact number? (y/n): ");
            flag = scanner.next();
        }
        System.out.println("Would you like to add email address? (y/n): ");
        flag = scanner.next();
        scanner.nextLine();
        if (flag.equals("y")){
            Person person = new Person(firstName,lastName,contactNumber,scanner.nextLine());
            scanner.close();
            return true;
        }
        Person person = new Person(firstName, lastName, contactNumber, null);
        scanner.close();
        return true;
    }

    public boolean deleteContact(Person person){
        System.out.println("Here are all your contacts: ");
        System.out.println(person.getFirstName()+" "+person.getLastName());

        return true;
    }

}
