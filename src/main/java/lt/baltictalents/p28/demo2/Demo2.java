//package lt.baltictalents.p28.demo2;
//
//import javafx.animation.*;
//import javafx.application.Application;
//import javafx.scene.Group;
//import javafx.scene.Scene;
//import javafx.scene.paint.Color;
//import javafx.scene.shape.Rectangle;
//import javafx.stage.Stage;
//import javafx.util.Duration;
//
//public class Demo2 extends Application {
//
//    @Override
//    public void start(Stage primaryStage) throws Exception {
//        Group root = new Group();
//        Scene scene = new Scene(root, 500, 500, Color.BLACK);
//
//        Rectangle r = new Rectangle(25,25,250,250);
//        r.setFill(Color.BLUE);
//        root.getChildren().add(r);
//
//        TranslateTransition translate = new TranslateTransition(Duration.millis(1000));
//        translate.setToX(330);
//        translate.setToY(330);
//
//        FillTransition fill = new FillTransition(Duration.millis(1000));
//        fill.setToValue(Color.RED);
//
//        RotateTransition rotate = new RotateTransition(Duration.millis(1000));
//        rotate.setToAngle(360);
//
//        ScaleTransition scale = new ScaleTransition(Duration.millis(1000));
//        scale.setToX(0.1);
//        scale.setToY(0.1);
//
//        ParallelTransition transition = new ParallelTransition(r, translate, fill, rotate, scale);
//        transition.setCycleCount(Timeline.INDEFINITE);
//        transition.setAutoReverse(true);
//        transition.setInterpolator(Interpolator.EASE_BOTH);
//        transition.play();
//
//
//        // show main scene
//        primaryStage.setTitle("JavaFX Scene Graph Demo");
//        primaryStage.setScene(scene);
//        primaryStage.show();
//    }
//}
