package multipage.list;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import multipage.Main;

public class Controller {

    public void goToForm(ActionEvent actionEvent) throws Exception {
        Parent listPage = FXMLLoader.load(getClass().getResource("../form/Form.fxml"));
        Scene listScene = new Scene(listPage,800,600);

        Main.rootStage.setTitle("Thêm môn học");
        Main.rootStage.setScene(listScene);
    }
    public ListView <SubjectList> lv;
    private ObservableList<SubjectList> subjectList = FXCollections.observableArrayList();
}
