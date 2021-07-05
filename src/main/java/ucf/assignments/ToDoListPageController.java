package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class ToDoListPageController {
    public void modifyListName(ActionEvent actionEvent) {
    }
    @FXML

    public void displayOptions(ActionEvent actionEvent) {
    }
    @FXML

    public void addItemtoList(ActionEvent actionEvent) {
    }
    @FXML

    public void addItemName(ActionEvent actionEvent) {
    }
    @FXML

    public void addItemDueDate(ActionEvent actionEvent) {
    }
    @FXML

    public void editItemName(ActionEvent actionEvent) {
    }
    @FXML

    public void deletItem(ActionEvent actionEvent) {
    }
    @FXML

    public void markItemAsDone(ActionEvent actionEvent) {
    }
    @FXML

    public void deleteEntireToDoList(ActionEvent actionEvent) {
    }
    @FXML

    public void saveList(ActionEvent actionEvent) {
    }

    @FXML
    public void openEditItemPage(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("EditItemPage.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.setTitle("EditItemPage");
        stage.setScene(new Scene(root1));
        stage.show();
    }
}
