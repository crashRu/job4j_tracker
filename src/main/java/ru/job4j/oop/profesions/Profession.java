package ru.job4j.oop.profesions;

public class Profession {
    private long id;
    private String name;
    private String suName;
    private String education;
    private int age;

    public Profession(long id, String name, String suName, String education, int age) {
        this.id = id;
        this.name = name;
        this.suName = suName;
        this.education = education;
        this.age = age;
    }

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
}
