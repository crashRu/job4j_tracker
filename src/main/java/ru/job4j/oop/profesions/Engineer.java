package ru.job4j.oop.profesions;

public class Engineer extends Profession {
    private int seniority;

    public Engineer(long id, String name, String suName, String education, int age, int seniority) {
        super(id, name, suName, education, age);
        this.seniority = seniority;
    }

    public Project getProject(Scheme scheme) {
        return new Project();
    }
}
