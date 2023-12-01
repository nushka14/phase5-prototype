import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class RealTimeCollaborationDashboard extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Real-Time Collaboration Dashboard");

        // Create UI components
        VBox vbox = new VBox(10);
        vbox.setPadding(new Insets(20));

        Label titleLabel = new Label("Real-Time Collaboration Dashboard");
        titleLabel.setStyle("-fx-font-size: 18px; -fx-font-weight: bold;");

        // Sample sections for different user roles
        Label salesLabel = new Label("Sales Analyst Dashboard");
        Label fraudLabel = new Label("Fraud Analyst Dashboard");
        Label developmentLabel = new Label("Development Team Dashboard");
        Label customerSupportLabel = new Label("Customer Support Dashboard");

        // Add components to the layout
        vbox.getChildren().addAll(titleLabel, salesLabel, fraudLabel, developmentLabel, customerSupportLabel);

        Scene scene = new Scene(vbox, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}