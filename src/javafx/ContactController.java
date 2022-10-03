package javafx;

import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.util.ArrayList;

public class ContactController {
    public TextField txtName;
    public TextField txtPhone;
    public Text result;
    public Text errors;

    private ArrayList<PhoneNumber> phonelist = new ArrayList<>();
    public void addContact(){
        try{
            errors.setVisible(false);
            if(txtName.getText().isEmpty() || txtPhone.getText().isEmpty()){
                throw new Exception("Vui lòng nhập đủ tên và só điện thoại");
            }
        }catch (Exception e){
            errors.setText(e.getMessage());
            errors.setVisible(true);
        }

    }

}
