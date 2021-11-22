package Chapter5;

public class MainTestBook {
    public static void main(String []args){
        Book book1 = new Book("MyBook","Derartu",25.6, 10);
        Book book2 = new Book("programming","lemlem",20.5,5);

        book1.PriceOfBook(10.3,3);
        double pricebook1= book1.getPrice();
        System.out.println(pricebook1);
        book1.setPrice(5.6);
        System.out.println(book1.getPrice());
        System.out.println();
        book2.PriceOfBook(11.5,2);
        double book2price = book2.getPrice();
        System.out.println(book2price);
        book2.setPrice(15.3);
        System.out.println(book2.getPrice());
        book1.setQuantity(2);
        System.out.println(book1.getQuantity());
        book2.setQuantity(4);
        System.out.println(book2.getQuantity());
        book1.WriteOutput();
        book2.WriteOutput();
    }

}
