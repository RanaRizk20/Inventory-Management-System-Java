package Task1;

public class Product {
    protected String name;
    protected int quantity;
    protected double price;


    public Product(String name, int quantity , double price){
        this.name = name;
        this.quantity = quantity;
        this.price = price;

    }

    public double getPrice(){
        return price;
    }


    public String toString(){
        return "Name: " + name + ", Price: $" + price + ", Quantity: " + quantity
                + ", Discounted Price: $" + getPrice();
    }
}
