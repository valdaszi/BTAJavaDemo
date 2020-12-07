//package lt.baltictalents.p28.demo7;
//
//import javafx.application.Application;
//import javafx.application.Platform;
//import javafx.scene.Scene;
//import javafx.scene.control.Menu;
//import javafx.scene.control.MenuBar;
//import javafx.scene.control.MenuItem;
//import javafx.scene.control.SeparatorMenuItem;
//import javafx.scene.input.KeyCode;
//import javafx.scene.input.KeyCodeCombination;
//import javafx.scene.input.KeyCombination;
//import javafx.scene.layout.VBox;
//import javafx.scene.paint.Color;
//import javafx.stage.Stage;
//
//public class Demo7 extends Application {
//
//    @Override
//    public void start(Stage primaryStage) throws Exception {
//
//        primaryStage.setTitle("Menu Sample");
//        Scene scene = new Scene(new VBox(), 400, 350);
//        scene.setFill(Color.OLDLACE);
//
//        MenuBar menuBar = new MenuBar();
//
//        // --- Menu File
//        Menu menuFile = new Menu("File");
//        menuFile.getItems().add(new MenuItem("Open"));
//        menuFile.getItems().add(new MenuItem("Save"));
//        menuFile.getItems().add(new SeparatorMenuItem());
//
//        MenuItem menuExit = new MenuItem("Exit");
//        menuExit.setAccelerator(new KeyCodeCombination(KeyCode.X, KeyCombination.SHORTCUT_DOWN));
//        menuExit.setOnAction(e -> {
//            Platform.exit();
//        });
//
//        menuFile.getItems().add(menuExit);
//
//        // --- Menu Edit
//        Menu menuEdit = new Menu("Edit");
//
//        // --- Menu View
//        Menu menuView = new Menu("View");
//
//        menuBar.getMenus().addAll(menuFile, menuEdit, menuView);
//
//
//        ((VBox) scene.getRoot()).getChildren().addAll(menuBar);
//
//        primaryStage.setScene(scene);
//        primaryStage.show();
//    }
//}
