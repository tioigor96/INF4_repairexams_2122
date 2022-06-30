import Items.*;
import Money.Cassa;
import Money.Moneta;
import View.MacchinettaUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Controller implements ActionListener {
    private MacchinettaUI macchinettaUI;
    private Cassa cassa;
    private double credit;

    public Controller(MacchinettaUI macchinettaUI) {
        this.macchinettaUI = macchinettaUI;
        this.cassa = new Cassa();
        this.credit = 0;
        this.macchinettaUI.getA05€Button().addActionListener(this);
        this.macchinettaUI.getA010€Button().addActionListener(this);
        this.macchinettaUI.getA020€Button().addActionListener(this);
        this.macchinettaUI.getA050€Button().addActionListener(this);
        this.macchinettaUI.getA100€Button().addActionListener(this);
        this.macchinettaUI.getA200€Button().addActionListener(this);
        this.macchinettaUI.getCompraButton().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.gestisciCredito(e);
        this.gestisciCaffe(e);
        this.gestisciResto(e);
    }

    private void gestisciResto(ActionEvent e) {
        if(e.getSource() == this.macchinettaUI.getRestoButton()){
            //TODO: gestisci la restituzione del credito!!
        }
    }

    private void gestisciCaffe(ActionEvent e) {
        try {
            if (e.getSource() == this.macchinettaUI.getCompraButton()) {
                Bevanda bevanda = null;
                Bicchiere bicchiere = null;
                if (this.macchinettaUI.getBg2().getSelection() == this.macchinettaUI.getCaffeRadioButton().getModel()) {
                    bevanda = new Caffe();
                }
                if (this.macchinettaUI.getBg2().getSelection() == this.macchinettaUI.getGintonicRadioButton().getModel()) {
                    bevanda = new GinTonic();
                }

                if (this.macchinettaUI.getBg1().getSelection() == this.macchinettaUI.getAdamantio().getModel()) {
                    bicchiere = new BicchiereAdamantio();
                }
                if (this.macchinettaUI.getBg1().getSelection() == this.macchinettaUI.getVetro().getModel()) {
                    bicchiere = new BicchereVetro();
                }

                if (bicchiere == null || bevanda == null) {
                    JOptionPane.showConfirmDialog(null,
                            "Non hai selezionato " + (bicchiere == null ? "il bicchiere!" : "la bevanda!"),
                            "Compra bevanda",
                            JOptionPane.WARNING_MESSAGE);
                    return;
                }


                Drinkable drink = new Drinkable(bicchiere, bevanda);
                if (credit <= drink.getPrice()) {
                    throw new ArithmeticException("Credito insufficiente!");
                }

                ArrayList<Moneta> resto=this.cassa.getChange(drink.getPrice(),this.credit);
                String str=drink.toString()+"\n";

                for(Moneta mre : resto){
                    str+=mre.toString()+"\n";
                }

                this.macchinettaUI.getTextArea1().append(str);

            }
        } catch (ArithmeticException exception) {
            JOptionPane.showConfirmDialog(null,
                    exception.getMessage(),
                    "Compra bevanda",
                    JOptionPane.WARNING_MESSAGE);
            return;
        } catch (Exception exception) {
            JOptionPane.showConfirmDialog(null,
                    "La bevanda selezionata non è compatibile con il bicchiere selezionato!",
                    "Compra bevanda",
                    JOptionPane.WARNING_MESSAGE);
            return;
        } /*catch (Moneta.NoMoreCashException exception){
            JOptionPane.showConfirmDialog(null,
                    "non posso generare il resto! ti ridò il tuo credito.",
                    "Compra bevanda",
                    JOptionPane.WARNING_MESSAGE);
            try {
                this.cassa.getChange(this.credit,this.credit);
            } catch (Moneta.NoNegativeCashException ex) {
            } catch (Moneta.NoMoreCashException ex) {
            }
            return;
        }*/
    }


    private void gestisciCredito(ActionEvent e) {
        if (e.getSource() == this.macchinettaUI.getA200€Button()) {
            this.credit += 2;
            try {
                this.cassa.addMoney(new Moneta(1, 2.0));
            } catch (Moneta.NoNegativeCashException ex) {
            }
            this.macchinettaUI.getTextField1().setText(this.credit + " €");
            return;
        }
        if (e.getSource() == this.macchinettaUI.getA100€Button()) {
            this.credit += 1;
            try {
                this.cassa.addMoney(new Moneta(1, 1.0));
            } catch (Moneta.NoNegativeCashException ex) {
            }
            this.macchinettaUI.getTextField1().setText(this.credit + " €");
        }
        if (e.getSource() == this.macchinettaUI.getA050€Button()) {
            this.credit += 0.5;
            try {
                this.cassa.addMoney(new Moneta(1, 0.5));
            } catch (Moneta.NoNegativeCashException ex) {
            }
            this.macchinettaUI.getTextField1().setText(this.credit + " €");
        }
        if (e.getSource() == this.macchinettaUI.getA020€Button()) {
            this.credit += 0.2;
            try {
                this.cassa.addMoney(new Moneta(1, .2));
            } catch (Moneta.NoNegativeCashException ex) {
            }
            this.macchinettaUI.getTextField1().setText(this.credit + " €");
        }
        if (e.getSource() == this.macchinettaUI.getA010€Button()) {
            this.credit += 0.1;
            try {
                this.cassa.addMoney(new Moneta(1, .10));
            } catch (Moneta.NoNegativeCashException ex) {
            }
            this.macchinettaUI.getTextField1().setText(this.credit + " €");
        }
        if (e.getSource() == this.macchinettaUI.getA05€Button()) {
            this.credit += 0.05;
            try {
                this.cassa.addMoney(new Moneta(1, 0.05));
            } catch (Moneta.NoNegativeCashException ex) {
            }
            this.macchinettaUI.getTextField1().setText(this.credit + " €");
        }
    }
}
