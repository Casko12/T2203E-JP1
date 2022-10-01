package javafx;

import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Controller {
    public TextField txtFullName;
    public TextField txtEmail;
    public TextField txtAge;
    public TextField txtAddress;
    public Text txFullName;
    public Text txEmail;
    public Text txAge;
    public Text txAddress;
    public Text noticetxFullName;
    public Text noticetxEmail;
    public Text noticetxAge;
    public Text noticetxAddress;

    public void handleSubmit(){
        String fn = txtFullName.getText();
        if(fn.isEmpty()){
            noticetxFullName.setText("Vui lòng nhập họ tên!");
            noticetxFullName.setVisible(true);
        }else {
            txFullName.setText(fn);
            noticetxFullName.setVisible(false);
        }
        String em = txtEmail.getText();
        if(em.isEmpty() || !em.contains("@") || em.startsWith("@") || em.endsWith("@")){ //phai chứa @, @ k dc o dau va k dc o cuoi
            noticetxEmail.setText("Vui lòng nhập Email hợp lệ!");
            noticetxEmail.setVisible(true);
        }else {
            txEmail.setText(em);
            noticetxEmail.setVisible(false);
        }
        String ag = txtAge.getText();
        try {
            Integer nAge = Integer.parseInt(ag);
            if(nAge <= 0 || nAge>100)
                throw new Exception("Vui lòng nhập tuổi hợp lệ");
            txAge.setText(nAge.toString());
            noticetxAge.setVisible(false);
        }catch (Exception e){
            noticetxAge.setText(e.getMessage());
            noticetxAge.setVisible(true);
        }
        String ad = txtAddress.getText();
        if(ad.isEmpty()){
            noticetxAddress.setText("Vui lòng nhập địa chỉ!");
            noticetxAddress.setVisible(true);
        }else {
            txAddress.setText(ad);
            noticetxAddress.setVisible(false);
        }
    }
}
