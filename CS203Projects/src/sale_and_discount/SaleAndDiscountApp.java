package sale_and_discount;

public class SaleAndDiscountApp {

    public static void main(String[] args){
        Sale s1 = new Sale("Grand Sale", 10.5);
        Item item = new Item("Grand Sale", 10.5);
        DiscountSale ds = new DiscountSale(2.5);
        Sale sale = (Sale) ds;
        System.out.println(s1.equals(item));
        System.out.println(s1.toString());
    }
}
