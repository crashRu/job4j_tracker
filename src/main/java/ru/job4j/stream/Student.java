package ru.job4j.stream;

import java.util.Objects;

public class Student {
    private int score;

    private String surname;

    public Student(String surname) {
        this.surname = surname;
    }

    public Student(int score, String surname) {
        this(surname);
        this.score = score;
    }

    public Student(String surname, int score) {
        this(score, surname);
    }

    public int getScore() {
        return score;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {

            return true;
        }
        if (o == null || getClass() != o.getClass()) {

            return false;
        }
        Student student = (Student) o;
        return Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surname);
    }
}