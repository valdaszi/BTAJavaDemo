package lt.baltictalents.p27.demo4;

import javax.swing.*;
import javax.swing.text.EditorKit;
import java.awt.*;
import java.io.IOException;
import java.net.URL;

public class Demo4 {

    private void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("Swing - text");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);

        JLabel label = new JLabel("Label");
        panel.add(label);

        JTextArea textArea = new JTextArea(5, 30);
        textArea.append("First line\n");
        textArea.append("Second long long long long line");
        panel.add(textArea);

        String[] data = {"one", "two", "three", "four"};
        JList<String> list = new JList<>(data);
        panel.add(list);

        JTextField textField = new JTextField("text field");
        textField.setPreferredSize(new Dimension(200, 50));
        panel.add(textField);

        JTextPane textPane = new JTextPane();
        textPane.setPreferredSize(new Dimension(400, 400));
        try {
            textPane.setPage(new URL("https://lt.wikipedia.org/wiki/Wiki"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        JScrollPane scrollPane = new JScrollPane(textPane);
        panel.add(scrollPane);


        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }


    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Demo4()::createAndShowGUI);
    }
}
