package address;

import java.util.Scanner;

/**
 * Runner class is a public type
 * Runner class contains main method
 * Asking user whether they want to add the contact or delete the contact
 * if user gives wrong input, invalid input message will be displayed
 */

public class Runner {

    public static void main(String[] args) {
        System.out.println("Welcome to the Address Book Problem");
        AddressBook adressBookImplementation = new AddressBook();
        boolean condition = true;

        while (condition == true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("1.add" + "\n" + "2.Display" + "\n" + "3.edit");
            Scanner option = new Scanner(System.in);

            switch (option.nextInt()) {
                case 1:
                    adressBookImplementation.add();
                    break;
                case 2:
                    adressBookImplementation.display();
                    break;
                case 3:
                    adressBookImplementation.edit();
                    break;
                default:
                    System.out.println("Invalid Input");
            }
        }
    }

}