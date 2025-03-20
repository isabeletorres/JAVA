package entities;

public class Products {
    private String name;
    private double price;
    private int quantity;

    public Products(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
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

    public void setQuantity(int quantidade) {
        this.quantity = quantidade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double totalValueInStock(){
        return this.quantity * this.price;
    }

    public void addProducts(int quantity){
        this.quantity += quantity;
    }
    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }

    @Override
    public String toString() {
        return
                 name +
                ", $" + price +
                ", " + quantity +
                " units, Total: $"+
                totalValueInStock();
    }
}
