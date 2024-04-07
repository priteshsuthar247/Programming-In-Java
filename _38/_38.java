import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class _38 extends Application {

    @Override
    public void start(Stage primaryStage) {
        CheckBox checkBox1 = new CheckBox("Option 1");
        CheckBox checkBox2 = new CheckBox("Option 2");
        CheckBox checkBox3 = new CheckBox("Option 3");

        VBox vbox = new VBox(checkBox1, checkBox2, checkBox3);

        Scene scene = new Scene(vbox, 200, 100);

        primaryStage.setTitle("CheckBox Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
