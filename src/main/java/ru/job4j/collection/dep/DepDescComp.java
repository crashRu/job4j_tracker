package ru.job4j.collection.dep;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String line1, String line2) {
        String[] lineOne = line1.split("/");
        String[] lineTwo = line2.split("/");
        int tmp = lineOne.length < lineTwo.length ? lineOne.length : lineTwo.length;
        int rsl = lineTwo[0].compareTo(lineOne[0]);
        if (rsl == 0) {
            for (int i = 1; i < tmp; i++) {
                    if (lineOne[i].compareTo(lineTwo[i]) != 0) {
                        rsl = lineOne[i].compareTo(lineTwo[i]);
                    }
                }
            }
        return rsl;
    }
}
