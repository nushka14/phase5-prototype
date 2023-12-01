import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import java.util.HashMap;
import java.util.Map;

public class Main extends Application {

    private final Map<String, String> mockDatabase = new HashMap<>();

    @Override
    public void start(Stage primaryStage) {
        mockDatabase.put("Project1", "Data Analysis Module");
        mockDatabase.put("Project2", "User Authentication System");

        primaryStage.setTitle("EffortLogger");

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Label userNameLabel = new Label("User Name:");
        grid.add(userNameLabel, 0, 0);

        TextField userTextField = new TextField();
        grid.add(userTextField, 1, 0);

        Label projectLabel = new Label("Enter Project Keyword:");
        grid.add(projectLabel, 0, 1);

        TextField projectTextField = new TextField();
        grid.add(projectTextField, 1, 1);

        Button btnSearch = new Button("Search");
        btnSearch.setOnAction(event -> searchProject(projectTextField.getText()));

        grid.add(btnSearch, 2, 1);

        TextArea resultArea = new TextArea();
        resultArea.setEditable(false);
        grid.add(resultArea, 1, 2);

        Scene scene = new Scene(grid, 500, 275);
        primaryStage.setScene(scene);

        primaryStage.show();
    }

    private void searchProject(String keyword) {
        if (mockDatabase.containsKey(keyword)) {
            showAlert(Alert.AlertType.INFORMATION, "Project Found!", "Details: " + mockDatabase.get(keyword));
        } else {
            showAlert(Alert.AlertType.ERROR, "Project Not Found", "No data found for the entered keyword.");
        }
    }

    private void showAlert(Alert.AlertType alertType, String title, String content) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
