package ru.job4j.cast;

public class Flight implements Vehicle {
    @Override
    public void move() {
        System.out.println("Самолет летает по воздуху");
    }
}
