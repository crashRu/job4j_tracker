package ru.job4j.tracker;

import org.junit.Test;
import ru.job4j.tracker.core.*;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;

public class StartUITest {

    @Test
    public void whenExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"0"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new ExitAction()
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator() +
                        "0. ExitAction" + System.lineSeparator()
        ));
    }

    @Test
    public void whenFindAllAction() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"0", "1"});
        Tracker tracker = new Tracker();
        Item firstItem = tracker.add(new Item("first item"));
        Item secondItem = tracker.add(new Item("second item"));
        UserAction[] actions = {
                new ShowAllAction(out),
                new ExitAction()
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is("Menu." + System.lineSeparator() +
                "0. === Show all items ====" + System.lineSeparator() +
                "1. ExitAction" + System.lineSeparator() +
                firstItem + System.lineSeparator() +
                secondItem + System.lineSeparator() +
                "Menu." + System.lineSeparator() +
                "0. === Show all items ====" + System.lineSeparator() +
                "1. ExitAction" + System.lineSeparator()
        ));
    }

    @Test
    public void whenFindNameAction() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"0", "first item", "1"}
        );
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("first item"));
        UserAction[] actions = {
                new FindNameAction(out),
                new ExitAction()
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(),
                is("Menu." + System.lineSeparator() +
                        "0. === Find items by name ====" + System.lineSeparator() +
                        "1. ExitAction" + System.lineSeparator() +
                        "Enter name: " + System.lineSeparator() +
                        item + System.lineSeparator() +
                        "Menu." + System.lineSeparator() +
                        "0. === Find items by name ====" + System.lineSeparator() +
                        "1. ExitAction" + System.lineSeparator()));
    }

    @Test
    public void whenFindIdAction() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
      Item item =  tracker.add(new Item("first item"));
        Input in = new StubInput(
                new String[]{"0", String.valueOf(item.getId()), "1"}
        );
        UserAction[] actions = {
                new FindIdAction(out),
                new ExitAction()
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(),
                is("Menu." + System.lineSeparator() +
                        "0. === Find item by id ====" + System.lineSeparator() +
                        "1. ExitAction" + System.lineSeparator() +
                        tracker.findById(1) + System.lineSeparator() +
                        "Menu." + System.lineSeparator() +
                        "0. === Find item by id ====" + System.lineSeparator() +
                        "1. ExitAction" + System.lineSeparator()));
    }

    @Test
    public void whenCreateItem() {
        Output out = new ConsoleOutput();
        Input in = new StubInput(
                new String[]{"0", "Item name", "1"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(out),
                new ExitAction()
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findAll()[0].getName(), is("Item name"));
    }

    @Test
    public void whenReplaceItem() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Replaced item"));
        String replacedName = "New item name";
        Input in = new StubInput(
                new String[]{"0", String.valueOf(item.getId()), replacedName, "1"}
        );
        UserAction[] actions = {
                new EditAction(new StubOutput()),
                new ExitAction()
        };
        new StartUI(new ConsoleOutput()).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()).getName(), is(replacedName));
    }

    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Deleted item"));
        Input in = new StubInput(
                new String[]{"0", String.valueOf(item.getId()), "1"}
        );
        UserAction[] actions = {
                new DeleteAction(new StubOutput()),
                new ExitAction()
        };
        new StartUI(new ConsoleOutput()).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()), is(nullValue()));
    }

    @Test
    public void whenInvalidExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"111", "0"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = new UserAction[]{
                new ExitAction()
        };
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                        "Menu." + ln
                                + "0. ExitAction" + ln
                                + "Wrong input, you can select: 0 .. 0" + ln
                                + "Menu." + ln
                                + "0. ExitAction" + ln
                )
        );
    }
}