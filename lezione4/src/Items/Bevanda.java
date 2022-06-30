package Items;

public abstract class Bevanda implements Priceable {
    private String name;
    private double price;
    private int making_time_cost;
    private double quantity;

    public Bevanda(String name, double price, int making_time_cost, double quantity) {
        this.name = name;
        this.price = price;
        this.making_time_cost = making_time_cost;
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return this.name + "{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", making_time_cost=" + making_time_cost +
                ", quantity=" + quantity +
                '}';
    }

    public double getQuantity() {
        return quantity;
    }
}
