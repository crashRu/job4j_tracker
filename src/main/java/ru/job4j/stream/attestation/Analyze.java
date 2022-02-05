package ru.job4j.stream.attestation;

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
                        .mapToDouble(av -> av.getScore())
                        .average()
                        .orElse(0)))
                .collect(Collectors.toList());
    }

    public static List<Tuple> averageScoreByPupil(Stream<Pupil> stream) {
        return stream.flatMap(sub -> sub.getSubjects().stream()
                .collect(Collectors.groupingBy(sub.getName(),
                        LinkedHashMap::new,
                        Collectors.averagingDouble(Subject::getScore)))).

    }

    public static Tuple bestStudent(Stream<Pupil> stream) {
        return null;
    }

    public static Tuple bestSubject(Stream<Pupil> stream) {
        return null;
    }
}