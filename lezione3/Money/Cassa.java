package Money;

import java.util.ArrayList;
import java.util.Iterator;

public class Cassa {
    private ArrayList<Moneta> cassa;

    public Cassa() {
        this.cassa = new ArrayList<>();
        this.cassa.add(new Moneta(10, 0.05));
        this.cassa.add(new Moneta(10, 0.10));
        this.cassa.add(new Moneta(10, 0.20));
        this.cassa.add(new Moneta(10, 0.50));
        this.cassa.add(new Moneta(10, 1.00));
        this.cassa.add(new Moneta(10, 2.00));
    }

    public void addMoney(Moneta m) throws Moneta.NoNegativeCashException {
        for (Iterator<Moneta> it = this.cassa.iterator(); it.hasNext(); ) {
            Moneta monetacassa = it.next();
            if (monetacassa.sameValue(m)) {
                monetacassa.addQty(m.getQty());
                return;
            }
        }
//        for(Moneta monetacassa : this.cassa){
//            if (monetacassa.sameValue(m)) {
//                monetacassa.addQty(m.getQty());
//                return;
//            }
//        }
    }

    public ArrayList<Moneta> getChange(double cost, double credit){
        //TODO: CALCOLATE COME OTTENERE IL RESTO CON IL MINIMO NUMERO DI MONETE!
        return new ArrayList<Moneta>();
    }
}
