package game;

import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame {
    GamePanel panel;
    GameFrame() {
        panel = new GamePanel();
        this.add(panel);
        this.setTitle("Ping Pong Game");
        this.setResizable(false);
        this.setBackground(Color.black);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
