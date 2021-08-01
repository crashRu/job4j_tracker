package ru.job4j.oop.parser;

public class TextReport {
    public String generate(String name, String body) {
        return name + System.lineSeparator() + body;
    }
}