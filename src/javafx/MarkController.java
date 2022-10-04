package javafx;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;


public class MarkController {
    public TextField txtName;
    public TextField txtEmail;
    public TextField txtMark;
    public ListView<Student> st;
    public Text error;
    private boolean sortName = true;
    private ObservableList<Student> studentList = FXCollections.observableArrayList();

    public void addStudent(){
        try{
            error.setVisible(false);
            Integer mark= Integer.parseInt(txtMark.getText());
            if(txtName.getText().isEmpty() || txtEmail.getText().isEmpty() || txtMark.getText().isEmpty() || !txtEmail.getText().contains("@") || mark<0 ||mark >100){
                throw new Exception("Vui lòng nhập đủ tên, email và điểm");
            }
            studentList.add(new Student(txtName.getText(), txtEmail.getText(), mark));
            st.setItems(studentList);
            st.refresh();
            clearInput();
        }catch (Exception e){
            error.setText(e.getMessage());
            error.setVisible(true);
        }

    }
    public void clearInput(){
        txtName.setText("");
        txtEmail.setText("");
        txtMark.setText("");
    }

    public void sortByName(){
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return sortName?o1.getName().compareTo(o2.getName()):o2.getName().compareTo(o1.getName());
            }
        });
        sortName = !sortName;
        st.refresh();
    }

}
