package Assignment4;

public class Main {
    public static void main(String[] args) {
        PhoneBook pb = new PhoneBook();
        pb.insertPhone("Hung","123456789");
        pb.insertPhone("Hung2","123456781");
        pb.insertPhone("Hung3","123456782");
        pb.insertPhone("Hung4","123456783");
        pb.insertPhone("Hung5","123456784");
        System.out.println(pb.PhoneList.size());
    }
}
