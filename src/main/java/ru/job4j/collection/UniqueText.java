package ru.job4j.collection;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class UniqueText {
    public static void main(String[] args) {
        System.out.println(BigDecimal.valueOf(0.12 * Math.pow(5, 4)));
        String origin = "My cat eats a mouse and milk";
        String text = "My cat eats milk and a mouse";
        System.out.println(isEquals(origin, text));

        String origin2 = "My cat eats a mouse";
        String text2 = "A mouse is eaten by a cat";

        System.out.println(isEquals(origin2, text2));
    }

    public static boolean isEquals(String originText, String duplicateText) {
        boolean rsl = true;
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        HashSet<String> check = new HashSet<>();
        check.addAll(List.of(origin));
        for (String s : text) {
            rsl = check.contains(s);
            }
        return rsl;
    }
}