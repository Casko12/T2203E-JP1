package javafx;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.Collections;
import java.util.Comparator;
import java.util.ResourceBundle;


public class MarkController implements Initializable {
    public TextField txtName;
    public TextField txtEmail;
    public TextField txtMark;
    public ListView<Student> st;
    public Text error;
    public Button sortByName;
    public Button sortByMark;
    private boolean sortName = true;
    private boolean sortMark = true;
    private ObservableList<Student> studentList = FXCollections.observableArrayList();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        studentList.add(new Student("Hà Hoàng Hưng", "hunghh@gmail.com", 1));
        studentList.add(new Student("Trần Văn Thành", "thanhtv@gmail.com", 2));
        st.setItems(studentList);
    }

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
        sortByName.setText(sortName?"Z->A":"A->Z");
        sortName = !sortName;
        st.refresh();
    }
    public void sortByMark(){
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return sortMark?o1.getMark() - o2.getMark():o2.getMark()- o1.getMark();
            }
        });
        sortByMark.setText(sortMark?"High to Low":"Low to High");
        sortMark = !sortMark;
        st.refresh();
    }

}
