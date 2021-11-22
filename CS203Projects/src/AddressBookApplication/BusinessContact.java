package AddressBookApplication;

public class BusinessContact extends AddressBook implements Comparable<BusinessContact>{
    private String nameOfBusiness;

    public BusinessContact(String displayName, String note, String nameOfBusiness) {
        super(displayName, note);
        this.nameOfBusiness = nameOfBusiness;
    }

    public String getNameOfBusiness() {
        return nameOfBusiness;
    }

    public void setNameOfBusiness(String nameOfBusiness) {
        this.nameOfBusiness = nameOfBusiness;
    }

    @Override
    public int compareTo(BusinessContact o) {
        return this.nameOfBusiness.compareTo(o.nameOfBusiness);
    }

    @Override
    public String toString() {
        return "\nBusinessContact{" +
                super.toString()+
                ", \nnameOfBusiness='" + nameOfBusiness+
                '}';
    }
}
