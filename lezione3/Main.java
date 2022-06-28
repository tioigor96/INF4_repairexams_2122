import Items.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Bicchiere[] vett = new Bicchiere[4];

        vett[0]=new BicchereVetro(.7, "tondo",2.5);
        vett[1]=new BicchiereVetroColorato(.5, "tondo",3, "bianco");
        vett[2]=new BicchereVetro(.6, "tondo",2.5);
        vett[3]=new BicchiereAdamantio(.2, "tondo",1000.5);

        for(int i=0; i< vett.length; i++){
            System.out.println(vett[i]);
        }
        System.out.println("=================");
        ArrayList<Bicchiere> bicchieri = new ArrayList<Bicchiere>(List.of(vett));
        Collections.sort(bicchieri);

        double totale=0;
        for(int i=0; i< bicchieri.size(); i++){
            System.out.println(bicchieri.get(i));
            totale+=bicchieri.get(i).getPrice();
        }
        System.out.println("=================");
        System.out.println("in totale hai: "+ totale + " € di bicchieri!");

        System.out.println("=================\n\n\nBEVANDE\n\n\n");

        try {
            Drinkable drink1 = new Drinkable(vett[0],new GinTonic());
//            Thread.sleep(drink1.making_time_cost);
            System.out.println("mi bevo il mio "+ drink1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            Drinkable drink2 = new Drinkable(vett[3],new GinTonic());
            System.out.println("mi bevo il mio "+ drink2);
            drink2 = new Drinkable(vett[2],new GinTonic());
            System.out.println("mi bevo il mio "+ drink2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("non servo più nessuno!!");
        }

    }
}
