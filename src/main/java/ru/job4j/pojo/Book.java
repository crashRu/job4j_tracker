package ru.job4j.pojo;

public class Book {
    private String name;
    private int pageSize;

    public Book(String name, int pageSize) {
        this.name = name;
        this.pageSize = pageSize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
