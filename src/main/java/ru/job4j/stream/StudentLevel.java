package ru.job4j.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentLevel {
    public static List<Student> levelOf(List<Student> students, int bound) {
        return students.stream()
                .flatMap(Stream::ofNullable)
                .filter(st -> st.getScore() > bound)
                .sorted((left, rigth) -> Integer.compare(rigth.getScore(), left.getScore()))
                .collect(Collectors.toList());
    }
}