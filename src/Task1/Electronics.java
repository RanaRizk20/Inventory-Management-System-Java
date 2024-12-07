package Task1;

public class Electronics extends Product {
    public Electronics(String name,int quantity , double price){
        super(name, quantity, price);
    }

    @Override
    public double getPrice() {
        if (quantity>5){
            return (price - (price * 0.1));
        }
        return price;
    }
}
