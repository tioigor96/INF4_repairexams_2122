package Items;

public class Drinkable implements Priceable {
    private Bicchiere bicchiere;
    private Bevanda bevanda;

    public Drinkable(Bicchiere bicchiere, Bevanda bevanda) throws Exception {
        if (bicchiere.getCapacity() < bevanda.getQuantity()) {
            throw new Exception("Impossibile contenere la bevanda nel bicchiere di "
                    + bicchiere.toString());
        }
        this.bicchiere = bicchiere;
        this.bevanda = bevanda;
    }

    @Override
    public double getPrice() {
        return this.bevanda.getPrice() + this.bicchiere.getPrice();
    }

    @Override
    public String toString() {
        return "\nDrinkable\n{\n" +
                "\tbicchiere=" + bicchiere +
                ",\n\tbevanda=" + bevanda +
                "\n}";
    }
}
