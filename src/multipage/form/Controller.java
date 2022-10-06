package multipage.form;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import multipage.Main;
import multipage.SubjectList;

public class Controller {
    public void backToList(ActionEvent actionEvent) throws Exception {
        Parent listPage = FXMLLoader.load(getClass().getResource("../list/List.fxml"));
        Scene listScene = new Scene(listPage,800,600);

        Main.rootStage.setTitle("List");
        Main.rootStage.setScene(listScene);
    }
    public TextField txtCode;
    public TextField txtName;
    public TextField txtHours;
    public Text error;

    public void addSubject(){
        try{
            int hours = Integer.parseInt(txtHours.getText());
            error.setVisible(false);
            if(txtCode.getText().isEmpty() || txtName.getText().isEmpty() || txtHours.getText().isEmpty() ){
                throw new Exception("Vui lòng điền đầy đủ thông tin!");
            }
            for (SubjectList s : multipage.list.Controller.subjectList){
                if(s.getCode().equals(txtCode.getText()))
                    throw new Exception("Vui lòng nhập dữ liệu");
            }
            multipage.list.Controller.subjectList.add(new SubjectList(txtCode.getText(),txtName.getText(),hours));
            backToList(null);
        }catch (Exception e){
            error.setText(e.getMessage());
            error.setVisible(true);
        }
    }
}
