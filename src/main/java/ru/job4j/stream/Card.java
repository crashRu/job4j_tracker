package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

enum Suit {
    Diamonds, Hearts, Spades, Clubs
}

enum Value {
    V_6, V_7, V_8
}

public class Card {
    private Suit suit;
    private Value value;

    public Card(Suit suit, Value value) {
        this.suit = suit;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Card{"
                + "suit=" + suit
                + ", value=" + value
                + '}';
    }

    public static void main(String[] args) {
       List<Card> list = Stream.of(Suit.values())
                .flatMap(val -> Stream.of(Value.values())
                        .map(suit1 -> new Card(val, suit1)))
                .collect(Collectors.toList());

       list.stream().forEach(System.out::println);
    }
}