package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        char[] leftChar = left.toCharArray();
        char[] rightChar = right.toCharArray();
        int leftCount = 0;
        int rigthCount = 0;
        for (char c : leftChar) {
            leftCount += c;
        }
        for (char c : rightChar) {
            rigthCount += c;
        }
        return Integer.compare(rigthCount, leftCount);
    }
}