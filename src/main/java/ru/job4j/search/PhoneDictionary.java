package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<Person>();

    public ArrayList<Person> find(String key) {
        Predicate<Person> combine = (pers) -> pers.getSurname().contains(key)
                || pers.getPhone().contains(key) || pers.getAddress().contains(key)
                || pers.getName().contains(key);
        ArrayList<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }

    public void add(Person person) {
        this.persons.add(person);
    }
}