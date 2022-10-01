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
    public void handleSubmit(){
        String fn = txtFullName.getText();
        txFullName.setText(fn);
        String em = txtEmail.getText();
        txEmail.setText(em);
        String ag = txtAge.getText();
        txAge.setText(ag);
        String ad = txtAddress.getText();
        txAddress.setText(ad);
    }
}
