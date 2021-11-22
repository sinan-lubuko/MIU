package Chapter5;

public class Book {
    public String title;
    public String author;
    public double price;
    public int  quantity;

    public Book(String title, String author, double price, int quantity) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
    }

    public double PriceOfBook(double price,int quantity){
        double totalPrice = price * quantity;
        return  totalPrice;
    }
    public void WriteOutput(){
        System.out.println("The title of the book is"  +""  +title);
        System.out.println("The author of the book is" +"" +author);
        System.out.println("The price of the book is"  +"" +price);
        System.out.println("The quantity of the book is" +"" +quantity);
    }

    public double getPrice() {
          return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}




