package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student vladislav = new Student();
        vladislav.setName("Владислав");
        vladislav.setSuName("Косяк");
        vladislav.setMiddleName("Ибрагимович");
        vladislav.setGroup("Хирургия");
        System.out.println(vladislav);
    }
}
