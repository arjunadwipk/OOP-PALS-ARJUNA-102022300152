import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Node;

public class LoginController {

    @FXML
    private TextField usernameField;

    @FXML
    private TextField passwordField;

    @FXML
    void login(ActionEvent event) {
        String username = usernameField.getText();
        String password = passwordField.getText();

        if (username.isEmpty() || password.isEmpty()) {
            showAlert("Input Error", "Username dan password tidak boleh kosong.", Alert.AlertType.ERROR);
            return;
        }

        if (username.equals("Arjuna") && password.equals("2105")) {
            try {
                Parent inventoryParent = FXMLLoader.load(getClass().getResource("/InventoryController.fxml"));
                Scene inventoryScene = new Scene(inventoryParent);

                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                stage.setScene(inventoryScene);
                stage.setTitle("Inventory");
                stage.show();

                showAlert("Login Successful", "Welcome " + username + "!", Alert.AlertType.INFORMATION);

            } catch (Exception e) {
                e.printStackTrace();
                showAlert("Error", "Tidak dapat memuat halaman Inventory.", Alert.AlertType.ERROR);
            }
        } else {
            showAlert("Login Failed", "Username atau password salah.", Alert.AlertType.ERROR);
        }
    }

    private void showAlert(String title, String message, Alert.AlertType alertType) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}