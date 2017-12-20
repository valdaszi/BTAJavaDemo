package lt.baltictalents.p27.demo2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;

public class Demo2 implements ActionListener {

    private JButton b1;
    private JButton b2;
    private JButton b3;

    private void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("Swing - buttons");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);

        b1 = new JButton("Disable middle button");
        b1.setMnemonic(KeyEvent.VK_D);
        b1.setActionCommand("disable");

        ImageIcon middleButtonIcon = new ImageIcon("src/main/java/lt/baltictalents/p27/exit-sign.png");
        b2 = new JButton("Middle button", middleButtonIcon);
        b2.setMnemonic(KeyEvent.VK_M);

        b3 = new JButton("Enable middle button");
        b3.setMnemonic(KeyEvent.VK_E);
        b3.setActionCommand("enable");
        b3.setEnabled(false);

        //Listen for actions on buttons 1 and 3.
        b1.addActionListener(this);
        b3.addActionListener(this);
        b2.addActionListener((actionEvent) ->
                frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING))
        );

        b1.setToolTipText("Click this button to disable the middle button.");
        b2.setToolTipText("This middle button close the app.");
        b3.setToolTipText("Click this button to enable the middle button.");

        panel.add(b1);
        panel.add(b2);
        panel.add(b3);

        JCheckBox checkBox = new JCheckBox("Enabled");
        checkBox.setSelected(b2.isEnabled());
        checkBox.addActionListener((actionEvent) -> {
            b2.setEnabled(checkBox.isSelected());
            b1.setEnabled(b2.isEnabled());
            b3.setEnabled(!b2.isEnabled());
        });

        panel.add(checkBox);

        JRadioButton radioButton1 = new JRadioButton("A", true);
        JRadioButton radioButton2 = new JRadioButton("B");
        JRadioButton radioButton3 = new JRadioButton("C");

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);
        buttonGroup.add(radioButton3);

        panel.add(radioButton1);
        panel.add(radioButton2);
        panel.add(radioButton3);

        ActionListener radioAction = (actionEvent) -> {
            b1.setEnabled(radioButton1.isSelected());
            b2.setEnabled(radioButton2.isSelected());
            b3.setEnabled(radioButton3.isSelected());
        };

        radioButton1.addActionListener(radioAction);
        radioButton2.addActionListener(radioAction);
        radioButton3.addActionListener(radioAction);

        JToggleButton toggleButton = new JToggleButton("Toggle");
        panel.add(toggleButton);

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if ("disable".equals(e.getActionCommand())) {
            b2.setEnabled(false);
            b1.setEnabled(false);
            b3.setEnabled(true);
        } else {
            b2.setEnabled(true);
            b1.setEnabled(true);
            b3.setEnabled(false);
        }
    }

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Demo2()::createAndShowGUI);
    }

}
