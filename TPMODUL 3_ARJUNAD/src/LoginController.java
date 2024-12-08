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
    private PasswordField passwordField;

    @FXML
    void login(ActionEvent event) {
        String username = usernameField.getText();
        String password = passwordField.getText();

        // Cek apakah username dan password kosong
        if (username.isEmpty() || password.isEmpty()) {
            showAlert("Input Error", "Tidak Boleh Kosong", Alert.AlertType.ERROR);
            return;
        }

        // Validasi login
        if (username.equals("Arjuna") && password.equals("2105")) {
            try {
                // Muat halaman Inventory
                Parent inventoryParent = FXMLLoader.load(getClass().getResource("/InventoryController.fxml"));
                Scene inventoryScene = new Scene(inventoryParent);

                // Ganti scene
                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                stage.setScene(inventoryScene);
                stage.setTitle("Inventory");
                stage.show();

                // Tampilkan alert sukses
                showAlert("Login Successful", "Welcome " + username + "!", Alert.AlertType.INFORMATION);

            } catch (Exception e) {
                e.printStackTrace();
                showAlert("Error", "Tidak dapat memuat halaman Inventory.", Alert.AlertType.ERROR);
            }
        } else {
            // Jika username atau password salah
            showAlert("Login Failed", "Username atau password salah.", Alert.AlertType.ERROR);
        }
    }

    // Method untuk menampilkan alert
    private void showAlert(String title, String message, Alert.AlertType alertType) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}