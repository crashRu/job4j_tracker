package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        String[] splitLeftString = left.split("\\.");
        String[] splitRightString = right.split("\\.");
        return Integer.compare(Integer.parseInt(splitLeftString[0]),
                Integer.parseInt(splitRightString[0]));
    }
}