package sale_and_discount;

public class DiscountSale extends Sale {

    private double discount;

    public DiscountSale(double discount) {
        this.discount = discount;
    }

    public DiscountSale(String name, double price, double discount) {
        super(name, price);
        this.discount = discount;
    }

    public double bill(){
        double fraction = discount/100;
        return (1 - fraction) * getPrice();
    }
}
