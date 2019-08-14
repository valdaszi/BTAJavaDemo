package lt.baltictalents.uzdaviniai;

import com.google.gson.Gson;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.concurrent.ExecutionException;

public class Main implements ActionListener {

    private int kiek = 3;
    private String[] labels = new String[] {"Gatvė", "Numeris", "Miestas"};
    private String[] pvz = new String[] {"Jakšto g.", "6", "Kaunas"};
    private JTextArea[] textArea = new JTextArea[kiek];
    private JTextField[][] textField = new JTextField[kiek][labels.length];


    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Main()::createAndShowGUI);
    }

    private void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("Paškodų atradėjas");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        JPanel[] innerPanel = new JPanel[kiek];
        frame.add(mainPanel);

        mainPanel.setLayout(new GridLayout(2, kiek,10,10));

        for (int i = 0; i < kiek; i++) {

            int numPairs = labels.length;

            //Create and populate the panel.
            innerPanel[i] = new JPanel(new SpringLayout());
            mainPanel.add(innerPanel[i]);
            for (int j = 0; j < numPairs; j++) {
                JLabel l = new JLabel(labels[j], JLabel.TRAILING);
                innerPanel[i].add(l);
                textField[i][j] = new JTextField(pvz[j],15);
                textField[i][j].setActionCommand("" + i);
                textField[i][j].addActionListener(this);
                l.setLabelFor(textField[i][j]);
                innerPanel[i].add(textField[i][j]);
            }

            //Lay out the panel.
            SpringUtilities.makeCompactGrid(innerPanel[i],
                    numPairs, 2, //rows, cols
                    6, 6,        //initX, initY
                    6, 6);       //xPad, yPad
        }
        for (int i = 0; i < kiek; i++) {
            textArea[i] = new JTextArea();
            textArea[i].setEditable(false);
            textArea[i].setText("blablabla");
            mainPanel.add(textArea[i]);
        }


        //Display the window.
        frame.pack();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);
        frame.setVisible(true);
    }

    private static String getPostCode(String gatve, String numeris, String miestas) {
        String adresas = gatve + " " + numeris + " " + miestas;

        StringBuilder sb = new StringBuilder();

        URI uri = null;
        try {
            uri = new URI("https",
                    "postit.lt",
                    "/data",
                    //                "address=K.Baršausko g. 59, Kaunas",
                    "address=" + adresas,
                    null);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

        System.out.println(uri);

        URL url = null;
        try {
            url = uri.toURL();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        try ( BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8")) ) {
            String atsakymas;
            while ((atsakymas = in.readLine()) != null) {
                sb.append(atsakymas);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        String postitATS = sb.toString();

        Gson gson = new Gson();
        Postit postit = gson.fromJson(postitATS, Postit.class);
        System.out.println(postitATS);

        String eiluteSuKodu = "";
        if (postit.getTotal() != 0) {
            if (postit.getTotal() > 1) {
                eiluteSuKodu += "Rasti " + postit.getTotal() + " adresai, atitinkantys paiešką.\nGal šic tix:\n";
            }
            eiluteSuKodu += postit.getData().get(0).toString();
        } else {
            eiluteSuKodu = "Nieko nerasta.\nKažką reik patikslint";
        }

        System.out.println(eiluteSuKodu);

        return eiluteSuKodu;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int b = Integer.parseInt(e.getActionCommand());
        textArea[b].setText("Pala, reik pagalvot...");
        SwingWorker<String, Object> worker = new SwingWorker<String, Object>() {
            @Override
            protected String doInBackground() throws Exception {
                return getPostCode(textField[b][0].getText(), textField[b][1].getText(), textField[b][2].getText());
            }

            @Override
            protected void done() {
                try {
                    textArea[b].setText(get());
                } catch (InterruptedException | ExecutionException e1) {
                    e1.printStackTrace();
                }
            }
        };
        worker.execute();
    }
}


