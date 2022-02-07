package ru.job4j.stream.attestation;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Analyze {

    public static double averageScore(Stream<Pupil> stream) {
        return stream
                .flatMap(subj -> subj.getSubjects().stream()
                        .map(av -> av.getScore()))
                .mapToDouble(par -> par.doubleValue())
                .average().orElse(0);

    }

    public static List<Tuple> averageScoreBySubject(Stream<Pupil> stream) {
        return stream
                .map(pup -> new Tuple(pup.getName(), pup.getSubjects()
                        .stream()
                        .mapToDouble(Subject::getScore)
                        .average()
                        .orElse(0)))
                .collect(Collectors.toList());
    }

    public static List<Tuple> averageScoreByPupil(Stream<Pupil> stream) {
        return stream.flatMap(sub -> sub.getSubjects().stream()
                .collect(Collectors.groupingBy(Subject::getName,
                        Collectors.averagingDouble(Subject::getScore)))
                .entrySet()
                .stream())
                .map(tuple -> new Tuple(tuple.getKey(), tuple.getValue()))
                .collect(Collectors.toList());
    }

    public static Tuple bestStudent(Stream<Pupil> stream) {
        return stream
                .map(pup -> new Tuple(pup.getName(), pup.getSubjects()
                        .stream()
                        .mapToDouble(Subject::getScore)
                        .sum()))
                .max(Comparator.comparingDouble(Tuple::getScore))
                .get();
    }

    public static Tuple bestSubject(Stream<Pupil> stream) {
        return stream.flatMap(sub -> sub.getSubjects().stream()
                        .collect(Collectors.groupingBy(Subject::getName,
                                Collectors.summarizingDouble(Subject::getScore)))
                        .entrySet()
                        .stream())
                .map(tuple -> new Tuple(tuple.getKey(), tuple.getValue().getSum()))
                .max(Comparator.comparingDouble(Tuple::getScore)).get();
    }
}