package ru.job4j.tracker;

import java.util.Scanner;

public class StartUI {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }

    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            showMenu();
            System.out.print("Select: ");
            int select = Integer.parseInt(scanner.nextLine());
            if (select != 6) {
                System.out.println("Пользователь выбрал: " + select);
            } else {
                run = false;
            }
            if (select == 0) {
                System.out.println("Введите новую задачу");
                String item = scanner.nextLine();
                tracker.add(new Item(item));
            } else if (select == 1) {
                Item[] list = tracker.findAll();
                for (Item item1 : list) {
                    System.out.println(item1);
                }
            } else if (select == 2) {
                System.out.println("Введите ид задания:");
                int replaceId = Integer.parseInt(scanner.nextLine());
                System.out.println("Введите новое имя дела");
                String replaceName = scanner.nextLine();
                tracker.replace(replaceId, new Item(replaceName));
            } else if (select == 3) {
                System.out.println("Введите ид задания которое требуется удалить");
                int delId = scanner.nextInt();
                System.out.println(tracker.delete(delId) ? "Дело удалено" : "Ид не найден");
            } else if (select == 4) {
                System.out.println("Введите ид задания которое требуется найти");
                int findId = Integer.parseInt(scanner.nextLine());
                System.out.println(tracker.findById(findId));
            } else if (select == 5) {
                System.out.println("Введите имя задания которое требуется найти");
                String findName = scanner.nextLine();
                System.out.println(tracker.findByName(findName));
            }
        }
    }

    private void showMenu() {
        String[] menu = {
                "Add new Item", "Show all items", "Edit item",
                "Delete item", "Find item by id", "Find items by name",
                "Exit Program"
        };
        for (int i = 0; i < menu.length; i++) {
            System.out.println(i + ". " + menu[i]);
        }
    }
}