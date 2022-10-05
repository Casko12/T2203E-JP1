package multipage;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ListView;

public class SubjectList {
    String code;
    String name;
    String hours;

    public SubjectList() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    public SubjectList(String code, String name, String hours) {
        this.code = code;
        this.name = name;
        this.hours = hours;
    }
    public String toString(){
        return getCode()+"-"+getName()+"-"+getHours()+"\n";
    }
}