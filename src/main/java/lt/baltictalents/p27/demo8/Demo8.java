package lt.baltictalents.p27.demo8;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Demo8 {


    private void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("List data bindings");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        frame.getContentPane().setLayout(new BorderLayout());

        DefaultListModel<String> listModel = new DefaultListModel<>();
        for (int i = 0; i < 5; i++)  {
            listModel.addElement(String.valueOf(i));
        }

        JList<String> listComponent = new JList<>(listModel);
        JScrollPane scrollPane = new JScrollPane(listComponent);

        frame.getContentPane().add(scrollPane, BorderLayout.CENTER);

        JButton button = new JButton("Add");
        button.addActionListener((actionEvent) -> {
            button.setEnabled(false);
            SwingWorker worker = new SwingWorker() {

                List<String> strings = new ArrayList<>();

                @Override
                protected Object doInBackground() throws Exception {
                    for (int i = 0; i < 5; i++) {
                        Thread.sleep(1000);
                        strings.add("SwingWorker " + Math.round(Math.random() * 100));
                    }
                    return strings;
                }

                @Override
                public void done() {
                    strings.forEach((e) -> listModel.addElement(e));
                    button.setEnabled(true);
                }
            };

            worker.execute();

            listModel.addElement("New " + Math.round(Math.random() * 100));

        });

        frame.getContentPane().add(button, BorderLayout.PAGE_END);

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }


    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Demo8()::createAndShowGUI);
    }
}
