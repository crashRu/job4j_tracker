package ru.job4j.collection.hashmap;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("parsentev@yandex.ru", "Petr Arsentev");
        map.put("info@sampx.ru", "Kirill Antokhi");
        map.put("info@inn-home.ru", "Antokhi Kirill");
        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println("Ключ: " + key + " value: " + value);
        }
    }
}