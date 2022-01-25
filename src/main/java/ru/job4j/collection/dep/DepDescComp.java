package ru.job4j.collection.dep;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String line1, String line2) {
        String[] lineOne = line1.split("/");
        String[] lineTwo = line2.split("/");
        int rsl = lineTwo[0].compareTo(lineOne[0]);
        return rsl != 0 ? rsl : line1.compareTo(line2);

    }
}
