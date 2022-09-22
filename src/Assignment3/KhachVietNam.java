package Assignment3;

public class KhachVietNam extends KhachHang {
    public String doiTuong;

    public KhachVietNam(String doiTuong) {
        this.doiTuong = doiTuong;
    }

    public KhachVietNam(int id, String name, String date, int quantity, String doiTuong) {
        super(id, name, date, quantity);
        this.doiTuong = doiTuong;
    }

    public String getDoiTuong() {
        return doiTuong;
    }

    public void setDoiTuong(String doiTuong) {
        this.doiTuong = doiTuong;
    }

    @Override
    public int thanhTien() {
        if(quantity<50)
            return quantity * 1000;
        else if (quantity <100)
            return (quantity-50)*1200 + 50*1000;
        else if (quantity <200)
            return (quantity-100)*1500 + 50*1000 + 50*1200;
        else
            return (quantity-200)*2000 +100*1500 + 50*1000 + 50*1200;
    }


}
