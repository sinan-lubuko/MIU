package Chapter5;

import javax.swing.*;

public class PersonAddress {
    private String firstName;
    private String lastName;
    private String email;
    private String telephoneNumber;

    public PersonAddress() {
        firstName = "unknown";
        lastName = "unknown";
        email = "test@miu.edu";
        telephoneNumber = "6414727000";
    }

    public PersonAddress(String firstName, String lastName, String email, String telephoneNumber) {
          this.firstName = firstName;
          this.lastName = lastName;
           this.email = email;
          this.telephoneNumber = telephoneNumber;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " " + email + " " + telephoneNumber;
    }

    public boolean phoneValidation() {
        String phoneNumber ="6414727000";
        if (phoneNumber.length() < 10) {
            this.telephoneNumber = phoneNumber;
            return true;
        } else
           this.telephoneNumber = "6414727000";
        System.out.println("invalid phonenumber");
        return false;
    }
        public boolean validationOfEmail (String emailAddress) {
                String mail = "derartu@miu.edu";
        boolean result;
        if (mail.contains("@") && mail.contains(".")) {
            this.email = mail;
            result = true;
        } else {
            this.email = "test@miu.edu";
            result = false;
        }
        return result;
        }

}