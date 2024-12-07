package Task1;

public class Clothing extends Product{
    Clothing(String name,int quantity , double price){
        super(name, quantity, price);
    }

    public double getPrice() {
        if (price>50){
            return (price - (price * 0.15));
        }
        return price;
    }
}
