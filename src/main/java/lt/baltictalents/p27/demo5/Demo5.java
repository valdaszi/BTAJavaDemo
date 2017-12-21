package lt.baltictalents.p27.demo5;

import javax.swing.*;
import java.awt.*;

public class Demo5 {

    private void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("BorderLayout");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new BorderLayout());
        frame.add(panel);

        JButton b1 = new JButton("Top");
        JButton b2 = new JButton("Left");
        JButton b3 = new JButton("Center");
        JButton b4 = new JButton("Right");
        JButton b5 = new JButton("Bottom");

        panel.add(b1, BorderLayout.PAGE_START);
        panel.add(b2, BorderLayout.LINE_START);
        panel.add(b3, BorderLayout.CENTER);
        panel.add(b4, BorderLayout.LINE_END);
        panel.add(b5, BorderLayout.PAGE_END);

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Demo5()::createAndShowGUI);
    }

}
