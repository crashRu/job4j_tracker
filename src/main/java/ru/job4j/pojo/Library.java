package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Война и мир", 900);
        Book book2 = new Book("Золотая рыбка", 30);
        Book book3 = new Book("Сказка о братке салтане", 200);
        Book cleanCode = new Book("Clean code", 800);
        Book[] books = new Book[]{book1, book2, book3, cleanCode};
        for (int i = 0; i < books.length; i++) {
            System.out.println("Название книги :" + books[i].getName() + "Количество страниц: "
                    + books[i].getPageSize());
        }
        Book temp = books[0];
        books[0] = books[2];
        books[2] = temp;
        for (Book book : books) {
            System.out.println("Название книги :" + book.getName()
                    + "Количество страниц: " + book.getPageSize());
        }
        for (Book book : books) {
            if (book.getName().equalsIgnoreCase("Clean code")) {
                System.out.println(book.getName() + "  " + book.getPageSize());
            }
        }
    }
}
