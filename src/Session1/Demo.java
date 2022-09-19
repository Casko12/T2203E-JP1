package Session1;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args){
        System.out.println("Hello world!");
        int x = 10;
        System.out.println("x = "+x);
        String str = "Hello world";
        if(x>5){
            System.out.println(str);
        }else{
            System.out.println("not found");
        }
        for(int i=0;i<10;i++){
            System.out.println("i="+i);
        }

        Car c = new Car();
        Car c2 ;
        c2 = new Car();
        c.brand = "Toyota";
        System.out.println(c.brand);
        Car.color = "red";
        System.out.println(Car.color);
        c.showInfo();
        c2.showInfo();
        Bike b = new Bike();
        b.run();
        System.out.println(Car.color);

//        TamGiac t = new TamGiac();
//        TamGiac t2 = new TamGiac();
//        t.setCanh1(4);
//        t2.setCanh1(10);
//        t.setCanh2(5);
//        t.setCanh3(6);
//        System.out.println("Chu vi:"+t.chuVi());
//        System.out.println("Dien tich:"+t.dienTich());

        Scanner sc = new Scanner(System.in); // tao scanner de nhap
        PhanSo f1 = new PhanSo();
        f1.setTuso(sc.nextInt()); // nhap tu so f1
        f1.setMauso(sc.nextInt());
        f1.inPhanSo();

        PhanSo f2 = new PhanSo();
        f2.setTuso(sc.nextInt());
        f2.setMauso(sc.nextInt());
        f2.inPhanSo();

        PhanSo t = f1.add(f2);
        t.rutGon();
        t.inPhanSo();

        PhanSo t1 = f1.sub(f2);
        t1.rutGon();
        t1.inPhanSo();

        PhanSo t2 = f1.mul(f2);
        t2.rutGon();
        t2.inPhanSo();

        PhanSo t3 = f1.div(f2);
        t3.rutGon();
        t3.inPhanSo();
    }
}
