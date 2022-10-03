package javafx;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ListView;
import javafx.scene.text.Text;

import java.awt.*;

public class MarkController {
    public TextField txtStName;
    public TextField txtStEmail;
    public TextField txtStMark;
    public ListView<Student> st;
    public Text error;
    private ObservableList<PhoneNumber> studentList = FXCollections.observableArrayList();

    public void addStudent(){
        try{
            error.setVisible(false);
            if(txtStName.getText().isEmpty() || txtStEmail.getText().isEmpty() || txtStMark.getText().isEmpty()){
                throw new Exception("Vui lòng nhập đủ tên, email và điểm");
            }
            printResult();
        }catch (Exception e){
            error.setText(e.getMessage());
            error.setVisible(true);
        }
    }
    public void printResult(){
        st.setItems(studentList);
        st.refresh();
    }
}
