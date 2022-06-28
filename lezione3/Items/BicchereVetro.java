package Items;

public class BicchereVetro extends Bicchiere {

    public BicchereVetro(double capacity, String shape, double price) {
        super(capacity, true, shape, price);
    }

    public BicchereVetro() {
        super(0.5,true,"tondo",5.00);

    }

    public BicchereVetro(String shape){
        super(0.5,true,shape,5.00);
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
        return "Items.BicchereVetro{" + super.toString() + "}";
    }
}
