import Items.*;
import View.MacchinettaUI;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MacchinettaUI mui = new MacchinettaUI();
        JFrame frame = new JFrame("MacchinettaUI");
        frame.setContentPane(mui.getTotal());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        new Controller(mui);

    }
}
