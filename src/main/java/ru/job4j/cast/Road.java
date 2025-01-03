package ru.job4j.cast;

public class Road {
    public static void main(String[] args) {
        Vehicle flight = new Flight();
        Vehicle bus = new Bus();
        Vehicle train = new Train();
        Vehicle[] vehicles = new Vehicle[]{flight, bus, train};
        for (int i = 0; i < vehicles.length; i++) {
            vehicles[i].move();
        }
    }
}
