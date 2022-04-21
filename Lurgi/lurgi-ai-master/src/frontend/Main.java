package frontend;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static String[] aiNames = {"Human", "Dumbass","Aggressive","Defensive", "MyAI", "TestAI", "MyAI2"};

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("pregame.fxml"));
        primaryStage.setTitle("LurgiAI");
        primaryStage.setScene(new Scene(root, 500, 600));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
