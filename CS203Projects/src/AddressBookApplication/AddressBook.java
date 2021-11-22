package AddressBookApplication;

import java.util.ArrayList;

public abstract class AddressBook {
     protected ArrayList<Contact> contacts;
     protected ArrayList<Address> addresses;
     protected String displayName;
     protected String note;

    public AddressBook(String displayName, String note) {
        this.displayName = displayName;
        this.note = note;
        contacts = new ArrayList<>();
        addresses = new ArrayList<>();
    }

    public ArrayList<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(ArrayList<Address> addresses) {
        this.addresses = addresses;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public ArrayList<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(ArrayList<Contact> contacts) {
        this.contacts = contacts;
    }

    @Override
    public String toString() {
        return "AddressBook{" +
                " \ncontact=" + contacts +
                ", \naddresses=" + addresses+
                ", \ndisplayName='" + displayName +
                ", \nnote='" + note +
                '}';
    }
}

