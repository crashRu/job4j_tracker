package ru.job4j.poly;

public interface Transport {
    void run();

    void passengers(int count);

    double fillUp(int count);
}
