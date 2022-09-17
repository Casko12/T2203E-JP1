package Session1;

public class PhanSo {
   public int tuSo;
   public int mauSo;

    public PhanSo(){};

    public int getTuso() {
        return tuSo;
    }

    public void setTuso(int tuso) {
        this.tuSo = tuSo;
    }

    public int getMauso() {
        return mauSo;
    }

    public void setMauso(int mauso) {
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
    public void sub(){

    }
    public void mul(){

    }
    public void div(){

    }
}
