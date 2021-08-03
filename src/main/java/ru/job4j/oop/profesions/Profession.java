package ru.job4j.oop.profesions;

public class Profession {
    private long id;
    private String name;
    private int age;

    public Profession(long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
