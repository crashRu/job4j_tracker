package ru.job4j.tracker.core;

import ru.job4j.tracker.Input;
import ru.job4j.tracker.Item;
import ru.job4j.tracker.Tracker;

public class FindIdAction implements UserAction{
    @Override
    public String name() {
        return "=== Find item by id ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = input.askInt("Enter id: ");
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println(item);
        } else {
            System.out.println("Заявка с введенным id: " + id + " не найдена.");
        }
        return true;
    }
}
