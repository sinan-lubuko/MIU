package sale_and_discount;

public class Sale {
    protected String name;
    protected double price;

    public Sale() {
        this.name = "No name yet";
        this.price = 0.0;
    }

    public Sale(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Sale(Sale sale) { //copy constructor
        this.name = sale.name;
        this.price = sale.price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static void announcement(){

    }

    public double bill(){
        return price;
    }

    public boolean equalDeals(Sale otherSale){
        if(otherSale == null){
            System.out.println("Error: null object");
            System.exit(0);
        }
        return bill() == otherSale.price;
    }

    public boolean lessThan(Sale otherSale){
        if(otherSale == null){
            System.out.println("Error: null object");
            System.exit(0);
        }
        return bill() < otherSale.price;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Sale)){ //objects of same class
            return false;
        }
        Sale sale = (Sale) obj; //down casting o to Sale object
        return sale.price == this.price && sale.name.equals(this.name);
    }

    @Override
    public String toString() {
        return "Name= "+this.name + ", Price= "+this.price;
    }
}
