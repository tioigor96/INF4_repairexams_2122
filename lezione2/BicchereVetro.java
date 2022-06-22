public class BicchereVetro extends Bicchiere {

    public BicchereVetro(double capacity, String shape, double price) {
        super(capacity, true, shape, price);
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
        return "BicchereVetro{" + super.toString() + "}";
    }
}
