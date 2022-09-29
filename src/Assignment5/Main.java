package Assignment5;

public class Main {
    public static void main(String[] args) {
    News n = new News(001,"Title1","27/09/2022","Author1","Content1");
    n.RateList[0]=5;
    n.RateList[1]=8;
    n.RateList[2]=8;
    n.Calculate().Display();
    }
}
