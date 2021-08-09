package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public boolean replace(int id, Item item) {
        Item item1 = findById(id);
        int idReplace = item1.getId();
        int indexReplace = indexOf(idReplace);
        items[indexReplace] = item;
        items[indexReplace].setId(idReplace);
        return items[indexReplace].getId() == item.getId() ? true : false;
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    public Item[] findByName(String key) {
        Item[] itemsList = new Item[items.length];
        int arraysLength = 0;
        for (int i = 0; i < size; i++) {
            if (items[i].getName().equals(key)) {
                itemsList[arraysLength] = items[i];
                arraysLength++;
            }
        }
        return Arrays.copyOf(itemsList, arraysLength);
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }
}