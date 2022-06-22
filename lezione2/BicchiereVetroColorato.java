public class BicchiereVetroColorato extends BicchereVetro {
    private String color;

    public BicchiereVetroColorato(double capacity, String shape, double price, String color) {
        super(capacity, shape, price);
        this.color = color;
    }

    @Override
    public String toString() {
        return "BicchiereVetroColorato{" +
                "color='" + color + '\'' +
                super.toString() +
                '}';
    }

    /*
    principio di LISKOV:

    rettangolo extends figGeom{
        l1, l2, l3, l4;

        setl1, setl2, setl3, setl4;

        perimetrorettangolo(){
            super.perimetro();
        }
    }

    quadrato extends rettangolo{
        setl1(l){
            setl2(l)
            setl3(l)
            setl4(l)
        }
    }


    quadrato q1=new quadrato();
            ...
    rettangolo r1 = (rettangolo)q1; //qui rompo tutto!

     */
}
