package Items;

public class BicchiereAdamantio extends Bicchiere {
    public BicchiereAdamantio(double capacity, String shape, double price) {
        super(capacity, false, shape, price);
    }

    public BicchiereAdamantio() {
        super(0.2, false, "triangolo", 2.00);
    }

    @Override
    public String getShape() {
        return null;
    }

    @Override
    public int compareTo(Bicchiere o) {
        if (o.getCapacity() == this.getCapacity()) {
            return 0;
        }
        if (o.getCapacity() < this.getCapacity()) {
            return 1;
        }
        return -1;
    }

    @Override
    public String toString() {
        return "Items.BicchiereAdamantio{" + super.toString() + "}";
    }
}
