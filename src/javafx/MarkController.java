package javafx;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;


public class MarkController {
    public TextField txtName;
    public TextField txtEmail;
    public TextField txtMark;
    public ListView<Student> st;
    public Text error;
    private ObservableList<Student> studentList = FXCollections.observableArrayList();

    public void addStudent(){
        try{
            error.setVisible(false);
            Integer mark= Integer.parseInt(txtMark.getText());
            if(txtName.getText().isEmpty() || txtEmail.getText().isEmpty() || txtMark.getText().isEmpty() || !txtEmail.getText().contains("@") || mark<0 ||mark >100){
                throw new Exception("Vui lòng nhập đủ tên, email và điểm");
            }
            printResult();
        }catch (Exception e){
            error.setText(e.getMessage());
            error.setVisible(true);
        }
    }
    public void printResult(){
        studentList.add(new Student(txtName.getText(),txtEmail.getText(),txtMark.getText()));
        st.setItems(studentList);
        st.refresh();
    }
}
