//package lt.baltictalents.uzdaviniai;
//
//import javafx.application.Platform;
//import javafx.collections.FXCollections;
//import javafx.collections.ObservableList;
//import javafx.geometry.Insets;
//import javafx.geometry.Pos;
//import javafx.scene.Node;
//import javafx.scene.control.ListView;
//import javafx.scene.control.TextField;
//import javafx.scene.input.KeyCode;
//import javafx.scene.layout.GridPane;
//import javafx.scene.layout.HBox;
//import javafx.scene.layout.Pane;
//import javafx.scene.layout.VBox;
//import javafx.scene.text.Text;
//import lt.baltictalents.uzdaviniai.Utility.DataHolder;
//import lt.baltictalents.uzdaviniai.Utility.PostitParser;
//
//import java.net.MalformedURLException;
//import java.net.URISyntaxException;
//import java.util.ArrayList;
//import java.util.List;
//
//public class Gui {
//
//    private VBox canvasRow = new VBox();
//    private Pane canvas = new Pane(canvasRow);
//
//    private int countCol = 0;
//    private int countRow = 0;
//
//    public Gui()
//    {
//        canvasRow.setPadding(new Insets(25,10,0,20));
//        addFieldRow(1);
//        addFieldCol(1);
//    }
//
//    public void rowSpace(double val)
//    {
//        canvasRow.setSpacing(val);
//    }
//
//    public void colSpace(double val)
//    {
//        for(Node row:canvasRow.getChildren())
//        {
//            ((HBox) row).setSpacing(val);
//        }
//    }
//
//    public void addFieldCol(int totalColNeeded)
//    {
//        while(countCol<totalColNeeded)
//        {
//            for(Node row:canvasRow.getChildren())
//            {
//                ((HBox) row).getChildren().add(new AddressField().getField());
//            }
//            countCol++;
//        }
//    }
//
//    public void removeFieldCol(int totalColNeeded)
//    {
//        while(countCol>totalColNeeded)
//        {
//
//            for(Node row:canvasRow.getChildren())
//            {
//                ((HBox) row).getChildren().remove(((HBox) row).getChildren().size() - 1);
//            }
//            countCol--;
//        }
//    }
//
//    public void addFieldRow(int totalRowNeeded)
//    {
//        while(countRow<totalRowNeeded) {
//            HBox newRow = new HBox();
//            newRow.setSpacing(15);
//            for(int  i= 0; i<countCol;i++)
//            {
//                newRow.getChildren().add(new AddressField().getField());
//            }
//            canvasRow.getChildren().add(newRow);
//            countRow++;
//        }
//    }
//
//    public void removeFieldRow(int totalRowNeeded)
//    {
//        while(countRow>totalRowNeeded)
//        {
//            canvasRow.getChildren().remove(canvasRow.getChildren().size()-1);
//            countRow--;
//        }
//    }
//
//    public Node getGUI()
//    {
//        return canvas;
//    }
//
//    class AddressField{
//
//        TextField cityField= new TextField();
//        TextField streetField= new TextField();
//        TextField numberField= new TextField();
//        ObservableList<DataHolder.Data> list = FXCollections.observableArrayList();
//        List<DataHolder.Data> temp = new ArrayList<>();
//
//        AddressField()
//        {
//            setEvents(cityField);
//            setEvents(streetField);
//            setEvents(numberField);
//        }
//
//        private void setEvents(TextField field)
//        {
//            field.setOnKeyPressed(e -> {
//                if (e.getCode() == KeyCode.ENTER) {
//                    backgroundStuff();
//                }
//            });
//            field.focusedProperty().addListener((obs, oldVal, newVal) ->
//            {
//                if(!newVal)
//                {
//                    backgroundStuff();
//                }
//            });
//        }
//
//        void backgroundStuff()
//        {
//            if(hasFieldsValue()){
//                new Thread(()->{
//                    try {
//                        temp = new PostitParser().getInfo(getAddress()).getData();
//                    } catch (URISyntaxException | MalformedURLException e) {
//                        e.printStackTrace();
//                    }
//
//                    Platform.runLater(
//                            () -> {
//                                list.clear();
//                                list.addAll(temp);
//                            });
//                }).start();
//            }
//        }
//
//        GridPane getField()
//        {
//            GridPane grid = new GridPane();
//            ListView<DataHolder.Data> listView =  new ListView<>(list);
//            listView.setPrefHeight(250);
//
//            grid.setAlignment(Pos.TOP_LEFT);
//            grid.setPadding(new Insets(5, 5, 15, 0));
//            grid.setHgap(10);
//            grid.setVgap(10);
//            grid.add(new Text("Miestas"),0,0);
//            grid.add(cityField,1,0);
//
//            grid.add(new Text("Gatve"),0,1);
//            grid.add(streetField,1,1);
//
//            grid.add(new Text("Numeris"),0,2);
//            grid.add(numberField,1,2);
//            grid.add(listView,0,3,3,1);
//
//            return grid;
//        }
//
//        private boolean hasFieldsValue()
//        {
//            return (!cityField.getText().equals("") && !streetField.getText().equals("") && !numberField.getText().equals(""));
//        }
//
//        String getAddress()
//        {
//            return streetField.getText() + " " +numberField.getText() +" "+ cityField.getText();
//        }
//    }
//
//}
