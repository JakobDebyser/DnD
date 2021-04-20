package domain.map;

import javax.swing.*;
import java.awt.*;

public class Combat extends JFrame {

    public Combat() {

        initUI();
    }

    private void initUI() {

        add(new Board());

        setResizable(false);
        pack();

        setTitle("Field of Generix");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main() {

        EventQueue.invokeLater(() -> {
            JFrame ex = new Combat();
            ex.setVisible(true);
        });
    }
}
