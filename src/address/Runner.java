package address;

import java.util.Scanner;

/**
 * Runner class is a public type
 * Runner class contains main method
 * if condition is true
 * By using switchCase asking user to what task user needs to perform
 * option will be given to user to select an number
 * 1= adding contact details
 * 2=displaying contact details
 * 3=editing contact details
 * 4=deleting details
 */

public class Runner {

    public static void main(String[] args) {
        System.out.println("Welcome to the Address Book Problem");
        AddressBook adressBookImplementation = new AddressBook();
        boolean condition = true;

        while (condition == true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("1.add" + "\n" + "2.Display" + "\n" + "3.edit" + "\n" + "4.delete");
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
                case 4:
                    System.out.println("Enter the Name of the person do you wants to delete");
                    String name = scanner.nextLine();
                    adressBookImplementation.delete(name);
                    break;
                default:
                    System.out.println("Invalid Input");
            }
        }
    }

}