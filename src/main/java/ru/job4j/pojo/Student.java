package ru.job4j.pojo;

import java.util.Date;

public class Student {
    private String suName;
    private String name;
    private String middleName;
    private String group;
    private Date dateAdmission;

    public String getSuName() {
        return suName;
    }

    public void setSuName(String suName) {
        this.suName = suName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Date getDateAdmission() {
        return dateAdmission;
    }

    public void setDateAdmission(Date dateAdmission) {
        this.dateAdmission = dateAdmission;
    }

    @Override
    public String toString() {
        return "Student{"
                + "suName='" + suName + '\''
                + ", name='" + name + '\''
                + ", middleName='" + middleName + '\''
                + ", group='" + group + '\''
                + ", dateAdmission=" + dateAdmission
                + '}';
    }
}
