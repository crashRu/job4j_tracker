package ru.job4j.oop.profesions;

public class Surgeon extends Doctor {

    public void operation(Pacient pacient, Diagnosis diagnosis) {
        System.out.println("Хирург что то лишнее обрезал у пциента:D");
    }
}
