package Money;


public class Moneta {
    private int qty;
    private double value;

    public Moneta(int qty, double value) {
        this.qty = qty;
        this.value = value;
    }

    public int getQty() {
        return qty;
    }

    public void addQty(int qty) throws NoNegativeCashException {
        if (qty <= 0)
            throw new NoNegativeCashException();
        this.qty += qty;
    }

    public double getCash() throws NoMoreCashException {
        if (this.qty <= 0) {
            throw new NoMoreCashException();
        }

        this.qty--;
        return this.getValue();
    }

    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Moneta{" +
                "qty=" + qty +
                ", value=" + value +
                '}';
    }

    public boolean sameValue(Moneta moneta) {
        return this.value == moneta.value;
    }

    public class NoMoreCashException extends Exception {
    }

    public class NoNegativeCashException extends Exception {
    }
}
