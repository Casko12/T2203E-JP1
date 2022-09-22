package Assignment3;

public class Main {
    public static void main(String[] args) {
        KhachVietNam kh1 = new KhachVietNam(111,"Pham Duy Hung","2022-09-21",130,"Ca nhan");
        KhachNuocNgoai kh2 = new KhachNuocNgoai(222,"John Wick","2022-09-22",312,"USA");
        System.out.println(kh1.thanhTien());
        System.out.println(kh2.thanhTien());
    }
}
