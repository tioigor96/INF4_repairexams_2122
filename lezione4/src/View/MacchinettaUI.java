package View;

import javax.swing.*;

public class MacchinettaUI {
    private JTextField textField1;
    private JRadioButton vetro;
    private JRadioButton adamantio;
    private JRadioButton caffeRadioButton;
    private JRadioButton gintonicRadioButton;
    private JButton compraButton;
    private JButton restoButton;
    private JButton a200€Button;
    private JButton a100€Button;
    private JButton a050€Button;
    private JButton a020€Button;
    private JButton a010€Button;
    private JButton a05€Button;
    private JTextArea textArea1;
    private JPanel total;
    private JPanel interfaces;
    private JPanel logs;
    private JScrollPane scroll1;
    private JPanel credit;
    private ButtonGroup bg1, bg2;


    public MacchinettaUI() {
        bg1 = new ButtonGroup();
        bg1.add(vetro);
        bg1.add(adamantio);
        bg2 = new ButtonGroup();
        bg2.add(caffeRadioButton);
        bg2.add(gintonicRadioButton);
        this.textField1.setText("0.00 €");
    }

//    public static void main(String[] args) {
//        MacchinettaUI mui = new MacchinettaUI();
//        JFrame frame = new JFrame("MacchinettaUI");
//        frame.setContentPane(mui.total);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.pack();
//        frame.setVisible(true);
//    }

    public JTextField getTextField1() {
        return textField1;
    }

    public void setTextField1(JTextField textField1) {
        this.textField1 = textField1;
    }

    public JRadioButton getVetro() {
        return vetro;
    }

    public void setVetro(JRadioButton vetro) {
        this.vetro = vetro;
    }

    public JRadioButton getAdamantio() {
        return adamantio;
    }

    public void setAdamantio(JRadioButton adamantio) {
        this.adamantio = adamantio;
    }

    public JRadioButton getCaffeRadioButton() {
        return caffeRadioButton;
    }

    public void setCaffeRadioButton(JRadioButton caffeRadioButton) {
        this.caffeRadioButton = caffeRadioButton;
    }

    public JRadioButton getGintonicRadioButton() {
        return gintonicRadioButton;
    }

    public void setGintonicRadioButton(JRadioButton gintonicRadioButton) {
        this.gintonicRadioButton = gintonicRadioButton;
    }

    public JButton getCompraButton() {
        return compraButton;
    }

    public void setCompraButton(JButton compraButton) {
        this.compraButton = compraButton;
    }

    public JButton getRestoButton() {
        return restoButton;
    }

    public void setRestoButton(JButton restoButton) {
        this.restoButton = restoButton;
    }

    public JButton getA200€Button() {
        return a200€Button;
    }

    public void setA200€Button(JButton a200€Button) {
        this.a200€Button = a200€Button;
    }

    public JButton getA100€Button() {
        return a100€Button;
    }

    public void setA100€Button(JButton a100€Button) {
        this.a100€Button = a100€Button;
    }

    public JButton getA050€Button() {
        return a050€Button;
    }

    public void setA050€Button(JButton a050€Button) {
        this.a050€Button = a050€Button;
    }

    public JButton getA020€Button() {
        return a020€Button;
    }

    public void setA020€Button(JButton a020€Button) {
        this.a020€Button = a020€Button;
    }

    public JButton getA010€Button() {
        return a010€Button;
    }

    public void setA010€Button(JButton a010€Button) {
        this.a010€Button = a010€Button;
    }

    public JButton getA05€Button() {
        return a05€Button;
    }

    public void setA05€Button(JButton a05€Button) {
        this.a05€Button = a05€Button;
    }

    public JTextArea getTextArea1() {
        return textArea1;
    }

    public void setTextArea1(JTextArea textArea1) {
        this.textArea1 = textArea1;
    }

    public JPanel getTotal() {
        return total;
    }

    public void setTotal(JPanel total) {
        this.total = total;
    }

    public JPanel getInterfaces() {
        return interfaces;
    }

    public void setInterfaces(JPanel interfaces) {
        this.interfaces = interfaces;
    }

    public JPanel getLogs() {
        return logs;
    }

    public void setLogs(JPanel logs) {
        this.logs = logs;
    }

    public JScrollPane getScroll1() {
        return scroll1;
    }

    public void setScroll1(JScrollPane scroll1) {
        this.scroll1 = scroll1;
    }

    public JPanel getCredit() {
        return credit;
    }

    public void setCredit(JPanel credit) {
        this.credit = credit;
    }

    public ButtonGroup getBg1() {
        return bg1;
    }

    public void setBg1(ButtonGroup bg1) {
        this.bg1 = bg1;
    }

    public ButtonGroup getBg2() {
        return bg2;
    }

    public void setBg2(ButtonGroup bg2) {
        this.bg2 = bg2;
    }
}
