
import java.util.Scanner;

public class PhonebookUI {
    private static Phonebook phonebook;
    private static Scanner scanner;

    public PhonebookUI() {
        this.phonebook = new Phonebook();
        this.scanner = new Scanner(System.in);
    }
 
    public void addPerson() {
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Phone number: ");
        String phoneNumber = scanner.nextLine();
        phonebook.addPerson(new Person(name, phoneNumber));
    }

    public void listPeople() {
        for (Person person : phonebook.getPeople()) {
            System.out.println(person.getName() + " - " + person.getPhoneNumber());
        }
    }

    public void removePerson() {
        System.out.print("Name: ");
        String name = scanner.nextLine();
        for (Person person : phonebook.getPeople()) {
            if (person.getName().equals(name)) {
                phonebook.getPeople().remove(person);
                System.out.println("Removed " + name + " from the phonebook");
                return;
            }
        }
        System.out.println(name + " not found in the phonebook");
    }
    //public void run() {        
    public static void main(String[] args) {
        PhonebookUI phonebookUI = new PhonebookUI();
    
        while (true) {
            System.out.println("1. Add person");
            System.out.println("2. List people");
            System.out.println("3. Remove person");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    phonebookUI.addPerson();
                    break;
                case 2:
                    phonebookUI.listPeople();
                    break;
                case 3:
                    phonebookUI.removePerson();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}