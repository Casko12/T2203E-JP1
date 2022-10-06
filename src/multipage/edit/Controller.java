package multipage.edit;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import multipage.Main;
import multipage.SubjectList;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
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

    @Override
    public void initialize (URL location, ResourceBundle resources)  {
        try{
            if(multipage.list.Controller.editItem == null){
                backToList(null);
            }
            txtCode.setText(multipage.list.Controller.editItem.getCode());
            txtName.setText(multipage.list.Controller.editItem.getName());
            txtHours.setText(multipage.list.Controller.editItem.getHours().toString());
            txtCode.setEditable(false);
        }catch (Exception e){

        }
    }
    public void submit(ActionEvent actionEvent) {
        try{
            int hours = Integer.parseInt(txtHours.getText());
            error.setVisible(false);
            if(txtName.getText().isEmpty() || txtHours.getText().isEmpty() || hours <=0 ){
                throw new Exception("Vui lòng điền đầy đủ thông tin!");
            }
            multipage.list.Controller.editItem.setName(txtName.getText());
            multipage.list.Controller.editItem.setHours(hours);
            backToList(null);
        }catch (Exception e){
            error.setText(e.getMessage());
            error.setVisible(true);
        }
    }

}