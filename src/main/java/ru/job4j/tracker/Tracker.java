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
        if (indexOf(id) != -1) {
            Item item1 = findById(id);
            int idReplace = item1.getId();
            int indexReplace = indexOf(idReplace);
            items[indexReplace] = item;
            items[indexReplace].setId(idReplace);
            return items[indexReplace].getId() == item.getId() ? true : false;
        }
        return false;
    }

    public boolean delete(int id) {
        if (indexOf(id) != -1) {
            int indexDel = indexOf(id);
            items[indexDel] = null;
            int length = size - indexDel - 1;
            System.arraycopy(items, indexDel, items, indexDel, length);
            items[items.length - 1] = null;
            return items[indexDel] != null ? true : false;
        }
        return false;
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    public Item[] findByName(String key) {
        Item[] result = new Item[size];
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (items[i].getName().equals(key)) {
                result[count] = items[i];
                count++;
            }
        }
        return Arrays.copyOf(result, count);
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }
}