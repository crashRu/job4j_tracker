package ru.job4j.tracker.core;

import ru.job4j.tracker.Input;
import ru.job4j.tracker.Tracker;

public class ExitAction implements UserAction {
    @Override
    public String name() {
        return "ExitAction";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        return false;
    }
}
