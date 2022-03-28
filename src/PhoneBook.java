import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class PhoneBook {
    //    В классе PhoneBook создадим HashMap:
    //    ключом для этой коллекции будет название группы,
//    а значением — список контактов (List<Contact>).
    private Map<String, List<Contact>> storage = new HashMap<>();


    public static Contact createConcact(String name, String phone) {
        return new Contact(name, phone);
    }

    //Создадим методы для добавления группы
    public boolean addGroup(String groupName) {
        if (storage.containsKey(groupName))
            return false;
        storage.put(groupName, new ArrayList<>());
        return true;
    }

    //и контакта в группы в классе PhoneBook.
    public boolean addContact(Contact contact, String... groupNames) {
        for (String groupName : groupNames) {
            if (!storage.containsKey(groupName)) return false;
            storage.get(groupName).add(contact);
        }
        return true;
    }

    //поиск контакта по группе
    public List<Contact> getAllByGroup(String groupName) {
        return storage.get(groupName);
    }

    //поиск контакта по номеру
    public Contact getByPhone(String phone) {
        for (List<Contact> listContact : storage.values()) {
            for (Contact contact : listContact) {
                if (contact.getPhone().equals(phone))
                    return contact;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, List<Contact>> group : storage.entrySet()) {
            sb

                    .append(group.getKey())
                    .append("\n");
            for (Contact contact : group.getValue()) {

                sb
                        .append("\t")
                        .append(contact)
                        .append("\n");

            }
        }
        return sb.toString();
    }
}
