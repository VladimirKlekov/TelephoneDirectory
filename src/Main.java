public class Main {

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        fillGroups(phoneBook);
        fillContacs(phoneBook);
        System.out.println(phoneBook);


    }

    public static void fillContacs(PhoneBook phoneBook) {
        phoneBook.addContact(
                PhoneBook.createConcact("Василий", "+79212122121"), "Друзья");
        phoneBook.addContact(
                PhoneBook.createConcact("Коля", "+79212122222"), "Друзья", "Работа");
        phoneBook.addContact(
                PhoneBook.createConcact("Леша", "+79212122223"), "Семья", "Друзья");
    }

    public static void fillGroups(PhoneBook phoneBook) {
        phoneBook.addGroup("Семья");
        phoneBook.addGroup("Друзья");
        phoneBook.addGroup("Работа");
        phoneBook.addGroup("VIP");

    }
}
