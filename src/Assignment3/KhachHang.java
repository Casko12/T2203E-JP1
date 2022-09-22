package Assignment3;
import java.util.Date;
import java.text.SimpleDateFormat;
public class KhachHang {
    public KhachHang (){

    }
    public int id;
    public String name;
    public String date;
    public int quantity;

    public KhachHang(int id, String name, String date, int quantity) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int thanhTien(int dinhMuc){
        return quantity*dinhMuc;
    }
}
