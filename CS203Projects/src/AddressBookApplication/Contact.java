package AddressBookApplication;

public abstract class Contact {
    protected String type;
    protected String value;

    public Contact(String type, String value) {
        this.type = type;
        this.value = value;
    }

    @Override
    public String toString() {
        return "\nContact{" +
                "type='" + type + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
