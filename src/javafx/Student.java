package javafx;

public class Student {
    String name;
    String email;
    String mark;

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public Student(String name, String email, String mark) {
        this.name = name;
        this.email = email;
        this.mark = mark;
    }
    public String toString(){
        return getName()+"-"+getEmail()+"-"+getMark()+"\n";
    }
}
