import models.Contact;
import models.ContactManager;
import java.text.ParseException;
import java.util.Scanner;

public class Main {

    static ContactManager contactManager = new ContactManager();

    public static void main(String[] args) {
        manageContacts();
    }

    public static void manageContacts(){
        Scanner scan = new Scanner(System.in);
        boolean isLoopRunning = true;
        while(isLoopRunning){
            System.out.println("Type a to add contact\nType b to delete contact\nType c to get out of this window\nType d to display all the saved contacts");
            String userChoice = scan.nextLine().toLowerCase();
            switch (userChoice){
                case "a":
                    System.out.println("Please enter the name: ");
                    String name = scan.nextLine().toLowerCase();
                    System.out.println("Please enter the phoneNumber");
                    String phoneNumber = scan.nextLine();
                    System.out.println("please enter the date of birth mm/dd/yyyy");
                    String dateOFBirth = scan.nextLine();
                    try {
                        Contact contact = new Contact(name, phoneNumber,dateOFBirth);
                        contactManager.addContact(contact);
                    }
                    catch (ParseException pe){
                        System.out.println(pe.getMessage());
                    }
                    break;

                case "b":
                    System.out.println("Enter the name you want to delete the contact of ");
                    String nameOfContactToDelete = scan.nextLine().toLowerCase();
                    boolean isDeletionSuccessful = contactManager.removeContact(nameOfContactToDelete);
                    if (isDeletionSuccessful){
                        System.out.println("contact deletion successful");
                    }
                    else {
                        System.out.println("sorry such a contact does not exist");
                    }
                    break;

                case "c":
                    System.out.println("Thanks for using the contact manager");
                    isLoopRunning = false;
                    scan.close();
                    break;

                case "d":
                    System.out.println(contactManager.toString());
                    break;

                default:
                    System.out.println("sorry you have selected the wrong option");
            }

        }
    }
}
