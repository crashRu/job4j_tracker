package ru.job4j.tracker;
import org.junit.Assert;
import org.junit.Test;
import ru.job4j.tracker.core.ItemAscByName;
import ru.job4j.tracker.core.ItemDescByName;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class ItemTest {
    @Test
    public void whenSortedNameMinToMax() {
        List<Item> items = new ArrayList<>();
        List<Item> expected = new ArrayList<>();
        items.add(new Item("Херня"));
        items.add(new Item("Фигня"));
        items.add(new Item("Шерсть"));
        expected.add(new Item("Фигня"));
        expected.add(new Item("Херня"));
        expected.add(new Item("Шерсть"));
        Collections.sort(items, new ItemAscByName());
        assertThat(items, is(expected));

    }

    @Test
    public void whenSortedNameMaxToMin() {
        List<Item> items = new ArrayList<>();
        List<Item> expected = new ArrayList<>();
        items.add(new Item("Херня"));
        items.add(new Item("Фигня"));
        items.add(new Item("Шерсть"));
        expected.add(new Item("Шерсть"));
        expected.add(new Item("Херня"));
        expected.add(new Item("Фигня"));
        Collections.sort(items, new ItemDescByName());
        assertThat(items, is(expected));

    }

}