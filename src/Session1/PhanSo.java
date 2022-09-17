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
        for (int i = Math.min(Math.abs(tuSo), Math.abs(mauSo)); i > 1; i--) {
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

    }

    public void add(){

    }
    public void sub(){

    }
    public void mul(){

    }
    public void div(){

    }
}
