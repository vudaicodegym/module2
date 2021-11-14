package bt_student;

import javax.xml.namespace.QName;

public class Student {
    private String name = "jhon";
    private String classes = "ccc";
    public Student(){}
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
}
