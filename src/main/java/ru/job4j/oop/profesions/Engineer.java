package ru.job4j.oop.profesions;

public class Engineer extends Profession {
    public Project getProject(Scheme scheme) {
        return new Project();
    }
}
