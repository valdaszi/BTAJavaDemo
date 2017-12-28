package lt.baltictalents.p28.demo3;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Demo3 extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Create the Text Nodes
        Text topText = new Text("Top");
        Text rightText = new Text("Right");
        Text bottomText = new Text("Bottom");
        Text leftText = new Text("Left");

        // Set the alignment of the Top Text to Center
        BorderPane.setAlignment(topText,Pos.TOP_CENTER);
        // Set the alignment of the Bottom Text to Center
        BorderPane.setAlignment(bottomText,Pos.BOTTOM_CENTER);
        // Set the alignment of the Left Text to Center
        BorderPane.setAlignment(leftText,Pos.CENTER_LEFT);
        // Set the alignment of the Right Text to Center
        BorderPane.setAlignment(rightText,Pos.CENTER_RIGHT);

        StackPane stackPane = new StackPane();
        stackPane.setAlignment(Pos.CENTER);
        stackPane.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));

        // Create a BorderPane with a Text node in each of the five regions
        BorderPane root = new BorderPane(stackPane, topText, rightText, bottomText, leftText);
        root.setPrefSize(400, 400);

        // Create the Scene
        Scene scene = new Scene(root);

        // Add the scene to the Stage
        primaryStage.setScene(scene);
        // Set the title of the Stage
        primaryStage.setTitle("A simple BorderPane Example");
        // Display the Stage
        primaryStage.show();
    }
}
