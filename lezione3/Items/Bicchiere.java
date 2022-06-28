package Items;

public abstract class Bicchiere implements Comparable<Bicchiere>, Priceable {
    private double capacity;
    private boolean breakable;
    private String shape;
    private double price;

    public Bicchiere(double capacity, boolean breakable, String shape, double price) {
        this.capacity = capacity;
        this.breakable = breakable;
        this.shape = shape;
        this.price = price;
    }

    public boolean isBreakable() {
        return breakable;
    }

    public abstract String getShape();

    public double getCapacity() {
        return capacity;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "capacity=" + capacity +
                ", breakable=" + breakable +
                ", shape='" + shape + '\'' +
                ", price=" + price + " €";
    }
}
