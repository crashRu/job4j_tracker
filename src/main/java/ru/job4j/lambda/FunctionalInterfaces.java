package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.*;

public class FunctionalInterfaces {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        BiConsumer<Integer, String> biCon = (s, s1) -> map.put(s, s1);
        int a = 1;
        biCon.accept(a++, "one");
        biCon.accept(a++, "three");
        biCon.accept(a++, "two");
        biCon.accept(a++, "four");
        biCon.accept(a++, "five");
        biCon.accept(a++, "six");
        biCon.accept(a++, "seven");

        BiPredicate<Integer, String> biPred = (o, s) -> o % 2 == 0 || s.length() == 4;
        for (Integer i : map.keySet()) {
            biPred.test(i, map.get(i));
        }
        Supplier<List<String>> sup = () -> new ArrayList<>(map.values());
        List<String> strings = sup.get();

        Consumer<String> con = s -> System.out.println(s);
        Function<String, String> func = s -> s.toUpperCase();
        for (String s : strings) {
                        con.accept(func.apply(s));
        }
    }
}