package week888.swing;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Артем on 16.07.2016.
 */
public class MainFrame extends JFrame {
    JProgressBar bar;

    public MainFrame() throws InterruptedException {

        setTitle("Main Frame");
        setSize(600, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        bar = new JProgressBar();
        bar.setMinimum(0);
        bar.setMaximum(100);
        add(bar);
        pack();
        setVisible(true);
        for (int i = 0; i <= bar.getMaximum(); i++) {
            Thread.sleep(50);
            bar.setValue(i);
            System.out.println(bar.getValue());

        }
    }
}
