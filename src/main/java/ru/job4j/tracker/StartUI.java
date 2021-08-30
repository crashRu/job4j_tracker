package ru.job4j.tracker;

import ru.job4j.tracker.core.*;

public class StartUI {
    UserAction[] actions = {
            new CreateAction(),
            new ShowAllAction(),
            new DeleteAction(),
            new EditAction(),
            new FindIdAction(),
            new FindNameAction()
    };

    public void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ");
            UserAction action = actions[select];
            run = action.execute(input, tracker);
        }
    }

    private void showMenu(UserAction[] actions) {
        System.out.println("Menu.");
        for (int index = 0; index < actions.length; index++) {
            System.out.println(index + ". " + actions[index].name());
        }
    }
}
