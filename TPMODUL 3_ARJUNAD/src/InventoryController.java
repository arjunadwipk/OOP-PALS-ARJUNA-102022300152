import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;

public class InventoryController {

    @FXML
    private TableView<Album> albumTable;

    @FXML
    private TableColumn<Album, String> columnAlbumName;

    @FXML
    private TableColumn<Album, String> columnArtist;

    @FXML
    private TableColumn<Album, Integer> columnAvailable;

    @FXML
    private TableColumn<Album, Integer> columnTotal;

    @FXML
    private TextField albumNameField;

    @FXML
    private TextField artistField;

    @FXML
    private TextField totalField;

    @FXML
    private TextField rentedField;

    private ObservableList<Album> albumList;

    @FXML
    public void initialize() {
        albumList = FXCollections.observableArrayList(
                new Album("Bury Me at Makeout Creek", "Mitski", 5, 3),
                new Album("Riot!", "Paramore", 3, 3)
        );

        albumTable.setItems(albumList);

        // Bind table columns to Album properties
        columnAlbumName.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue().getAlbumName()));
        columnArtist.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue().getArtist()));
        columnAvailable.setCellValueFactory(data -> new javafx.beans.property.SimpleObjectProperty<>(data.getValue().getAvailable()));
        columnTotal.setCellValueFactory(data -> new javafx.beans.property.SimpleObjectProperty<>(data.getValue().getTotal()));

        albumTable.setOnMouseClicked(this::handleTableClick);
    }

    @FXML
    private void rentSelected() {
        Album selectedAlbum = albumTable.getSelectionModel().getSelectedItem();
        if (selectedAlbum != null) {
            if (selectedAlbum.getAvailable() > 0) {
                selectedAlbum.setAvailable(selectedAlbum.getAvailable() - 1);
                albumTable.refresh();
                showAlert(Alert.AlertType.INFORMATION, "Success", "Album berhasil disewa.");
            } else {
                showAlert(Alert.AlertType.ERROR, "Error", "Album tidak tersedia.");
            }
        } else {
            showAlert(Alert.AlertType.ERROR, "Error", "Tidak ada album yang dipilih.");
        }
    }

    @FXML
    private void addAlbum() {
        try {
            String albumName = albumNameField.getText();
            String artist = artistField.getText();
            int total = Integer.parseInt(totalField.getText());

            albumList.add(new Album(albumName, artist, total, total));
            albumTable.refresh();
            showAlert(Alert.AlertType.INFORMATION, "Success", "Album berhasil ditambahkan.");
        } catch (Exception e) {
            showAlert(Alert.AlertType.ERROR, "Error", "Input tidak valid.");
        }
    }

    @FXML
    private void deleteAlbum() {
        Album selectedAlbum = albumTable.getSelectionModel().getSelectedItem();
        if (selectedAlbum != null) {
            albumList.remove(selectedAlbum);
            albumTable.refresh();
            showAlert(Alert.AlertType.INFORMATION, "Success", "Album berhasil dihapus.");
        } else {
            showAlert(Alert.AlertType.ERROR, "Error", "Tidak ada album yang dipilih.");
        }
    }

    @FXML
    private void updateAlbum() {
        Album selectedAlbum = albumTable.getSelectionModel().getSelectedItem();
        if (selectedAlbum != null) {
            try {
                selectedAlbum.setAlbumName(albumNameField.getText());
                selectedAlbum.setArtist(artistField.getText());
                selectedAlbum.setTotal(Integer.parseInt(totalField.getText()));
                albumTable.refresh();
                showAlert(Alert.AlertType.INFORMATION, "Success", "Album berhasil diperbarui.");
            } catch (Exception e) {
                showAlert(Alert.AlertType.ERROR, "Error", "Input tidak valid.");
            }
        } else {
            showAlert(Alert.AlertType.ERROR, "Error", "Tidak ada album yang dipilih.");
        }
    }

    @FXML
    private void handleTableClick(MouseEvent event) {
        Album selectedAlbum = albumTable.getSelectionModel().getSelectedItem();
        if (selectedAlbum != null) {
            albumNameField.setText(selectedAlbum.getAlbumName());
            artistField.setText(selectedAlbum.getArtist());
            totalField.setText(String.valueOf(selectedAlbum.getTotal()));
            rentedField.setText(String.valueOf(selectedAlbum.getTotal() - selectedAlbum.getAvailable()));
        }
    }

    private void showAlert(Alert.AlertType alertType, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setContentText(message);
        alert.showAndWait();
    }
}