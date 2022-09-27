package Assignment4;
import java.util.ArrayList;

public class PhoneBook extends Phone {
    public ArrayList<PhoneNumber> PhoneList;
    public PhoneBook(){
        PhoneList = new ArrayList<>();
    }

    @Override
    public void insertPhone(String name, String phone) {
        for (PhoneNumber p: PhoneList) {
            if (p.getName().equals(name)){
                if(p.getPhone().contains(phone)) {
                    System.out.println("Lien lac nay da ton tai");
                    return;
                }
                //TH co ten nhung chua co so
                p.getPhone().add(phone);
                System.out.println("Da them so "+phone+" vao lien lac");
                return;
            }

        }
        //neu ma khong co ten
        PhoneNumber pn = new PhoneNumber(name, phone);
        PhoneList.add(pn);
        System.out.println("Da them "+name+" vao lien lac");
    }

    @Override
    public void removePhone(String name) {
        for (PhoneNumber p: PhoneList) {
            if (p.getName().equals(name)){
                PhoneList.remove(p);
            }
        }
    }

    @Override
    public void updatePhone(String name, String oldPhone, String newPhone) {
        for (PhoneNumber p: PhoneList) {
            if (p.getName().equals(name)) {
                p.getPhone().remove(oldPhone);
                p.getPhone().add(newPhone);
            }
        }
    }

    @Override
    PhoneNumber searchPhone (String name) {
        for (PhoneNumber p: PhoneList) {
            if (p.getName().equals(name)) {
                return p;
            }
        }
        return null;
    }

    @Override
    public void sort() {

    }
}
