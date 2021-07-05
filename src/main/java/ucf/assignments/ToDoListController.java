package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class ToDoListController {
    public void getNameOfToDoList(ActionEvent actionEvent) {
    }

    public void ModifyNameOfToDoList(ActionEvent actionEvent) {
    }


    @FXML
    public void toDoListNewPage(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ToDoListPage.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setTitle("ToDoListPage");
            stage.setScene(new Scene(root1));
            stage.show();

        }

    @FXML

    public void addNewToDoList(ActionEvent actionEvent) {

    /*
         String toDoDesc = current value in getNameOfToDoList field
         if toDoDesc != ""
         instantiate a To Do Object   -> ToDo list = new ToDo
         Use setter in To Do class to set the
         itemDescription textfield = newDesc
        */
    }


    @FXML

    public void saveAllLists(ActionEvent actionEvent) {
    }
}
