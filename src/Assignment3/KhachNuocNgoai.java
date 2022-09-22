package Assignment3;

public class KhachNuocNgoai extends KhachHang {
    public String quocTich;

    public KhachNuocNgoai(String quocTich) {
        this.quocTich = quocTich;
    }

    public KhachNuocNgoai(int id, String name, String date, int quantity, String quocTich) {
        super(id, name, date, quantity);
        this.quocTich = quocTich;
    }

    public String getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }

    @Override
    public int thanhTien() {
        return super.thanhTien();
    }
}
