package lt.baltictalents.p27.demo6;

import javax.swing.*;
import java.awt.*;

public class Demo6 {

    private void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("BoxLayout");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        JPanel panel = new JPanel();
        frame.add(panel);

        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));

        addButtons(panel);

        JPanel panelBottom = new JPanel();
        panelBottom.setLayout(new BoxLayout(panelBottom, BoxLayout.LINE_AXIS));

        panel.add(panelBottom);

        addButtons(panelBottom);


        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }

    private void addButtons(JPanel panel) {
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");

        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(b4);
        panel.add(b5);
    }

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Demo6()::createAndShowGUI);
    }

}
