package Session1;

public class PhanSo {
   public int tuSo;
   public int mauSo;

    public PhanSo(){};

    public int getTuso() {
        return tuSo;
    }

    public void setTuso(int tuSo) {
        this.tuSo = tuSo;
    }

    public int getMauso() {
        return mauSo;
    }

    public void setMauso(int mauSo) {
        this.mauSo = mauSo;
    }


    public void rutGon() {

        int UCLN = 1;
        for (int i = Math.min(Math.abs(tuSo), Math.abs(mauSo)); i > 1; i--) { //co the thay tuSo bang getTuso
            if (tuSo % i == 0 && mauSo % i == 0) {
                UCLN = i;
                break;
            }
        }
        setTuso(tuSo/UCLN);
        setMauso(mauSo/UCLN);
    }
    public void inPhanSo(){
        System.out.println(getTuso()+"/"+getMauso());
    }

    public void nghichDao(){
    int tmp = tuSo;
    tuSo = mauSo;
    mauSo = tmp;
    }

    public PhanSo add(PhanSo f){
        PhanSo tong = new PhanSo();
        tong.tuSo = this.tuSo*f.mauSo + this.mauSo*f.tuSo;
        tong.mauSo = this.mauSo*f.mauSo;
        tong.rutGon(); //rut gon tong sau khi cong
        return tong;
    }
    public PhanSo sub(PhanSo f){
        PhanSo hieu = new PhanSo();
        hieu.tuSo = this.tuSo*f.mauSo - this.mauSo*f.tuSo;
        hieu.mauSo = this.mauSo*f.mauSo;
        hieu.rutGon(); //rut gon hieu sau khi cong
        return hieu;
    }
    public PhanSo mul(PhanSo f){
        PhanSo tich = new PhanSo();
        tich.tuSo = this.tuSo*f.tuSo;
        tich.mauSo = this.mauSo*f.mauSo;
        tich.rutGon();
        return tich;
    }
    public PhanSo div(PhanSo f){
        PhanSo thuong = new PhanSo();
        thuong.tuSo = this.tuSo*f.mauSo;
        thuong.mauSo = this.mauSo*f.tuSo;
        thuong.rutGon();
        return thuong;
    }
}
