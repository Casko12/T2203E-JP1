package Exam.Flight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Flight g1 = new Flight(857, "Toronto");
        g1.display();
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Flight Number: ");
        Flight g = new Flight();
        g.setNumber(sc.nextInt());
        System.out.println("Input Destination: ");
        sc.nextLine();
        g.setDestination(sc.nextLine());
        g.display();
    }
}
