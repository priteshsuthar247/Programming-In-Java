import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class _39 extends Application {

    @Override
    public void start(Stage primaryStage) {
        Circle circle = new Circle(50, Color.BLUE);

        circle.addEventHandler(MouseEvent.MOUSE_PRESSED, e -> circle.setFill(Color.RED));
        circle.addEventHandler(MouseEvent.MOUSE_RELEASED, e -> circle.setFill(Color.BLUE));

        StackPane root = new StackPane();
        root.getChildren().add(circle);

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Circle Color Change");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
