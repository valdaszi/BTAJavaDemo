//package lt.baltictalents.p28.demo8;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.net.MalformedURLException;
//import java.net.URL;
//import javafx.application.Application;
//import javafx.application.Platform;
//import javafx.beans.property.SimpleStringProperty;
//import javafx.beans.property.StringProperty;
//import javafx.concurrent.Service;
//import javafx.concurrent.Task;
//import javafx.concurrent.WorkerStateEvent;
//import javafx.event.ActionEvent;
//import javafx.event.EventHandler;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.layout.StackPane;
//import javafx.scene.layout.VBox;
//import javafx.scene.text.Text;
//import javafx.stage.Stage;
//
//public class Demo8 extends Application {
//
//    StringBuffer string = new StringBuffer("A");
//
//    @Override
//    public void start(Stage primaryStage) throws Exception {
//
//        primaryStage.setTitle("Hello World!");
//        Button btn = new Button();
//        btn.setText("Get");
//
//        Text text = new Text(string.toString());
//
//        btn.setOnAction(e -> {
//
//            FirstLineService service = new FirstLineService();
//            service.setUrl("http://google.com");
//            service.setOnSucceeded(event -> System.out.println("done:" + event.getSource().getValue()));
//            service.start();
//
//            new Thread(() -> {
//                for (int i = 0; i < 10; i++) {
//                    try {
//                        Thread.sleep(100);
//                    } catch (InterruptedException e1) {
//                        e1.printStackTrace();
//                    }
//                    string.append(i);
//
//                    Platform.runLater(() -> {
//                        text.setText(string.toString());
//                    });
//                }
//
//            }).start();
//
//        });
//
//        VBox root = new VBox();
//        root.getChildren().addAll(btn, text);
//        primaryStage.setScene(new Scene(root, 300, 250));
//        primaryStage.show();
//    }
//
//    private static class FirstLineService extends Service<String> {
//        private StringProperty url = new SimpleStringProperty();
//
//        public final void setUrl(String value) {
//            url.set(value);
//        }
//
//        public final String getUrl() {
//            return url.get();
//        }
//
//        public final StringProperty urlProperty() {
//            return url;
//        }
//
//        protected Task<String> createTask() {
//            final String _url = getUrl();
//            return new Task<String>() {
//                protected String call() throws IOException {
//                    String result = null;
//                    URL u = new URL(_url);
//                    try (BufferedReader in = new BufferedReader(new InputStreamReader(u.openStream()))) {
//                        result = in.readLine();
//                    }
//                    return result;
//                }
//            };
//        }
//    }
//}
