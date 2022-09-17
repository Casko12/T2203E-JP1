package Session1;

public class Car {
    public String brand = "BMW"; //private String... thi chi ban than no dung duoc, dung khi no la lop cuoi cung tren cay pha he
    //default: chi package cua no dung dc
    //protected thi chi co no dung dc va cac related voi no dung duoc
    int year = 2022;

    static String color;

    public void showInfo(){
        System.out.println(brand);
        System.out.println(year);
    }
}
