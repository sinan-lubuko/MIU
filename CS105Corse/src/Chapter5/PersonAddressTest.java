package Chapter5;

public class PersonAddressTest {
    public static void main(String []args){
        PersonAddress addressPerson1 = new PersonAddress("Derartu","Abdisa","dabdisa@miu.edu","2025603108");
        PersonAddress addressPerson2 = new PersonAddress("lemlem","fereja","lemlem@miu.edu","2025605432");
         addressPerson1.getEmail();
        System.out.println(addressPerson1.getEmail());
        addressPerson1.getFirstName();
        System.out.println(addressPerson1.getFirstName());
        addressPerson2.getFirstName();
        System.out.println(addressPerson2.getFirstName());
        addressPerson1.getTelephoneNumber();
        System.out.println(addressPerson1.getTelephoneNumber());
        addressPerson1.setEmail("Derartu.abdisa@yahoo.com");
        System.out.println(addressPerson1.getEmail());
        addressPerson2.setTelephoneNumber("2026503122");
        System.out.println(addressPerson2.getTelephoneNumber());
        String status =addressPerson1.toString();
        System.out.println(status);
        String status1 = addressPerson2.toString();
        System.out.println(status1);
        boolean valid  = addressPerson1.phoneValidation();
        System.out.println(valid);
        addressPerson2.setTelephoneNumber("2023451");
        System.out.println(addressPerson2.getTelephoneNumber());
        boolean valid1 = addressPerson2.phoneValidation();
        System.out.println(valid1);




    }

}
