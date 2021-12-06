package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        String splitLeftString = left.replaceAll("\\D", "").strip();
        String splitRightString = right.replaceAll("\\D", "").strip();
        return Integer.compare(Integer.parseInt(splitLeftString), Integer.parseInt(splitRightString));
    }
}