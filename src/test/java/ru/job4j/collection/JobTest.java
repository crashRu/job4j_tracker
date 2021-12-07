package ru.job4j.collection;

import org.junit.Test;
import ru.job4j.collection.jcomparators.JobAscByName;
import ru.job4j.collection.jcomparators.JobAscByPriority;
import ru.job4j.collection.jcomparators.JobDescByName;
import ru.job4j.collection.jcomparators.JobDescByPriority;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;

public class JobTest {
    @Test
    public void whenCompatorByNameAndPrority() {
        Comparator<Job> cmpNamePriority =
                new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorAscByName() {
        List<Job> rsl = new ArrayList<>();
        rsl.add(new Job("Тестирование 2", 1));
        rsl.add(new Job("Тестирование 1", 2));
        Collections.sort(rsl, new JobAscByName());
        List<Job> extend = new ArrayList<>();
        extend.add(new Job("Тестирование 1", 2));
        extend.add(new Job("Тестирование 2", 1));
        assertThat(rsl, is(extend));
    }

    @Test
    public void whenCompatorAscByPriprity() {
        List<Job> rsl = new ArrayList<>();
        rsl.add(new Job("Реставрация", 2));
        rsl.add(new Job("Погода", 1));
        Collections.sort(rsl, new JobAscByPriority());
        List<Job> extend = new ArrayList<>();
        extend.add(new Job("Погода", 1));
        extend.add(new Job("Реставрация", 2));
        assertThat(rsl, is(extend));
    }

    @Test
    public void whenCompatorDescByName() {
        List<Job> rsl = new ArrayList<>();
        rsl.add(new Job("Реставрация", 2));
        rsl.add(new Job("Погода", 1));
        Collections.sort(rsl, new JobDescByName());
        List<Job> extend = new ArrayList<>();
        extend.add(new Job("погода", 1));
        extend.add(new Job("Реставрация", 2));
        assertThat(rsl, is(extend));
    }

    @Test
    public void whenCompatorDescByPriprity() {
        List<Job> rsl = new ArrayList<>();
        rsl.add(new Job("Реставрация", 1));
        rsl.add(new Job("Погода", 2));
        Collections.sort(rsl, new JobDescByPriority());
        List<Job> extend = new ArrayList<>();
        extend.add(new Job("Погода", 2));
        extend.add(new Job("Реставрация", 1));
        assertThat(rsl, is(extend));
    }

    @Test
    public void whenComparatorAscByNameAndPriority() {
        List<Job> rsl = new ArrayList<>();
        rsl.add(new Job("Кирилл", 1));
        rsl.add(new Job("Василий", 8));
        rsl.add(new Job("Сергей", 4));
        rsl.add(new Job("Михаил", 2));
        Collections.sort(rsl, new JobAscByName().thenComparing(new JobAscByPriority()));
        List<Job> extend = new ArrayList<>();
        extend.add(new Job("Василий", 8));
        extend.add(new Job("Кирилл", 1));
        extend.add(new Job("Михаил", 2));
        extend.add(new Job("Сергей", 4));
        assertThat(rsl, is(extend));
    }

    @Test
    public void whenComparatorDescByNameAndDescPriority() {
        List<Job> rsl = new ArrayList<>();
        rsl.add(new Job("Кирилл", 1));
        rsl.add(new Job("Сергей", 8));
        rsl.add(new Job("Василий", 4));
        rsl.add(new Job("Михаил", 2));
        Collections.sort(rsl, new JobDescByName().thenComparing(new JobDescByPriority()));
        List<Job> extend = new ArrayList<>();
        extend.add(new Job("Сергей", 8));
        extend.add(new Job("Михаил", 2));
        extend.add(new Job("Кирилл", 1));
        extend.add(new Job("Василий", 4));
        assertThat(rsl, is(extend));
    }
}