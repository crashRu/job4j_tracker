package ru.job4j.oop.profesions;

import java.util.Date;

public class Profession {
    private long id;
    private String name;
    private String suName;
    private String education;
    private int age;
    private Date birthday;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSuName() {
        return suName;
    }

    public String getEducation() {
        return education;
    }

    public int getAge() {
        return age;
    }

    public Date getBirthday() {
        return birthday;
    }
}
