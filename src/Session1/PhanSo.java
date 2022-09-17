package Session1;

public class PhanSo {
    int tuso;
    int mauso;

    public PhanSo(){};

    public int getTuso() {
        return tuso;
    }

    public void setTuso(int tuso) {
        this.tuso = tuso;
    }

    public int getMauso() {
        return mauso;
    }

    public void setMauso(int mauso) {
        this.mauso = mauso;
    }

    public boolean ktPhanSo(){
        return mauso !=0;
    }

    public int UCLN(){
        if(!ktPhanSo()) return 0;
    }




}
