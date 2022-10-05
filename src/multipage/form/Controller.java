package multipage.form;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import multipage.Main;
import multipage.list.SubjectList;

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
            error.setVisible(false);
            if(txtCode.getText().isEmpty() || txtName.getText().isEmpty() || txtHours.getText().isEmpty() ){
                throw new Exception("Vui lòng điền đầy đủ thông tin!");
            }
        clearInput();
        }catch (Exception e){
            error.setText(e.getMessage());
            error.setVisible(true);
        }
    }
    public void clearInput() {
        txtCode.setText("");
        txtName.setText("");
        txtHours.setText("");
    }
}
