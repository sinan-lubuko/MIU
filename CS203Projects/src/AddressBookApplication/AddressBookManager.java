package AddressBookApplication;

import java.util.ArrayList;
import java.util.Collections;

public class AddressBookManager {

    ArrayList<AddressBook> addressBook = new ArrayList<>();

    public void showAllContacts() {
        for (int i = 0; i < addressBook.size(); i++) {
            System.out.println(addressBook.get(i));
            /*System.out.println();
            System.out.println("DisplayName: "+addressBook.get(i).getDisplayName());
            System.out.println("Note: "+addressBook.get(i).getNote());
            System.out.println("Contacts: "+addressBook.get(i).getContacts());
            System.out.println("Addresses: "+addressBook.get(i).getAddresses());*/
        }

    }

    public void showPersonContacts() {
        for (int i = 0; i < addressBook.size(); i++) {
            if (addressBook.get(i) instanceof PersonContact) {
                System.out.println(addressBook.get(i));
            }
        }
    }

    public void showBusinessContacts() {
        for (int i = 0; i < addressBook.size(); i++) {
            if (addressBook.get(i) instanceof BusinessContact) {
                System.out.println(addressBook.get(i));
            }
        }
    }

    public ArrayList<BusinessContact> getBusinessContacts() {
        ArrayList<BusinessContact> businessContacts = new ArrayList<>();
        for (int i = 0; i < addressBook.size(); i++) {
            if (addressBook.get(i) instanceof BusinessContact) {
                businessContacts.add((BusinessContact) addressBook.get(i));
            }
        }
        return businessContacts;
    }

    public void showBusinessContactSorted() {
        ArrayList<BusinessContact> contacts = getBusinessContacts();
        Collections.sort(contacts);
        for (AddressBook a : contacts) {
            // a -> a business contact
            System.out.println("Business Name: " + ((BusinessContact) a).getNameOfBusiness());
            System.out.println("Display Name: " + ((BusinessContact) a).getDisplayName());
            System.out.println("Note: " + ((BusinessContact) a).getNote());
            //address
            //contacts
            //System.out.println("Name of Business: "+((BusinessContact)a).getNameOfBusiness());
        }
    }
   public void addToAddressBook(AddressBook a) {
        addressBook.add(a);
    }

    public void editAddressBook(String displayName, String newName) {
        for (int i = 0; i < addressBook.size(); i++) {
            if (addressBook.get(i).getDisplayName().equals(displayName)) {
                addressBook.get(i).setDisplayName(newName);
            }
        }
    }

    public void removeFromAddressBook(AddressBook ab) {
        addressBook.remove(ab);
    }

    public void removeByDisplayName(String displayName) {
        int index = -1;
        for (int i = 0; i < addressBook.size(); i++) {
            if (addressBook.get(i).getDisplayName().equals(displayName)) {
                index = i;
            }
        }
        if (index != -1) {
            addressBook.remove(index);
        }

    }
}






