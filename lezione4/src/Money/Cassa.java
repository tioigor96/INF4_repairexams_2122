package Money;

import java.util.ArrayList;
import java.util.Iterator;
import Money.Moneta.*;

public class Cassa {
    private ArrayList<Moneta> cassa;

    public Cassa() {
        this.cassa = new ArrayList<>();
        this.cassa.add(new Moneta(10, 2.00));
        this.cassa.add(new Moneta(10, 1.00));
        this.cassa.add(new Moneta(10, 0.50));
        this.cassa.add(new Moneta(10, 0.20));
        this.cassa.add(new Moneta(10, 0.10));
        this.cassa.add(new Moneta(10, 0.05));
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

    public ArrayList<Moneta> getChange(double cost, double credit) throws Moneta.NoNegativeCashException, Moneta.NoMoreCashException {
        double toElab = credit - cost;
        ArrayList<Moneta> arlimo = this.cassa;

        for (Moneta mre : this.cassa) {
            while ((toElab % mre.getValue()) == 0) {
                    mre.addQty(1);
                    toElab = toElab - mre.getValue();

            }
            //5 centsimi
            if ((mre.getValue() == 0.05) && ((toElab % mre.getValue()) == 0)) {
                mre.addQty(1);
            }
        }

//        if(toElab >0)
//            throw new NoMoreCashException();

        return arlimo;
    }
}