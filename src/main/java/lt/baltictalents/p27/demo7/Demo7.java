package lt.baltictalents.p27.demo7;

import javax.swing.*;
import java.awt.*;

public class Demo7 {

    private void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("SpringLayout");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        SpringLayout layout = new SpringLayout();
        panel.setLayout(layout);
        frame.add(panel);

        JLabel label = new JLabel("Label: ");
        panel.add(label);

        JTextField textField = new JTextField("Text field", 15);
        panel.add(textField);

        //Adjust constraints for the label so it's at (5,5).
        layout.putConstraint(SpringLayout.WEST, label,
                10,
                SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.NORTH, label,
                10,
                SpringLayout.NORTH, panel);

        //Adjust constraints for the text field so it's at
        //(<label's right edge> + 5, 5).
        layout.putConstraint(SpringLayout.WEST, textField,
                5,
                SpringLayout.EAST, label);
        layout.putConstraint(SpringLayout.NORTH, textField,
                5,
                SpringLayout.NORTH, panel);


        layout.putConstraint(SpringLayout.EAST, panel,
                5,
                SpringLayout.EAST, textField);
        layout.putConstraint(SpringLayout.SOUTH, panel,
                5,
                SpringLayout.SOUTH, textField);

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Demo7()::createAndShowGUI);
    }
}
