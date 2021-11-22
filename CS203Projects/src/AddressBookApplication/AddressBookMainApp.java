package AddressBookApplication;

import java.util.ArrayList;

public class AddressBookMainApp {

    public static void main(String[] args){
        AddressBook ab1 = new PersonContact("Katty", "Teaching kids", "Katherine", "Smith");
        //add list of contacts and addresses to addressbook ab1
        ArrayList<Contact> contacts1 = new ArrayList<>();
        Contact phoneContact1 = new PhoneNumber("mobile", "12345678");
        Contact phoneContact2 = new PhoneNumber("home", "4567893");
        Contact emailContact = new Email("gmail", "katty@gmail.com");
        contacts1.add(phoneContact1);
        contacts1.add(phoneContact2);
        contacts1.add(emailContact);

        ab1.setContacts(contacts1);//setter

        ArrayList<Address> addresses1 = new ArrayList<>();
        Address address1 = new Address("123 Main st", "Fairfield", "IA", "52556");
        Address address2 = new Address("345 Main st", "Des Moines", "IA", "12345");
        addresses1.add(address1);
        addresses1.add(address2);
        ab1.setAddresses(addresses1);//setter


        AddressBook ab2 = new BusinessContact("Abc mouse", "Online learning platform", "ABC Mouse.com");
        //add list of contacts and addresses to addressbook ab2
        ArrayList<Contact> contact2 = new ArrayList<>();
        Contact phoneContactb1 = new PhoneNumber("mobile", "2022502799");
        Contact phoneContactb2 = new PhoneNumber("home", "45776833");
        Contact emailContactb = new Email("gmail", "Abcmouse@gmail.com");
        contact2.add(phoneContactb1);
        contact2.add(phoneContactb2);
        contact2.add(emailContactb);
        ab2.setContacts(contact2);//setter

        ArrayList<Address> AddressB = new ArrayList<>();
        Address addressb1 = new Address("malibu circle","fallschurch","Va","22046" );
        Address addressb2 = new Address("25 East","silverSpring","Md", "209401");
        AddressB.add(addressb1);
        AddressB.add(addressb2);
        ab2.setAddresses(AddressB);

        AddressBook ab3 = new BusinessContact("Everybody's Bank", "Online banking", "XYX Bank");
        //add list of contacts and addresses to addressbook ab3
        ArrayList<Contact> contact3 = new ArrayList<>();


        AddressBook ab4 = new PersonContact("Jossy", "Yoga Instructor", "Joseph", "Ellison");
        //add list of contacts and addresses to addressbook ab4

        AddressBookManager addressBookManager = new AddressBookManager();
        addressBookManager.addToAddressBook(ab1);
        addressBookManager.addToAddressBook(ab2);
        addressBookManager.addToAddressBook(ab3);
        addressBookManager.addToAddressBook(ab4);

        addressBookManager.showAllContacts();
        addressBookManager.showPersonContacts();
        addressBookManager.editAddressBook("Katty", "Katty Business Solutions");
        addressBookManager.editAddressBook("Abc mouse", "ABC Training");
        addressBookManager.removeFromAddressBook(ab4);
        addressBookManager.removeFromAddressBook(ab3);
        System.out.println();
        addressBookManager.showAllContacts();

        addressBookManager.removeByDisplayName("ABC Training");
        System.out.println();
        addressBookManager.showAllContacts();
    }
}
