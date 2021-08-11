package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Я великий Оракул. Что ты хочешь узнать? ");
        scanner.nextLine();
        switch (new Random().nextInt(3)) {
            case (0):
                System.out.println("Yes");
                break;
            case (1):
                System.out.println("No");
                break;
            default:
                System.out.println("Может быть");
        }
    }
}
