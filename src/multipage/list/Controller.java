package multipage.list;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import multipage.Main;
import multipage.SubjectList;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    public void goToForm(ActionEvent actionEvent) throws Exception {
        Parent listPage = FXMLLoader.load(getClass().getResource("../form/Form.fxml"));
        Scene listScene = new Scene(listPage,800,600);

        Main.rootStage.setTitle("Thêm môn học");
        Main.rootStage.setScene(listScene);
    }
    public void goToEdit(ActionEvent actionEvent) throws Exception {
        editItem = lv.getSelectionModel().getSelectedItem();
        if(editItem == null) return;
        Parent listPage = FXMLLoader.load(getClass().getResource("../edit/Form.fxml"));
        Scene listScene = new Scene(listPage,800,600);

        Main.rootStage.setTitle("Chỉnh sửa môn học");
        Main.rootStage.setScene(listScene);
    }
    public ListView <SubjectList> lv;
    public static ObservableList<SubjectList> subjectList = FXCollections.observableArrayList();
    public static SubjectList editItem;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
//        subjectList.add(new SubjectList("001","Java Programing 1",40));
//        subjectList.add(new SubjectList("002","HTML CSS",30));
        lv.setItems(subjectList);
    }
}
