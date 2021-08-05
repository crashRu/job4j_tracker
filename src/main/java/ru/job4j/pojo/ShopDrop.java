package ru.job4j.pojo;

public class ShopDrop {
    public static Product[] delete(Product[] products, int index) {
        for (int i = 0; i < products.length - 1 - index; i++) {
            products[index + i] = products[index + 1 + i];
        }
        products[products.length - 1] = null;
        return products;
    }
}