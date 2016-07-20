package week888.swing;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Артем on 16.07.2016.
 */
public class _02Layout {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("My frame");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
      frame.setLayout(new BorderLayout());
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null);
       JPanel panel = new JPanel();
        panel.setBackground(Color.CYAN);
        JPanel panel2 = new JPanel();
        panel.setBackground(Color.YELLOW);
        JPanel panel3 = new JPanel();
        panel.setBackground(Color.GREEN);
        JPanel panel4 = new JPanel();
        panel.setBackground(Color.RED);
        JPanel panel5 = new JPanel();
        panel.setBackground(Color.WHITE);

        frame.add(panel, BorderLayout.CENTER);
        frame.add(panel2, BorderLayout.NORTH);
        frame.add(panel3, BorderLayout.WEST);
        frame.add(panel4, BorderLayout.SOUTH);
        frame.add(panel5, BorderLayout.EAST);

        frame.setVisible(true);
    }
}
